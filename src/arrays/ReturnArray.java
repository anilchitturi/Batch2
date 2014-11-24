package arrays;

public class ReturnArray {

	 public static void main(String[] args) {
		int[] finalArray = reverse(new int[]{3, 1, 2, 6, 4, 2});
	System.out.println(finalArray);	
	 }
	 
	public static int[] reverse(int[] list) {
		  int[] result = new int[list.length];

		  for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
		    result[j] = list[i];
			System.out.println( result[j]);	

		  }
		  return result;
		}

}
