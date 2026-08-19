import java.util.Scanner;

public class Main {

    public static void main (String[] arg){
//        System.out.print("i like pizza ");
//        System.out.println("it s really good ");
//        System.out.print("Buy me a pizza \n");
//        //we can make the output in line with println
//        System.out.println("hello world");
//        System.out.print("i m here ");
        Scanner scanner =new Scanner(System.in);
        System.out.println("what's your name : ");
        String name= scanner.nextLine();
        System.out.println("what's your age : ");
        int age = scanner.nextInt();
//        scanner.nextLine(); // récupère le "Entrée" restant
        System.out.println("quel vote grade : ");
        int grade = scanner.nextInt();
        System.out.println("hello "+ name);
        System.out.println("you are " + age + " years old ");
        System.out.println("vore grade est " + grade);
    }
}