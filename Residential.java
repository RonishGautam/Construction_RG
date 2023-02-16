
public class Residential extends Building {
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	
	public Residential() {
		super();
		this.numBedrooms=0;
		this.numBathrooms=0;
		this.laundryRoom=false;
	}
	public Residential(String projectName, String completeAddress, double totalSquarefeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom) {
		super(projectName, completeAddress, totalSquarefeet, occupancyGroup, subgroup);
		this.numBedrooms= numBedrooms;
		this.numBathrooms=numBathrooms;	
		this.laundryRoom=laundryRoom;
	}
	
	public String toString() {
		return super.displayData()+"\n Num Bedrooms: "+ numBedrooms + "\n numBathrooms" + numBathrooms + " \nLaundry Room: " + ((laundryRoom== true) ? "Yes" : "No");
	}
	
	public int getNumBedrooms() {
		return numBedrooms;
	}
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}
	public int getNumBathrooms() {
		return numBathrooms;
	}
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}
	public boolean isLaundryRoom() {
		return laundryRoom;
	}
	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}
	
	

}
