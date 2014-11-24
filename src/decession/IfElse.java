package decession;

public class IfElse {

	/*
	 * for(initialization; Boolean_expression; update)
	 *	{
     *   //Statements
	 * }
	 */
	public static void main(String args[]) {
	      double[] myList = {1.9, 2.9, 3.4, 3.5};


	      for(int i=0; i < myList.length; i++) {
	          System.out.print("value of lopVal : " + i );
	         System.out.print("\n");
	         if(myList[i]==3.4){
	         System.out.print("match : " + i );
	         }else if(myList[i]==3.5){
		         System.out.print("not match : " + i );

	         }else{
		         System.out.print("not match : " + i );

	         }
	      }
	   }
}
