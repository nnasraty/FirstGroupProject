package FirstGroupProject;

public class oddAndEven2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	
		int [][]arr1 = {
				{4, 6, 7, 12 },
				{23, 7, 9, 10,5,7,9},
				{4, 6, 21}};
		for(int i =0 ; i<arr1.length; i++) {
			for(int j =0; j<arr1[i].length; j++) {
				if(arr1[i][j] % 2 != 0) {
					System.out.println(arr1[i][j]);
				}
			}
		}
	}

}
