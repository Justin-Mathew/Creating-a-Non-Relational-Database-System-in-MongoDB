package mongoDB;
// main building class to store all the bulding data.
public class buildingMongo {
	public int censusYear, blockId, propertyId, basepropertyId, constructionYear, RefurbishedYear, numberFloors;
	public String buildingName, streetAddress, suburb, preSpaceuse;

// initializing accessibility location and facilities to create an embedded structure.
	public accessibility Accessibility;
	public location location;
	public facilities Bicycle_Shower_Facilities;

	public buildingMongo(int censusYear, int blockId, int propertyId, int basepropertyId, String streetAddress, String suburb,
			int numberFloors, String preSpaceuse ){
		this.censusYear = censusYear;
		this.blockId = blockId;
		this.propertyId = propertyId;
		this.basepropertyId = basepropertyId;
		this.streetAddress = streetAddress;
		this.suburb = suburb;
		this.numberFloors = numberFloors;
		this.preSpaceuse = preSpaceuse;

	}

// getters methods
	public int getcensusYear() {
		return censusYear;
	}

	public int getblockId() {
		return blockId;
	}

	public int getpropertyId() {
		return propertyId;
	}

	public int getpbasepropertyId() {
		return basepropertyId;
	}

	public String getbuildingName() {
		return buildingName;
	}

	public String getstreetAddress() {
		return streetAddress;
	}

	public String getsuburb() {
		return suburb;
	}

	public int getconstructionYear() {
		return constructionYear;
	}

	public int getRefurbishedYear() {
		return RefurbishedYear;
	}

	public int getnumberFloors() {
		return numberFloors;
	}

	public String getpreSpaceuse() {
		return preSpaceuse;
	}

	public accessibility getaccessibilityObj() {
		return Accessibility;
	}

	public location getLocation() {
		return location;
	}

	public facilities getBicycle_Shower_Facilities() {
		return Bicycle_Shower_Facilities;
	}

	public void setbuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public void setstreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public void setsuburb(String suburb) {
		this.suburb = suburb;
	}

	public void setconstructionYear(int constructionYear) {
		this.constructionYear = constructionYear;
	}

	public void setRefurbishedYear(int RefurbishedYear) {
		this.RefurbishedYear = RefurbishedYear;
	}

	public void setpreSpaceuse(String preSpaceuse) {
		this.preSpaceuse = preSpaceuse;
	}

	public void setaccessibilityObj(accessibility Accessibility) {
		this.Accessibility = Accessibility;
	}

	public void setLocation(location location) {
		this.location = location;
	}

	public void setBicycle_Shower_Facilities(facilities Bicycle_Shower_Facilities) {
		this.Bicycle_Shower_Facilities = Bicycle_Shower_Facilities;
	}

}
