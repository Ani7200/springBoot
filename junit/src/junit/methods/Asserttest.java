package junit.methods;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Asserttest {
	
	 @Test
		public void sum_with3numbers( ) {
			 
			 JunitMethods  test= new JunitMethods();
			 int result=test.sum(12, 12);
			
			
				assertEquals(24,result);
					
	

}
}	 
	 
