import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String alphabetCasear = "   abcdefghijklmnopqrstuvwxyz";


        System.out.println("Enter your sentence's:");
        String sentence = sc.nextLine();

        String notSpace = sentence.trim();
        int sentLength = notSpace.length();
        System.out.println(sentLength);


        int im;
        for (im = 0; im < sentLength; im++) {
            alphabet.charAt(im);

            System.out.print( alphabet.charAt(im) );
            System.out.println(alphabet.charAt(im+3));

        }
    }
}