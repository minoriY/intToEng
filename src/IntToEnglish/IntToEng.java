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
    	String num1[] = {"zero","one","two","three","four","five","six"
    			         ,"seven","eight","nine","ten"};
    	
        return num1[n];
    }

}


