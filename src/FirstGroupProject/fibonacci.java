package FirstGroupProject;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[10];
		array[0] = 1;
		array[1] = 1;
		System.out.println(array[0]);
		System.out.println(array[1]);
		for(int i = 2; i<array.length; i++) {
			array[i] = array[i-2] + array[i-1];
			System.out.println(array[i]);
		}

	}

}
