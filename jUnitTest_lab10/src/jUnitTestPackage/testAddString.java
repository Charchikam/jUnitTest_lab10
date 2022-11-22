package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		jUnitFunctions jUnitstring = new jUnitFunctions();
		String result = jUnitstring.addi("cape", "stone");
		assertEquals ("capestone", result);
	}

}
