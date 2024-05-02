import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       String word = input();
       String reverseWord = "";
       func(reverseWord, word);

    }
    public  static void func(String reverseWord, String word){
        for(int i = word.length()-1;i>=0;i--){
            reverseWord = reverseWord+word.charAt(i);
        }

        if(word.equals(reverseWord)){
            System.out.println("is palindrome");
        }else {
            System.out.println("is not palindrome");
        }
    }
    public static String input(){
        System.out.println("ad daxil edin");
        Scanner sc = new Scanner(System.in);
        String word  = sc.nextLine();
        return word;

    }


}