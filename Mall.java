
public class Mall extends Business {
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	
	public Mall() {
		super();
		this.numRentedUnits=0;
		this.medianUnitSize=0.0;
		this.numParkingSpaces=0;
	}
	public Mall( String projectName, String completeAddress, int totalSquarefeet, String occupancyGroup, String subgroup, int numRentableUnits, 
			int numRentedUnits, double medianUnitSize, int numParkingSpaces) {
		super(projectName, completeAddress, totalSquarefeet, occupancyGroup, subgroup, numRentableUnits);
		this.numRentedUnits=numRentedUnits;
		this.medianUnitSize=medianUnitSize;
		this.numParkingSpaces=numParkingSpaces;
		
	}
	public void draw() {
		System.out.println("Drawing code for building"+ this.getClass().getSimpleName());

	}
	public String displayData() {
		String str="";
		str += super.toString()+ "\n Num Rented Units"+ numRentedUnits + "\n Median Unit Size " + medianUnitSize + "\n Num of Parking Spaces " + numParkingSpaces;
		return str;
	}
	public int getNumRentedUnits() {
		return numRentedUnits;
	}
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}
	public double getMedianUnitSize() {
		return medianUnitSize;
	}
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}
	
}
