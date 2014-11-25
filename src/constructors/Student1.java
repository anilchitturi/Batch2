package constructors;

public class Student1 {
	int id;
	String name;
	int Age;
	public Student1(int i, String n) {
		id=i;
		name=n;
		// TODO Auto-generated constructor stub
	}
	
	public Student1(int i, String n, int age) {
		id=i;
		name=n;
		Age=age;
		// TODO Auto-generated constructor stub
	}

	void display(){
		System.out.println("value of i "+id+" value pf n "+name+" value of age "+Age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1=new Student1(111,"xyz");
		Student1 s2=new Student1(222,"abc",20);
		s1.display();
		s2.display();
		

		
		
	}

}
