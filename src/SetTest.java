import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SetTest {

	@Test
	void myTest() {
		
		Set set = new Set();
		set.add("Mangga");
		set.add("Rambutan");
		set.add("Pisang");
		assertFalse(set.isEmpty()); // we expected result is false
		assertTrue(!set.isEmpty()); // the !set.isEmpty() is false then if we set !false it means equals to true
		assertEquals(3, set.getSize()); // we want set.getSize() result is 3
		assertTrue(set.isContain("Rambutan"));
		
		// the array = [Mangga, Rambutan, Pisang]
		// array length = 3
		// we want delete Rambutan which index = 1
		// as we know Pisang has index = 2
		// the logic should change Pisang from index 2 to index 1 
		// and we need to set variable total array (nextIndex) must be 2
		set.delete("Rambutan");
		assertEquals(2, set.getSize());
		
		set.add("Sirsak");
		assertEquals(3, set.getSize());
		
	}

}
