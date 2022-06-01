package FirstGroupProject;

public class TwoDsumOfAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]arr = {
				{4, 6, 7, 12 },
				{23, 7, 9, 10,5,7,9},
				{4, 6, 21}};
				int sum =0;
				for(int i=0; i<arr.length; i++) {
					for(int j=0; j<arr[i].length; j++) {	
					sum+=arr[i][j];
					}
				}
				
				System.out.println(sum);
				
				
		
		
	}

}
