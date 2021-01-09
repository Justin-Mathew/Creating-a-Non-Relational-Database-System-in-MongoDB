# Creating-a-Non-Relational-Database-System-in-MongoDB

# Index:
This repository holds Non-Relational Database System project.

# Objective:
The objective is to create a Non-Relational database system in MongoDB.

# Non-Relational database systems:
Mongo Db is a No Sql database that deals with object, so java was used to manipulate these
objects in order to make the desired structure.

# About the data set:
 The dataset can be downloaded from the link:
 https://data.melbourne.vic.gov.au/Property/Buildings-with-name-age-size-accessibility-and-bic/pmhb-s6pn
 
 The dataset consists of 19 columns. It represents different building attributes including location, construction year, refurbished year, number of floors, predominant space use, bicycle/shower facilities and building accessibility data.
 
 # Sructure of MongoDB database:
 ![](Images/structure%20of%20mongodb%20database.png)
 

1. Enormalized/Embedded data model was used to structure the dataset.
2. In embedded data model related attributes are stored together that are embedded in the
same document.
3. In the dataset used we have accessibility details stored together as an accessibility
object.
4. Similarly, location and bicycle shower facilities are stored together.
5. The json file was used to import the dataset into mongo with the help of mongo
import command.
 
 # Data Preperation:

1. The structure of the database was created with the help of a java program.
2. The building csv file was read and the values of each filed was loaded into
appropriate objects.
3. Four objects were created building object, accessibility object, location object and
bicycle and shower facilities object.
4. All the objects were combined to the main building object in order to get a single
main building object.
5. Building object was then stored in an array list.
6. With the help of GSON library the array list was converted into a json file.

# Importing data to MongoDB:
1. Generated the json file by runninig import csv file.
![](Images/run%20importcsv.png)
2. Download MongoDB and mongo db tools from the link
https://www.mongodb.com/try/download/community
https://www.mongodb.com/try/download/database-tools
3. Install MongoDB.
4. Run command prompt as admin.
5. Run mongod command
![](Images/run%20mongoD.png)
6. Run mongo
![](Images/run%20mongo.png)
7. Create a new database using the command <br />
use building
![](Images/create%20database.png)
8. Create a new collection using the command<br />
db.createCollection("buildingcollection");
![](Images/create%20collection.png)
9. To import json file in mongo database use command<br />
mongoimport --db building --collection buildingcollection --jsonArray --file "C:\Users\Justin Mathew\Downloads\buildings.json"
![](Images/run%20mongo%20import.png)

# Queries:

### 1. Query to find the all the records where building name is RMIT and accessibility rating is equal to 3.

db.buildingcollection.find({buildingName: "RMIT","Accessibility.accessibilityRating":3}).pretty()

### 2. Query to find all the records of building name that ranges between J and V where bicycle and shower facilities is not null.

db.buildingcollection.find({buildingName: {$gte:"J",$lte:"V"},"Bicycle_Shower_Facilities.hasShower":{
$gte : 0 },"Bicycle_Shower_Facilities.bicycleSpaces": 1800}).pretty()

### 3. Query to find all the records where census year = 2018, construction year >= 1950 and refurbished year is equal to 2018.

db.buildingcollection.find({"Accessibility.accessibilityRating":{$ne: -1 },"censusYear" : 2018 ,
"constructionYear" : {$gte : 1950}, "RefurbishedYear" : {$gte: 2018}}).pretty()

### 4. Query to find all the records where accessibility rating = 3, census year = 2018, construction year >= 2015 and bicycle and shower facilities is not null.

db.buildingcollection.find({"Accessibility.accessibilityRating": 3,"censusYear" : 2018 , "constructionYear"
: {$gte : 2015},"Bicycle_Shower_Facilities.hasShower":{ $gt: 0
},"Bicycle_Shower_Facilities.bicycleSpaces":{ $ne: -1 }}).pretty()

# Conclusion:
Database in MongoDB was creating by generating a json file from csv file using java program. Json file was then imported into mongodb using the mongo import commands.Finally, queries were written to access data.


