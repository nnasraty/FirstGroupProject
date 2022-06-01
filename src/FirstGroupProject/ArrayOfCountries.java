package FirstGroupProject;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOfCountries {

	public static void main(String[] args) {
		//
		Scanner scan = new Scanner(System.in);
		System.out.println("Name any country");
		String value = scan.next();
	
		ArrayList<String> country = new ArrayList<String>();
		
		country.add(value);
	    while(country.size() < 4) {
	    	value = scan.next();
	    	country.add(value);
	    }
        System.out.println(country);
        
        for(int i = 0; i<country.size(); i++) {
        	if(country.get(i).contains("russia")) {
        		System.out.println(country.get(i)+" - moscow");
        	}else if(country.get(i).contains(" - america")) {
        		System.out.println(country.get(i)+" - washington");
        	}else if(country.get(i).contains("india")) {
        		System.out.println(country.get(i)+" - new delhi");
        	}else if(country.get(i).contains("uk")) {
        		System.out.println(country.get(i)+" - LONDON");
        	}else {
        		System.out.println(country.get(i)+" - Error");
        	}
        }
        
	}

}
