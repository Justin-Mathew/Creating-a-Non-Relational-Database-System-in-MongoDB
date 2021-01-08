package mongoDB;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

//import com.google.gson.Gson;
import mongoDB.building;
import com.google.gson.*;

public class importcsv {

	static ArrayList<buildingMongo> buildingRecords = new ArrayList<buildingMongo>();

	// reads the csv file and stores it to an array list
	// arraylist is converted to json file with the the help of GSON library
	public static void readcsv(File file) throws IOException {

		buildingMongo buildingObj = null;
		accessibility Accessibility = null;
		facilities Bicycle_Shower_facilities = null;
		location Location = null;
		// System.out.println(buildingObj);

		FileReader fReader = new FileReader(file);
		BufferedReader bReader = new BufferedReader(fReader);
		String record;
		bReader.readLine();
		while ((record = bReader.readLine()) != null) {
			String[] value = record.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);

			buildingObj = new buildingMongo(Integer.parseInt(value[0]), Integer.parseInt(value[1]),
					Integer.parseInt(value[2]), Integer.parseInt(value[3]), value[5], value[6],
					Integer.parseInt(value[9]), value[10]);

			if (!(value.length < 5)) {
				if (value[4] != null) {
					buildingObj.setbuildingName(value[4]);
				}

				if (!(value.length < 8)) {
					if (value[7] != null && !value[7].isEmpty()) {
						buildingObj.setconstructionYear(Integer.parseInt(value[7]));
					} else {
						buildingObj.setconstructionYear(-1);

					}
					if (!(value.length < 9)) {
						if (value[8] != null && !value[8].isEmpty()) {
							buildingObj.setRefurbishedYear(Integer.parseInt(value[8]));
						} else {
							buildingObj.setRefurbishedYear(-1);

						}

					}
				}
			}

			// buildingRecords.add(buildingObj);
			Accessibility = new accessibility();
			if (!(value.length < 14)) {
				if (!(value.length < 12)) {
					if (value[11] != null) {
						Accessibility.setaccessibilityType(value[11]);

					}
					if (!(value.length < 13)) {
						if (value[12] != null) {
							Accessibility.setaccessibilityTypeDescp(value[12]);

						}
						if (!(value.length < 14)) {
							if (value[13] != null && !value[13].isEmpty()) {
								Accessibility.setaccessibilityRating(Integer.parseInt(value[13]));
							} else {
								Accessibility.setaccessibilityRating(-1);
							}

						}
					}
				}
			}

			Bicycle_Shower_facilities = new facilities();
			if (!(value.length < 15)) {
				if (value[14] != null && !value[14].isEmpty()) {
					Bicycle_Shower_facilities
							.setbicycleSpaces(Integer.parseInt(value[14].replace(",", "").replace("\"", "")));
				} else {
					Bicycle_Shower_facilities.setbicycleSpaces(-1);

				}
				if (!(value.length < 16)) {
					if (value[15] != null && !value[15].isEmpty()) {
						Bicycle_Shower_facilities.sethasShower(Integer.parseInt(value[15]));

					} else {
						Bicycle_Shower_facilities.sethasShower(-1);

					}
				}
			}

			Location = new location();
			if (!(value.length < 17)) {
				if (value[16] != null && !value[16].isEmpty()) {
					Location.setXcoordinates(Double.parseDouble(value[16]));

				} else {
					Location.setXcoordinates(-1);
				}
				if (!(value.length < 18)) {
					if (value[17] != null && !value[17].isEmpty()) {
						Location.setYcoordinates(Double.parseDouble(value[17]));
					} else {
						Location.setYcoordinates(-1);
					}
					if (!(value.length < 19)) {
						if (value[18] != null) {
							Location.setLocation(value[18]);
						}
					}
				}
			}

			// accessibilityRecords.add(Accessibility);
			buildingObj.setaccessibilityObj(Accessibility);
			buildingObj.setBicycle_Shower_Facilities(Bicycle_Shower_facilities);
			buildingObj.setLocation(Location);
			buildingRecords.add(buildingObj);

		}

		// buildingObj.setaccessibilityObj(Accessibility);
		// System.out.println(buildingObj);

		Gson gson = new Gson();
		Writer writer = new FileWriter("buildings.json");
		gson.toJson(buildingRecords, writer);
		// System.out.println(buildingObj);

		bReader.close();
		writer.close();
	}

	public static void main(String[] args) {

		File file = new File("buildings.csv");
		try {
			readcsv(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}