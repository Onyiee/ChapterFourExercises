package NumberFourPointOneNine;
//(Sales Commission Calculator) A large company pays its salespeople on a commission basis.
//The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
//salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5000, or a
//total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
//these items are as follows:
//Item Value
//1 239.99
//2 129.75
//3 99.95
//4 350.89
//Develop a Java application that inputs one salesperson’s items sold for last week and calculates and
//displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.
import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        int itemNumber = 0;
        int numberOfItemsSold = 0;
        int basePay = 200;
        int grossSales = 0;
        double itemValue = 0.0;

        System.out.println("Enter item number: ");
        Scanner input = new Scanner(System.in);
        itemNumber = input.nextInt();
        System.out.println("Enter number of items sold: ");
        numberOfItemsSold = input.nextInt();

        switch (itemNumber){
            case 1:
                    itemValue = 239.99;
                    break;

            case 2:
                    itemValue = 129.75;
                    break;

            case 3:
                    itemValue = 99.95;
                    break;

            case 4:
                    itemValue= 350.89;
                    break;
        }

       // System.out.println("Item value is " + itemValue);
        //System.out.println("Number of items sold is " +numberOfItemsSold);
        grossSales = (int) (itemValue * numberOfItemsSold);
       // System.out.println(grossSales);
        int commission = (grossSales * 9)/100;
       // System.out.println(commission);
        int totalPay = basePay + commission;

        System.out.printf("Total pay is %d%n ", totalPay);

    }
}
