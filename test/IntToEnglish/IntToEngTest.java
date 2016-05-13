package IntToEnglish;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class IntToEngTest {

	@Test
	public void ゼロから１０まで() {
		IntToEng ite = new IntToEng();
		String expected[] = {"zero","one","two","three","four","five","six"
		         ,"seven","eight","nine","ten"};
		String actual[] = new String[11];
		for(int n = 0; n < 11; n++) {
		actual[n] = ite.translateEng(n);
		}
		assertThat(actual, is(expected));
	}

}
