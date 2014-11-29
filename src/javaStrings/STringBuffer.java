package javaStrings;

public class STringBuffer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer  sb=new StringBuffer("Hello");
        sb.append("java");
		 System.out.println(sb);
		 sb.insert(1, "xyz");
		 System.out.println(sb);
	}
	

}
