
import java.util.Scanner;
public class Hypo {
    public static void main (String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a : ");
        double a = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("enter b :");
        double b = scanner.nextDouble();
        double c = (a * a ) + (b * b);
        double result = Math.sqrt(c);
        System.out.println(" l'hypoténuse est : " + result);
    }
}
