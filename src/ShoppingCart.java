import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("which item do you want ?");
        String item = scanner.nextLine();
        System.out.println("what is price for each in $ ?");
        double price = scanner.nextDouble();
        System.out.println("how many would  you like ?");
        int many  = scanner.nextInt();

        double priceResult = price * many ;
        System.out.println("the total price for " + item + " it's "+priceResult+ "$");

    }
}
