package mongoDB;
//  class to store features like bicycle facilities and shower facilities.
public class facilities {
	public int bicycleSpaces, hasShower;

	public facilities() {
	}

	public int getbicycleSpaces() {
		return bicycleSpaces;
	}

	public int gethasShower() {
		return hasShower;
	}
	public void setbicycleSpaces(int bicycleSpaces) {
		this.bicycleSpaces = bicycleSpaces;
	}

	public void sethasShower(int hasShower) {
		this.hasShower = hasShower;
	}
}
