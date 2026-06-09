import java.util.Scanner;

public class Checkout {

public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String[] productName = new String[100];
    int[] quantities = new int[100];
    double[] price = new double[100];
    int index = 0;

      System.out.print("What is the customer's Name?: ");
      String customerName = input.nextLine();  


        String choice = "yes";

      while (choice.equalsIgnoreCase("yes")) {
   
      System.out.print("\nWhat did the user buy?: ");
      productName[index] = input.next();

      System.out.print("\nHow many pieces?: ");
      quantities[index] = input.nextInt();
      

      System.out.print("\nHow much per unit?: ");
      price[index] = input.nextDouble();
            
        index++;


      System.out.print("Add more items? (yes/no): ");
      choice = input.next();

      while (!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no")) {
      System.out.println("Invalid input. Please enter 'yes' or 'no' ");
      System.out.print("Add more items? (yes/no): ");
      choice = input.next(); 

          }
    }


      System.out.print("\nWhat is your name?: ");
      String cashierName = input.next();

      System.out.print("\nHow much discount will he get?: ");
      double discount = input.nextDouble();

       double subTotal = 0;



          System.out.println("\nSEMICOLON STORES");
          System.out.println("MAIN BRANCH");
          System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
          System.out.println("TEL: 03293828343");
          System.out.println("Cashier: " + cashierName);
          System.out.println("Customer: " + customerName);
          System.out.println("============================================");
          
          
          System.out.printf("\n%-10s %-5s %-10s %-10s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
          System.out.println("\n--------------------------------------------------------------");


          for ( int num = 0; num < index; num++) {
                    double itemTotal = quantities[num] * price[num];
          subTotal = subTotal + itemTotal;

          System.out.printf("%-10s %-10d %-10.2f %-10.2f%n", productName[num], quantities[num], price[num], itemTotal);
          
             }

          double discountAmount = (discount / 100) * subTotal;
          double vat = subTotal * 7.5 / 100;
          double billTotal = subTotal + vat - discountAmount; 

         System.out.println("\n\n---------------------------------------------");
         System.out.printf("Sub Total: %.2f%n", subTotal);
         System.out.printf("Discount: %.2f%n", discountAmount);
         System.out.printf("VAT@ 7.5: %.2f%n", vat);
         System.out.println("\n==================================================");
         System.out.printf("Bill Total: %.2f%n", billTotal);
         System.out.println("====================================================");
         System.out.printf("THIS IS NOT A RECEIPT KINDLY PAY %.2f%n",  billTotal); 
         System.out.println("\n====================================================");



        System.out.print("\n\nHow much did the customer give to you? ");
        double amountPaid = input.nextDouble();  



          System.out.println("\nSEMICOLON STORES");
          System.out.println("MAIN BRANCH");
          System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
          System.out.println("TEL: 03293828343");
          System.out.println("Cashier: " + cashierName);
          System.out.println("Customer: " + customerName);
          System.out.println("============================================");
          


          System.out.printf("\n%-10s %-5s %-10s %-10s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
          System.out.println("\n--------------------------------------------------------------");



         for ( int num = 0; num < index; num++) {
                    double itemTotal = quantities[num] * price[num];
          

          System.out.printf("%-10s %-10d %-10.2f %-10.2f%n", productName[num], quantities[num], price[num], itemTotal);
          
             }

          discountAmount = (discount / 100) * subTotal;
          vat = subTotal * 7.5 / 100;
          billTotal = subTotal + vat - discountAmount; 
          double balance = amountPaid - billTotal;

         System.out.println("\n\n---------------------------------------------");
         System.out.printf("Sub Total: %.2f%n", subTotal);
         System.out.printf("Discount: %.2f%n", discountAmount);
         System.out.printf("VAT@ 7.5: %.2f%n", vat);
         System.out.println("\n==================================================");
         System.out.printf("Bill Total: %.2f%n", billTotal);
         System.out.printf("Amount paid: %.2f%n", amountPaid);
         System.out.printf("Balance: %.2f%n", balance);
         System.out.println("====================================================");
         System.out.println("THANK YOU FOR YOUR PATRONAGE");
         System.out.println("\n====================================================");




            
         



   }

}