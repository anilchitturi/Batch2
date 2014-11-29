package javaStrings;

public class StringConcat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrCompare();
	}
	
	public static void StrConcat(){
		 String s="java";
		 System.out.println(s);
		s= s.concat("world");
		 System.out.println(s);
	}
	
	public static void StrCompare(){
		 String s="java";
		 String s2="JAVA";
		 System.out.println(s.equalsIgnoreCase(s2));
		 System.out.println(s==s2);
		 System.out.println(s.compareTo(s2));
	}

}
