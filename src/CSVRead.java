import java.io.FileReader;
import java.util.Arrays;
import com.opencsv.CSVReader;

public class CSVRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			CSVReader reader = new CSVReader(new FileReader("C:/Users/plansis/Downloads/arquivo.csv"));
		     String [] nextLine;
		     while ((nextLine = reader.readNext()) != null) {
		        // nextLine[] is an array of values from the line
		        if(nextLine != null)
		        {
		    	 System.out.println(nextLine[0] + nextLine[1] + "etc...");
		        }
		     }
		}catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Leitura completa");
	}

}
