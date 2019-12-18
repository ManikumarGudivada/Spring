import java.util.ArrayList;
import java.util.List;

public class InputDataService {
	public static List<InputData> lstinput=new ArrayList<InputData>();
	
	

	/*
	 * @Override public String toString() { return
	 * "InputDataService [retriveData()=" + retriveData() + "]"; }
	 */

	public void addToList(InputData data) {
		InputData serial=new InputData(lstinput.size());
//		serial.setSlNo(serial.getSlNo()+1);
		lstinput.add(data);
		
	}
	
	public List<InputData> retriveData()
	{
		return lstinput;
	}

	
	
}
