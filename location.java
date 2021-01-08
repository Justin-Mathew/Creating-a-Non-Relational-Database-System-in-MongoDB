package mongoDB;

public class location {
	public double Xcoordinates, Ycoordinates;
	public String Location;

	public location() {
		

	}
	
	
	public double getXcoordinates() {
		return Xcoordinates;
	}

	public double getYcoordinates() {
		return Ycoordinates;
	}

	public String getLocation() {
		return Location;

	}
	public void setXcoordinates(double Xcoordinates) {
		this.Xcoordinates = Xcoordinates;
	}

	public void setYcoordinates(double Ycoordinates) {
		this.Ycoordinates = Ycoordinates;
	}

	public void setLocation(String Location) {
		this.Location = Location;
	}
}
