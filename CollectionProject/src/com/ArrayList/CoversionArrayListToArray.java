package com.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CoversionArrayListToArray {

	public static void main(String[] args) {
			String subject[]= {"English","Math","Computer","Science"};
			System.out.println(subject);
			
			// 1st Way
			// as List
			List<String> sub= Arrays.asList(subject);
			System.out.println(sub);
			
			// 2nd Way
			List<String> sub1 = new ArrayList<>(Arrays.asList(subject));
			System.out.println(sub1);
			
			// 3rd Way
			// Collections.addAll : Faster Way
			ArrayList<String> sub3= new ArrayList<>();
			Collections.addAll(sub3, subject);
			System.out.println(sub3);
			
			Collections.addAll(sub3,"Hindi","Sanskrit");
			System.out.println(sub3);
			
			System.out.println("_______________________________________________");
			
			// Coverting arraylist into array
			
			Object subArray[]=sub3.toArray();
			System.out.println(Arrays.toString(subArray));
			
			/*for(int i=0;i<subArray.length;i++)
			{
				subArray[i]=subArray[i].concat("Subject");
			}*/
			
			// Array to be type Safe
			
			String subArray1[]=new String[sub3.size()];
			sub3.toArray(subArray1);
			System.out.println(Arrays.toString(subArray1));
			for(int i=0; i<subArray1.length;i++)
			{
				subArray1[i]=subArray1[i].concat("Subject");
				
			}
			
	}

}
