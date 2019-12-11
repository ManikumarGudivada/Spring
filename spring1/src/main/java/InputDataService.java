import java.util.ArrayList;
import java.util.List;

public class InputDataService {
	public static List<InputData> lstinput=new ArrayList<InputData>();
	
	

	@Override
	public String toString() {
		return "InputDataService [retriveData()=" + retriveData() + "]";
	}

	public void addToList(InputData data) {
		lstinput.add(data);
		
	}
	
	public List<InputData> retriveData()
	{
		return lstinput;
	}

	
	
}
