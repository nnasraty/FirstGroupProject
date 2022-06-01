package FirstGroupProject;

public class maximumAndminimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array2 = {2,5,8,11,50,7,1};
		int max = array2[0];
		int min = array2[0];
		for(int i =0; i<array2.length; i++) {
			if(max < array2[i]) {
				max = array2[i];
			}
			if(min> array2[i]) {
				min = array2[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);

	}

}
