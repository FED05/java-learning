import java.util.Scanner;

public class condition_age {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you age");
        int age = scanner.nextInt();
        if(age >= 18){
            System.out.println("you can drive ");
        }
        else if (age < 18){
            System.out.println("you can t drive");
        }
    }
}
