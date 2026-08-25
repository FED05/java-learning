import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("which product do you want ?");
        String product = scanner.nextLine();
        System.out.println("what is price for each in $ ?");
        double priceUnitaine = scanner.nextDouble();
        System.out.println("how many would  you like ?");
        int quantite  = scanner.nextInt();
        double priceResult = priceUnitaine * quantite;
        if (priceResult >= 100){
            double reduction = priceResult * 0.1;
            double priceFinal= priceResult - reduction;
            System.out.println("the price final of your "+ product +" product after reduction of 10% is " +priceFinal + "$");
        }else {
            System.out.println("the price final of your product is " + priceResult);
        }

        }


    }

