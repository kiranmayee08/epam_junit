package epam;

import static org.junit.Assert.*;

import org.junit.Test;

import epam.Epam_8;

public class testepam {

	@Test
	public void test() {
		Epam_8 a=new Epam_8();
        assertEquals("BCD",a.remove("ABCD"));
		assertEquals("CD",a.remove("AACD"));
		assertEquals("BCD",a.remove("BACD"));
		assertEquals("BBAA",a.remove("BBAA"));
		assertEquals("BAA",a.remove("AABAA"));
	}

}
