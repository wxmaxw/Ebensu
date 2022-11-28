import java.util.Scanner;

public class casearCrypto {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your message : ");
        String sentence = sc.nextLine();


        int sentLength = sentence.length();
        sentence = sentence.toUpperCase();
        System.out.println("Encrypted Message:");


        for (int i = 0; i < sentLength + 1; i++) {
            char ch = sentence.charAt(i);
            int asciiValue = ch;
            int newAC = asciiValue + 3;

            // I set the valid range of numbers that I want to get the letters.
            if (!(asciiValue < 90 || asciiValue > 65) && asciiValue == 43) {
                System.out.print("Please enter valid character.");
            }


            //I set the spaces between words.
            else if (newAC == 35) {
                int newAC2 = newAC - 3;
                char newChar2 = (char) newAC2;
                System.out.print(newChar2);
            }

            //I started from the letter A again by subtracting 26 from the loop so that it does not go beyond the letter Z.
            else if (newAC > 90) {
                int newAC3 = newAC - 26;
                char newChar3 = (char) newAC3;
                System.out.print(newChar3);
            }

            //I printed the ones that follow the rules as normal.
            else {
                char newChar = (char) newAC;
                System.out.print(newChar);

            }
        }


    }
}
