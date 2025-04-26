package cz.ivosahlik;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

	String input1 = "noon";
	App app = new App();
	boolean expected = true;

	@Test
	public void isTest() {
		assertEquals(expected, app.isSomething(input1));
	}

	@Test
	public void isNotTest() {
		assertEquals(false, app.isSomething("abc"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void isNotExceptionTest() {
		assertEquals(false, app.isSomething(null));
	}

}
