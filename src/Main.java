import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {

    public static void main (String[] arg){
//        System.out.print("i like pizza ");
//        System.out.println("it s really good ");
//        System.out.print("Buy me a pizza \n");
//        //we can make the output in line with println
//        System.out.println("hello world");
//        System.out.print("i m here ");
//        Scanner scanner =new Scanner(System.in);
//        System.out.println("what's your name : ");
//        String name= scanner.nextLine();
//        System.out.println("what's your age : ");
//        int age = scanner.nextInt();
//        scanner.nextLine(); // récupère le "Entrée" restant
//        System.out.println("quel vote grade : ");
//        int grade = scanner.nextInt();
//        System.out.println("hello "+ name);
//        System.out.println("you are " + age + " years old ");
//        System.out.println("vore grade est " + grade);
//          int x = 6;
//          double y = 3;
//        System.out.println(x/y);
        String name = JOptionPane.showInputDialog("What's your name?");
        JOptionPane.showMessageDialog(null, "hello " + name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("What's your age :"));
        JOptionPane.showMessageDialog(null,"and your age is " + age);

    }
}