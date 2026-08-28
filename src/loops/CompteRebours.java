package loops;

import java.util.Scanner;

public class CompteRebours {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisir un nombre positif:");
        int num = scanner.nextInt();
        int compte = 0;
        while (num >= compte ){
            System.out.println(num);
            num--;
        }

    }
}
