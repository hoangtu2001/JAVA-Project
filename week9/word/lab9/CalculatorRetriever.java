package week9.word.lab9;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class CalculatorRetriever
{
	private static ArrayList<Calculator> calc_List = new ArrayList<Calculator>();
	public static void Set_Calculator(File FileChooser_selectedFile) throws IOException
	{	
	    ArrayList<Calculator> calculatorList = new ArrayList<Calculator>();
	    String url;
	    Scanner fileScan, urlScan;
		fileScan = new Scanner(FileChooser_selectedFile);
	    int count=0;
	    int input1 =0;
	    int input2 =0;
	    int input3 =0;
	    while (fileScan.hasNext())
	    {
	        url = fileScan.nextLine();
	        System.out.println("URL: " + url);

	        urlScan = new Scanner(url);
	        urlScan.useDelimiter(" ");
	        count =0;	        
	        while (urlScan.hasNext())
	        {
	        	count++;
	        	if (count==1)
	        		input1 = Integer.parseInt(urlScan.next());
	        	if (count==2)
	        		input2 = Integer.parseInt(urlScan.next());
	        	if (count==3)	        		
	        		input3 = Integer.parseInt(urlScan.next());
	        }
	        
	        if (count ==2)
	        	calculatorList.add(new Calculator(input1, input2));
	        else 
	        	if (count ==3)
	        		calculatorList.add(new ScientificCalculator(input1, input2));
	        
	        System.out.println();
	    }
	   	    
	    calc_List = calculatorList;
	}

	public static ArrayList<Calculator> Get_Calculator()
	{
		return calc_List;
	}
	
}
