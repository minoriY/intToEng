package IntToEnglish;
import java.util.Scanner;

public class IntToEng {
	   // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	String s = "";
    	String num1[] = {"zero","one","two","three","four","five","six","seven","eight","nine","ten",
    				     "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    	String num2[] = {"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
    	String num3 = "one hundred";
    	if(n < 20) {
    		s = num1[n];
    	} else if(n < 100) {
    		if(n%10 == 0) {
    			s = num2[n/10 - 2];
    		} else {
    			s = num2[n/10 - 2] + " " + num1[n%10];
    		}
    	} else {
    		s = num3; 
    	}
        return s;
    }

}


