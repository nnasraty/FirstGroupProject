package FirstGroupProject;

public class sumOddAndEvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int even =0;
		int odd = 0;
		int [][]arr = {
				{4, 6, 7, 12 },
				{23, 7, 9, 10,5,7,9},
				{4, 6, 21,1,2}};
		for(int i =0 ; i<arr.length; i++) {
			for(int j =0; j<arr[i].length; j++) {
				if(arr[i][j] % 2 == 0) {
					even+=arr[i][j];
				}else {
					odd+=arr[i][j];
				}
			}
		}
		System.out.println("sum of even numbers = "+even);
		System.out.println("sum of odd numbers = "+odd);

	}

}
