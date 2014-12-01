package JUnit;


import java.util.ArrayList;

import org.junit.Test;

public class except {
	@Test(expected= IndexOutOfBoundsException.class) 
    public void empty() { 
         new ArrayList<Object>().get(0); 
    }


}
