import java.util.Scanner;

public class Moyenne {
    public static void main(String[] args){
        System.out.println("Calcule de Moyenne des etudiants.");
        Scanner scanner = new Scanner(System.in);
        double math;
        double physique;
        double info;
        double moy;
        System.out.println("enter your note in math:");
        math =scanner.nextDouble();
        System.out.println("enter your note in physique:");
        physique=scanner.nextDouble();
        System.out.println("enter your note in info:");
        info= scanner.nextDouble();
        moy=(math + physique+info)/3;
        if(moy >=16){
            System.out.println("Excellent");
        } else if (moy >=14) {
            System.out.println("Tres Bien");

        } else if (moy >= 10) {
            System.out.println("Admis");

        }
        else {
            System.out.println("Echec");
        }
    }
}
