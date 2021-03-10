import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
public class CompareCSV {
	public static void main(String args[]) throws FileNotFoundException, IOException
	{
		
		ArrayList array1=new ArrayList();
		ArrayList array2=new ArrayList();
	    BufferedReader CSVFile1 = new BufferedReader(new FileReader("D:/csv/expected.csv"));
		String file1 = CSVFile1.readLine();
		while (file1 != null)
		{
			String[] data1 = file1.split(",");
			for (String item1:data1)
			{ 
				array1.add(item1);
			}

			file1 = CSVFile1.readLine(); 
		}

		CSVFile1.close();

		BufferedReader CSVFile2 = new BufferedReader(new FileReader("D:/csv/actual.csv"));
		String file2 = CSVFile2.readLine();
		while (file2 != null)
		{
			String[] data2 = file2.split(",");
			for (String item2:data2)
			{ 
				array2.add(item2);

			}
			file2 = CSVFile2.readLine(); // Read next line of data.
			
		}
		CSVFile2.close();
		
			for(Object bs:array1) {
			array2.remove(bs);
	}
		int size=array2.size();	
	     if(size==0) {
	    	 System.out.println("Everything is matched");
	    	 
	     }
	     else {
	    	 System.out.println("Items which are different in actualfile: "+size);
	    	 while(size!=0)
	            {
	                size--;
	    	 System.out.println(array2.get(size));}
	     }
	    
         
	     
	}
}



