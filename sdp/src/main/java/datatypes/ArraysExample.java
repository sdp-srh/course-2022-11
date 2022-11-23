package datatypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraysExample {
	
	   public static void main(String[] args) throws NumberFormatException, IOException {
	        String[] strArr = {"One","Two","Three"};
	        String[] strArr1 = new String[3];
	        strArr1[0] = "1";
	        strArr1[1] = "two";
	        strArr1[2] = "3";
	        String[] strArr2 = null;
	        System.out.println("Array elements are:");
	        // Iterate over array
	        for (int i=0;i<strArr.length;i++)
	        {
	            System.out.println(strArr[i]);
	        }
	        for (int i=0;i<strArr1.length;i++)
	        {
	            System.out.println(strArr1[i]);
	        }
	        System.out.println("Please enter a number - ");
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int numberOfElements = Integer.parseInt(br.readLine());
	        
	        strArr2 = new String[numberOfElements];
	        for (int i=0;i<strArr2.length;i++)
	        {
	        	System.out.println("Enter element at index ["+i+"]");
	        	strArr2[i] = br.readLine();
	        }
	        for (int i=0;i<strArr2.length;i++)
	        {
	            System.out.println(strArr2[i]);
	        }
	       
	        //System.out.println("====================");
	        //System.out.println("Printing array elements using Arrays.toString():");
	        //System.out.println("====================");
	        // You can also use Arrays.toString() to print an array
	        //System.out.println(Arrays.toString(strArr));
	    }

}
