package NumberFourPointTwoZero;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        int grossPayment;
        Scanner input = new Scanner(System.in);

        int userInput = 0;
        while (userInput != -1) {
            System.out.println("Enter number of hours worked or -1 to quit: ");
            int numberOfHours = input.nextInt();

            System.out.println("Enter hourly rates or -1 to quit: ");
            int hourlyRates = input.nextInt();
            if(numberOfHours == -1 || hourlyRates == -1){
                userInput = -1;
            } else {
                if (numberOfHours > 40) {
                    grossPayment = (int) (hourlyRates + (hourlyRates + (0.5 * hourlyRates)) * numberOfHours);
                } else {
                    grossPayment = hourlyRates * numberOfHours;
                }
                System.out.printf("Gross payment is %d%n ", grossPayment);
            }
        }
    }
}
