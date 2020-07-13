package SimpleMethodforDate;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Dateformatter {
	
	public static void main(String[] args) throws ParseException  
	{
	   
		// define date source format 
	    
		SimpleDateFormat sourceformat = new SimpleDateFormat("dd-MM-yyyy");
	   
		// define date target format that you want to convert to it 
	    
		SimpleDateFormat targetformat = new SimpleDateFormat("MM:dd:yyyy");
	  
	  // parse the input date as string with source format 
	  // and then format it to the required target format 
	    
		String dateAsString = "04-01-2015";
	    Date date = sourceformat.parse(dateAsString);
	    System.out.println(targetformat.format(date));

}
	
}
