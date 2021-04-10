package inventory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] tempNumber = new int[10];
        int[] tempQty = new int[10];
        int maxSize = -1;
        String[] tempName = new String[10];
        double[] tempPrice = new double[10];
        boolean[] tempStatus = new boolean[10];

        do {
            try {
                System.out.println("\nEnter the number of products you would like to add\nEnter 0 (Zero) if you do not wish to add products : ");
                maxSize = in.nextInt();
                if(maxSize == 0){
                    System.out.println("No product required");
                } else {
                    for (int i=0; i<maxSize; i++){
                        in.nextLine();

                        System.out.println("Input product number : ");
                        tempNumber[i] = in.nextInt();
                        in.nextLine();

                        System.out.println("Input item name   : ");
                        tempName[i] = in.nextLine();

                        System.out.println("Input item quantity   : ");
                        tempQty[i] = in.nextInt();

                        System.out.println("Input item price   : ");
                        tempPrice[i] = in.nextDouble();
                        in.nextLine();

                        System.out.println("Input product status (true/false)   : ");
                        tempStatus[i] = in.nextBoolean();

                        Product p2 = new Product();
                        p2.setNumber(tempNumber[i]);
                        p2.setName(tempName[i]);
                        p2.setQty(tempQty[i]);
                        p2.setPrice(tempPrice[i]);
                        p2.setCheck(tempStatus[i]);

                        String check = String.valueOf(p2.isCheck());
                        String stock = (check.equals("true")) ? "Active" : "Discontinued";

                        System.out.println("\nItem Number      : "+p2.getNumber());
                        System.out.println("Name             : "+p2.getName());
                        System.out.println("Quantity in stock: "+p2.getQty());
                        System.out.println("Price            : "+p2.getPrice());
                        System.out.println("Stock Value      : "+p2.getInventoryValue());
                        System.out.println("Product Status   : "+stock);

                        Product p6 = new Product();
                        p6.setNumber(tempNumber[i]);
                        p6.setName(tempName[i]);
                        p6.setQty(tempQty[i]);
                        p6.setPrice(tempPrice[i]);
                        p6.setCheck(tempStatus[i]);

                        String check1 = String.valueOf(p6.isCheck());
                        String stock2 = (check1.equals("false")) ? "Active" : "Discontinued";

                        System.out.println("\nItem Number      : "+p6.getNumber());
                        System.out.println("Name             : "+p6.getName());
                        System.out.println("Quantity in stock: "+p6.getQty());
                        System.out.println("Price            : "+p6.getPrice());
                        System.out.println("Stock Value      : "+p6.getInventoryValue());
                        System.out.println("Product Status   : "+stock2);
                    }
                }
            } catch (InputMismatchException e){
                System.err.println("Incorrect data type entered!");
                in.nextLine();
            }
        } while(maxSize > 0);
    }
}
