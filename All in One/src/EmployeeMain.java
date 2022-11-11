import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeMain {

	public static void main(String[] args) {
		String str = "1,pankaj,1999-11-10";
		String[] strSplit = str.split(",");
		Employee emp = new Employee();
		emp.setId(Integer.parseInt(strSplit[0]));
		emp.setName(strSplit[1]);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-dd-MM");
		Date convertedDate = null;
		try {
			convertedDate = sdf.parse(strSplit[2]);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		emp.setDob(convertedDate);
		System.out.println(emp);

	}

}
