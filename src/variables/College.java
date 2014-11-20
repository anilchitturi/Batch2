package variables;

public class College {
	// salary variable is a private static variable
	private static int resultPercent;

	// DEPARTMENT is a constant
	public static final String BRANCH = "Computer Science";

	public static void main(String args[]) {
		resultPercent = 76;
		System.out.println(BRANCH + " Result %:" + resultPercent);
	}
}
