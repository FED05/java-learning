import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args){
        System.out.println("Mad Libs game");
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrer a name :");
        String name = scanner.nextLine();
        System.out.println("enter a place :");
        String place = scanner.nextLine();
        System.out.println("enter an animal :");
        String animal = scanner.nextLine();
        System.out.println("enter a food :");
        String food = scanner.nextLine();
        System.out.println("enter a cloths :");
        String cloths = scanner.nextLine();
        System.out.println("enter a adverb :");
        String adverb = scanner.nextLine();
        System.out.println("enter a emotion :");
        String emotion = scanner.nextLine();
        System.out.println("enter a verb :");
        String verb = scanner.nextLine();
        System.out.println("enter an adjective :");
        String adj = scanner.nextLine();
        System.out.println("Yesterday, I went to the " +
                place + " with my best friend " + name+
               " Suddenly, we saw a "+ animal+
                " wearing a "+cloths+ " and dancing " + adverb+ ". I was so " +emotion+ " that I started to "+verb+"! Then, the animal gave me a "+food+ " and said, “You are the most " +adj+" person I’ve ever met!”");

    }
}
