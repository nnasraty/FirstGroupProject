package FirstGroupProject;

import java.util.Scanner;

public class FirstTask {

	public static void main(String[] args) {
		// Using Scanner create an array of integer values. After the 
		//Array is created, calculate the sum of all stored elements in that array.
		
		Scanner scan =new Scanner(System.in);
		
		int arr[]=new int[5];
		System.out.println("Enter the elements of array of int values: ");
		int sum=0;
		
		for (int i=0; i<arr.length; i++) {
		arr[i]=scan.nextInt();
		sum=sum+arr[i];
		
		}
		System.out.println("The sum of all stored elements are "+sum);
		
		

	}

}
