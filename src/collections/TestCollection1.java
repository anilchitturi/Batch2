package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection1 {

	public TestCollection1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> xyz= new ArrayList<String>();
		xyz.add("a");
		xyz.add("b");
		xyz.add("c");
		xyz.add("d");
		
		Iterator itr=xyz.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		for(String obj:xyz){
			System.out.println(obj);

		}


	}

}
