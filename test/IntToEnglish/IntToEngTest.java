package IntToEnglish;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class IntToEngTest {

	@Test
	public void ゼロから100未満() {
		IntToEng ite = new IntToEng();
		String expected = "ninety nine";
		String actual = ite.underHundred(99);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void ゼロから1000未満() {
		IntToEng ite = new IntToEng();
		String expected = "nine hundred ninety nine";
		String actual = ite.underThousand(999);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void ゼロから10000未満() {
		IntToEng ite = new IntToEng();
		String expected = "nine thousand nine hundred ninety nine";
		String actual = ite.underTenThousand(9999);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void ゼロから10000まで() {
		IntToEng ite = new IntToEng();
		String expected1 = "ten thousand";
		String actual1 = ite.translateEng(10000);
		String expected2 = "10000未満の整数を入力してください！";
		String actual2 = ite.translateEng(10001);
		assertThat(actual1, is(expected1));
		assertThat(actual2, is(expected2));
	}

}
