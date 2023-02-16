
public class Apartment extends Residential{
	
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;

	public Apartment() {
		super();
		this.numRentableUnits=0;
		this.avgUnitSize=0.0;
		this.parkingAvailable=true;
	}
	public Apartment(String projectName, String completeAddress, int totalSquarefeet, String occupancyGroup,
			String subgroup, int numBathrooms, int numBedrooms, boolean laundryRoom, int numRentableUnits, double avgUnitSize, boolean parkingAvailable) {
		
		super(projectName ,completeAddress, totalSquarefeet, occupancyGroup, subgroup, numBathrooms, numBedrooms, laundryRoom);
		
		this.numRentableUnits=numRentableUnits;
		this.avgUnitSize=avgUnitSize;
		this.parkingAvailable=parkingAvailable;
		
	}
	
	public void draw() {
		System.out.println("Drawing code for building"+this.getClass().getSimpleName());

	}
	
	public String displayData() {
		String str="";
	str += super.displayData()+ "\n Num Rentable Units" + numRentableUnits + "\n Avg Unit Size" + avgUnitSize + "\n Parking Avilable" + ((parkingAvailable==true) ? "Y" : "N");
	return str;
	}
	
	public int getNumRentableUnits() {
		return numRentableUnits;
	}
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}
	public double getAvgUnitSize() {
		return avgUnitSize;
	}
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}
	public boolean isParkingAvailable() {
		return parkingAvailable;
	}
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}
	
	
}

