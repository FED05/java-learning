import java.util.Scanner;

public class Distance {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrer le coordonnees de premier Point x1 :");
        double x1 = scanner.nextDouble();
        System.out.println("Entrer le coordonnees de premier Point  y1 :");
        double y1 = scanner.nextDouble();
        System.out.println("Entrer le coordonnees de deuxieme Point x2 :");
        double x2 = scanner.nextDouble();
        System.out.println("Entrer le coordonnees de deuxieme Point  y2 :");
        double y2 = scanner.nextDouble();
        double Distance = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        System.out.println("la distance entre ces deux points est " + Distance);

    }
}
