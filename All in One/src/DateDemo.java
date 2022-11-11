import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) throws ParseException {

		String dob = "1999/02/02";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/dd/MM");
		Date convert = sdf.parse(dob);
		System.out.println("converted " + convert);

	}

}
