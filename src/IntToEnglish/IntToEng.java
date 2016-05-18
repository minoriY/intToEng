package IntToEnglish;
import java.util.Scanner;

public class IntToEng {
	
static String num1[] = {"zero","one","two","three","four","five","six","seven","eight","nine","ten",
		         "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
static String num2[] = {"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
static String num3 = "hundred";
static String num4 = "thousand";

	   // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	String s = "";
    	if(n < 100) {
    		s = underHundred(n);
    	} else if(n < 1000) {
    			s = underThousand(n);
    	}
    	/*} else if(n < 10000){
    		int i = n%1000;
    		int j = (n/10)%100;
    		int k = n%100;
    		if(i == 0) {
    			s = num1[n/1000] + " " + num4;
    		} else if(j == 0) {
        			s =  num1[n/1000] + " " + num4  + " " + num1[i];
        			if(n%10 == 0) {
            			s = num1[n/1000] + " " + num4 + " " + num1[n/1000] + " " + num3 + " " + num2[i/10 - 2];
            		} else {
            			s = num1[n/1000] + " " + num4 + " " + num1[n/100] + " " + num3 + " " + num2[i/10 - 2] + " " + num1[n%10];
            		}
    		} else if(j == 1) {
    				s = num1[n/1000] + " " + num4  + " " + num1[i];
    		} else if(j > 1){
    			if(k == 0) {
        			s = num1[n/1000] + " " + num4 + " " + num1[j/10] + " " + num3;
        		} else if(n%10 == 0){
        			//s = num1[n/1000] + " " + num4 + " " + num1[j/10] + " " + num3;
        			s = num1[n/1000] + " " + num4  + " " + num1[j/10] + " " + num3 + " " + num2[i/10 - 2] + " " + num1[n%10];
        		}
    		} else {
    			if(n%10 == 0) {
        			s = num1[n/1000] + " " + num4 + " " + num1[n/1000] + " " + num3 + " " + num2[i/10 - 2];
        		} else {
        			s = num1[n/1000] + " " + num4 + " " + num1[n/100] + " " + num3 + " " + num2[i/10 - 2] + " " + num1[n%10];
        		}
    		}*/
    	
    	return s;
    }
    static String underHundred(int n) {
    	String s = "";
    	if(n < 20) {
    		s = num1[n];
    	} else if(n < 100) {
    		if(n%10 == 0) {
    			s = num2[n/10 - 2];
    		} else {
    			s = num2[n/10 - 2] + " " + num1[n%10];
    		}
    	}
    	return s;
    }
    static String underThousand(int n) {
    	String s = "";
    	if(n < 1000) {
    		int i = n%100;
    		if(i != 0) {
    			s = num1[n/100] + " " + num3 + " " + underHundred(i);
    		} else {
    			s =  num1[n/100] + " " +num3;
    		}
    	}
    	return s;
     }
}



