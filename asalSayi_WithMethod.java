package day98;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class asalSayi_WithMethod {

	static boolean test= false;
	
	public static void main(String[] args) {
		int num=1;
		List<Integer> list= new ArrayList<>();
		int kontrol = 3;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter an integer");
		int max= scan.nextInt();
		
		
		if(max<2) {
			System.out.println("please enter an integer bigger than 2");
		}

		list.add(2);
		

		for (kontrol=3 ; kontrol<max ; kontrol++) {
			asal(kontrol);
			if(test == true) {
				list.add(kontrol);
			}
		}
		
		System.out.println("There are  " + list.size() + " prime integer smaller than " + max);	
		System.out.println(list);


	}		// end of main method
	
		public static boolean asal(int num) {
					
		boolean temp = true;
		
		for (int i =2 ; i<num ; i++ ) {
			if (num%i == 0 ) {
				temp= false;
			}
		}
		test=temp ;
//		System.out.println("temp=" + temp);
//		System.out.println("test=" + test);
		return test;
		}
	

}			// end of class
