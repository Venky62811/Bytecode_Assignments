package Assignment3;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr ={1,2,3,4,5,6,7} ;
		int k = 3;
		
		int n = arr.length;
		k = k % n ;
		
		int[] rotatedArray = new int[n];
		for (int i = 0; i <n ; i++) {
			rotatedArray[(i+k) %n] = arr[i ];	
			
		}
		for (int i = 0; i <n ; i++) {
			System.out.print(" "+rotatedArray[i] );
			
		}

	}
}

