import java.util.Scanner;

public class specificPassWordControll {
    //Merve Yağız 210316023 Question 3


    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.println("Please enter you password:");
            String password = sc.nextLine();
            password = password.toUpperCase();

            int evenRuleControl = 0, oddRuleControl = 0, ruleControl = 0;
            int oddResult = 0;
            int biggerTenTotal = 0, smallerTenTotal = 0;

            for (int i = 0; i < 16; i++) {
            char pw = password.charAt(i);

            // To create two-digit prime numbers, I converted the 2nd index value to a
            // numeric value and multiplied by 10
            int valuePw2 = Integer.parseInt(String.valueOf(password.charAt(2))) * 10;

            // I assigned a value to find the prime number.
            int scale = 0;


            if (i == 0) {
                // I checked if the user entered letters
                int ascii = password.charAt(0);
                if (ascii <= 64 || ascii >= 91) {
                    System.out.println("Please enter valid password");
                }
            }

            if (i == 1) {
                // I checked the given condition
                int ascii2 = (int) pw;
                int ascii = (int) password.charAt(0);

                if ((ascii2 < 65 || ascii2 > 90) || (ascii2 < ascii)) {
                    System.out.println("Please enter valid password");

                }
            }

            if (i == 2) {
                // To create two-digit prime numbers, I converted the 2nd index value to a
                // numeric value and multiplied by 10
                valuePw2 = Integer.parseInt(String.valueOf(password.charAt(2))) * 10;
            }

            if (i == 3) {
                // I checked if the generated two digit number is prime
                int valuePw3 = Integer.parseInt(String.valueOf(password.charAt(3)));
                int totalValue = valuePw2 + valuePw3;

                for (int prime = 2; prime < totalValue; prime++) {
                    if ((totalValue) % prime == 0) {
                        scale++;
                        if (!(scale == 0)) {
                            System.out.println("Please enter valid password ");

                        }
                    }
                }

            }

            if ((i > 3) && (i < 16)) {
                // I checked the double indexes as desired
                if ((i % 2 == 0)) {
                    int evenValue = Integer.parseInt(String.valueOf(pw));
                    int result = evenValue * 2;

                    if (result > 9) {
                        int conv1 = Character.getNumericValue(String.valueOf(result).charAt(0));
                        int conv2 = Character.getNumericValue(String.valueOf(result).charAt(1));
                        int bigTen = conv1 + conv2;
                        biggerTenTotal = biggerTenTotal + bigTen;
                    }

                    else {
                        smallerTenTotal = smallerTenTotal + result;
                    }
                    evenRuleControl= smallerTenTotal + biggerTenTotal;
                }

                // I checked single indexes
                else {
                    int oddValue = Integer.parseInt(String.valueOf(pw));
                    oddResult += oddValue;
                    oddRuleControl = oddResult;

                }
                ruleControl= evenRuleControl + oddRuleControl; // I controlled rules values.
            }}

          //  System.out.println(evenRuleControl);
          //System.out.println(oddRuleControl);
          //  System.out.println(ruleControl);

            if (ruleControl % 10 == 0) {
            System.out.println("Your password is valid");

            }

            else {
            System.out.println("Please enter valid password ");

            }
    }
}

