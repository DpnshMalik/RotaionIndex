package uzio;

public class practice {

	
	private static int getRotatedELementIndex(int arr[],int size) {
		
		int low = 0;
		int high = size - 1;
		
		while(low < high) {
			int middle = low + (high - low)/2;
			
			if(arr[middle] > arr[high]) {
				low = middle + 1;
			}
			else {
				high = middle - 1;
			}
		}
		return low;
	}
	
	
	public static void main(String[] args) {

		int arr[] = {3,1,4,5,6,7};
		int result = getRotatedELementIndex(arr,6);
		System.out.println("result is " + result);
	}

}
