import java.util.Scanner;
// Since we are going to use scanner class we need to import it first.

public class Main {
    public static void main(String[]args){
        double price;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the desired price : ");
        price = input.nextDouble();
        System.out.println();
        System.out.print("Please enter the VAT amount that you wanted to be calculated : ");
        input.close();
        double vatPercentage = (price>0 && 1000>=price) ? 0.18 : 0.08;
        // this means if the price>0 or <=100 take 0.18 if not 0.08.
        double vatPrice = price + (price * vatPercentage);
        double priceNonVat = vatPrice - (price * vatPercentage);
        double vatAmount = vatPrice - price;
        System.out.println("\n" + "Your VAT percentage is : " + vatPercentage + "\n " + "Price with VAT : "
                + vatPrice + "\n " + "Price without VAT : " + priceNonVat + "\n " +
                "VAT amount is : " +  vatAmount);
        // \n is to pass the next line i.e. to avoid being too contiguous
        System.out.println("Thank you for your patronage! ");

    }
}