package FirstGroupProject;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,4,6,2,7,8,9};
		boolean flag = false;
		for(int i =0; i<arr.length;i++) {
			  for(int j = 2; j<=arr[i]/2; j++) {
				  if(arr[i] % j == 0) {
					  flag = true;
				  }
			  }
			  if(flag == true) {
					System.out.println(arr[i]+" is not a prime number");
				}else {
					System.out.println(arr[i]+" is a prime number");
				}
			  flag = false;
		}

	}

}
