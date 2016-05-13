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
	
	@Test
	public void ゼロから１００まで() {
		IntToEng ite = new IntToEng();
		String num1[] = {"zero","one","two","three","four","five","six","seven","eight","nine","ten",
			      		 "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String num2[] = {"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
		String num3 = "one hundred";
		String expected[] = new String[101];
		for(int i = 0; i < 101; i++) {
			if(i < 20) {
				expected[i] = num1[i];
	    	} else if(i < 100) {
	    		if(i%10 == 0) {
	    			expected[i] = num2[i/10 - 2];
	    		} else {
	    			expected[i] = num2[i/10 - 2] + " " + num1[i%10];
	    		}
	    	} else {
	    		expected[i] = num3; 
	    	}
		}
		String actual[] = new String[101];
		for(int n = 0; n < 101; n++) {
			actual[n] = ite.translateEng(n);
		}
		assertThat(actual, is(expected));
	}

}
