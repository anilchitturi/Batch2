package javaStrings;

public class StrBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder  sb=new StringBuilder("Hello");
        sb.append("java");
		 System.out.println(sb);
		 sb.insert(1, "xyz");
		 System.out.println(sb);
	}

}
