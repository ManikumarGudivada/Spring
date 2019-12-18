import java.util.ArrayList;

public class InputData {
	int SlNo;
	static int temp=0;
	String FirstName;
	String LastName;
	String Company;
	String Place;
	
	public InputData(int i) {
		temp=temp+1;
		this.SlNo=temp+i;
	}
	public InputData() {
		// TODO Auto-generated constructor stub
	}
	public int getSlNo() {
		return SlNo;
	}

	public void setSlNo(int slNo) {
		SlNo = slNo;
	}
	
	  @Override public String toString() { 
		 String sttemp=SlNo+","+FirstName+","+ LastName+","+ Company+","+ Place ;
		  return  sttemp; 
		  }
	 

	
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public String getPlace() {
		return Place;
	}
	public void setPlace(String place) {
		Place = place;
	}
	
}
