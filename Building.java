
public class Building {
	protected String projectName;
	protected String completeAddress;
	protected double totalSquarefeet;
	protected String occupancyGroup;
	protected String subgroup;
	
	public Building (){
		this.projectName="";
		this.completeAddress="";
		this.totalSquarefeet=0.0;
		this.occupancyGroup="";
		this.subgroup="";
	}

	public Building(String projectName, String completeAddress, double totalSquarefeet, String occupancyGroup, String subgroup) {
		this.projectName=projectName;
		this.completeAddress=completeAddress;
		this.totalSquarefeet=totalSquarefeet;
		this.occupancyGroup=occupancyGroup;
		this.subgroup=subgroup;
	}
	public void draw() {
		System.out.println("Drawing code for building"+this.getClass().getSimpleName());
	}
	public String displayData() {
		String srt="";
		srt+= "Project Name: "+ projectName + "\n Address" + completeAddress + "\nSquare feet: "+ totalSquarefeet +"\n Occupancy Group: " + occupancyGroup + "\n Sub Group: "+subgroup;
		return srt;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCompleteAddress() {
		return completeAddress;
	}

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}

	public double getTotalSquarefeet() {
		return totalSquarefeet;
	}

	public void setTotalSquarefeet(double totalSquarefeet) {
		this.totalSquarefeet = totalSquarefeet;
	}

	public String getOccupancyGroup() {
		return occupancyGroup;
	}

	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}

	public String getSubgroup() {
		return subgroup;
	}

	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}
	
}
	
	

