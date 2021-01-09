package mongoDB;
// class to store accessibility features of the building.
public class accessibility {
	
	public String accessibilityType, accessibilityTypeDescp;
	public int accessibilityRating;
	
	public accessibility() {
		
	}

	
	public String getaccessibilityType() {
		return accessibilityType;
	}

	public String getaccessibilityTypeDescp() {
		return accessibilityTypeDescp;
	}

	public int getaccessibilityRating() {
		return accessibilityRating;
	}
	public void setaccessibilityType(String accessibilityType) {
		this.accessibilityType = accessibilityType;
	}

	public void setaccessibilityTypeDescp(String accessibilityTypeDescp) {
		this.accessibilityTypeDescp = accessibilityTypeDescp;
	}

	public void setaccessibilityRating(int accessibilityRating) {
		this.accessibilityRating = accessibilityRating;
	}
}
