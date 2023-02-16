
public class SingleFamilyHome extends Residential{
private boolean garage;

public SingleFamilyHome() {
	super();
	garage = false;
}
public SingleFamilyHome(String projectName, String completeAddress, double totalSquarefeet, String occupancyGroup, 
		String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) {
	
	super(projectName ,completeAddress, totalSquarefeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
	
	this.garage=garage;
	
}
public void draw() {
	System.out.println("Drawing code for building"+this.getClass().getSimpleName());

}
public String displayData() {
	String srt="";
	srt+= super.toString() + "\n Garage " + ((garage == true)? "Yes" : "No");
	return srt;
	
}
public boolean isGarage() {
	return garage;
}
public void setGarage(boolean garage) {
	this.garage = garage;
}


}
