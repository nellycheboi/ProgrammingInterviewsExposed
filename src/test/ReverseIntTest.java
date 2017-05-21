package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.ReverseInt;

public class ReverseIntTest {
	ReverseInt ri = new ReverseInt();

	@Test
	public void test() {
		assertEquals(23, ri.reverseInt(32));
		assertEquals(1, ri.reverseInt(1));
		assertEquals(342, ri.reverseInt(243));
		assertEquals(2435, ri.reverseInt(5342));
		
		assertFalse(ri.isAllOdd(1259));
	}

}
