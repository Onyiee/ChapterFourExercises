package NumberFourPointOneSeven;

import java.util.Scanner;

//(Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
//kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
//a Java application that will input the miles driven and gallons used (both as integers) for each trip.
//The program should calculate and display the miles per gallon obtained for each trip and print the
//combined miles per gallon obtained for all trips up to this point. All averaging calculations should
//produce floating-point results. Use class Scanner and sentinel-controlled repetition to obtain the
//data from the user.
public class GasMileage {
    public static void main(String[] args) {
        int milesDriven = 0;
        int gallonsUsed = 0;
        int milesPerGallon = 0;
        double totalMilesPerGallon = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("How many trips do you want to calculate for? ");
        int trips = input.nextInt();

        int counter = 0;

        while (counter < trips){
            System.out.println("Enter miles travelled: ");
            milesDriven = input.nextInt();
            System.out.println("Enter gallons used: ");
            gallonsUsed = input.nextInt();

            milesPerGallon = milesDriven/gallonsUsed;
            System.out.println("Miles per gallon for trip " + (counter +1) + " is " + milesPerGallon);
            totalMilesPerGallon = milesPerGallon + totalMilesPerGallon;
            counter++;
        }
        System.out.println("Total miles per gallon is " + totalMilesPerGallon);
    }
}
