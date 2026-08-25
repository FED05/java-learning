package loops;

import java.util.Scanner;

public class nombreN {
    public static  void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("entre a number:");
        int num = scanner.nextInt();
        //loop for
        System.out.println("result: ");
        for(int i =1;i<=num;i++){
            System.out.println(i);
        }

    }
}
