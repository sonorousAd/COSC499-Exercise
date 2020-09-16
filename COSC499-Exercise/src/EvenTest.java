import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class EvenTest {
	even eve = new even();
	@Test
	void test() {
		
		int[] arri = new int[] {1 , 2 , 3};
		ArrayList<Integer> res = eve.meven(arri);
		int exp = 2;
		assertEquals( 2 , (int)res.get(0) );
	
	}
	@Test
	void test2() {
		int[] arri2 = new int[] {1 , 2 , 3, 4,5,7,9};
		ArrayList<Integer> res2 = eve.meven(arri2);
		assertEquals(2, res2.size());
	}

}
