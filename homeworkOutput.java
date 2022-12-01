import static java.lang.Integer.parseInt;

public class homeworkOutput {
    public static void main(String[] args) {
        // Q - 2

        // OUTPUT - 1
        String number = "123456789";
        int uzunluk = number.length();

        System.out.println("OUTPUT - 1 ");
        int i;
        int a;

        for (i = 0, a = 1; i < 5 && a < 10; i++, a += 2) {
            number.substring(i, a);
            System.out.println(number.substring(i, a));
        }

        System.out.println("-----------------------");

        // OUTPUT - 2
        String number2 = "123456789";
        System.out.println("OUTPUT - 2");

        for (int b = 0; b < 5; b++) {
            number2.substring(b, 5);
            System.out.println(number2.substring(b, 5));

        }

        System.out.println("-----------------------");

        //OUTPUT - 3
        System.out.println("OUTPUT - 3");

        // I put \n because want to start next row
        String[] Output3  = {"1 \n", "1 9\n", "1 9 25\n", "1 9 25 49\n", "1 9 25 49 81\n", "1 9 25 49\n", "1 9 25\n", "1 9\n", "1\n"};
        for (int k= 1; k<10 ; k++){
            System.out.printf("%s",Output3[k]);



        }
    }

}
