package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollections3 {

	public static void main(String[] args) {

	Student s1=new Student(101,"A",20);
	Student s2=new Student(102,"B",30);
	Student s3=new Student(103,"C",40);
	ArrayList<Student> xyz= new ArrayList<Student>();
	xyz.add(s1);
	xyz.add(s2);
	xyz.add(s3);

	

	Iterator itr=xyz.iterator();
	
	while(itr.hasNext()){
		Student st=(Student)itr.next();
		System.out.println(st.rollno +" "+st.name+" "+st.age);
	}

	


}
}
