import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class oddTest {

		odd od = new odd();
		@Test
		void test() {
			
			int[] arri = new int[] { 2 , 3 ,4};
			ArrayList<Integer> res = od.modd(arri);
			assertEquals( 3 , (int)res.get(0) );
		
		}
		@Test
		void test2() {
			int[] arri2 = new int[] {1 , 2 , 3, 4,5,7,9};
			ArrayList<Integer> res2 = od.modd(arri2);
			assertEquals(5, res2.size());
		}

	}

