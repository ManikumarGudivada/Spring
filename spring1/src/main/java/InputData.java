import java.util.ArrayList;

public class InputData {
	String FirstName;
	String LastName;
	String Company;
	String Place;
	
	
	  @Override public String toString() { 
		 String temp=FirstName+","+ LastName+","+ Company+","+ Place ;
		  return  temp; 
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
