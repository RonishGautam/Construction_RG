
public class Business extends Building {
	protected int numRentableUnits;
	
	
	public Business() {
		super();
		numRentableUnits=0;
	}
	public Business(String projectName, String completeAddress, double totalSquarefeet, String occupancyGroup, String subgroup, int numRentableUnits) {
		super(projectName, completeAddress, totalSquarefeet, occupancyGroup, subgroup);
		this.numRentableUnits=numRentableUnits;
	}
	public String toString() {
		return super.displayData()+ "\n Num Rentable Units" + numRentableUnits;
	}
	
	
	public int getNumRentableUnits() {
		return numRentableUnits;
	}
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}
	
}