import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        double fTemp;
        double cTemp;
        String trash;
        Boolean succeed = false;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Enter your temperature in Celsius.");

            if (in.hasNextDouble()) {
                cTemp = in.nextDouble();
                in.nextLine();

                fTemp = (cTemp * 1.8) + 32;

                System.out.printf("The temperature in Fahrenheit is: %.2f%n", fTemp);
                succeed = true;
            } else {
                trash = in.nextLine();
                System.out.println("You entered an invalid temperature: " + trash);
            }
        }while(!succeed);
    }
}