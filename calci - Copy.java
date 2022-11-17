import java.time.LocalTime;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class calci {

    static String words[] = { "envelop", "cantelope", "congratulations", "scholarship", "microphone", "elephant",
            "biscuit", "beautiful",
            "excitment", "delicious" };

    static String wordseasy[] = { "cat", "dog", "rat", "pot", "hut", "sit", "act", "ice", "add", "ego" };
    static String wordmedium[] = { "gold", "half", "busy", "blue", "cold", "near", "save", "else", "back", "help" };

    public static void main(String args[]) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome To Typing Club !");
        System.out.println();
        System.out.println("Please Enter Your Good Name");
        String name = sc.nextLine();
        System.out.println();
        // System.out.println(name);
        System.out.println("Select level :");
        System.out.println("Easy");
        System.out.println("Medium");
        System.out.println("Hard");
        System.out.println();

        System.out.println("Please Enter Your Level : ");
        String level = sc.nextLine();
        System.out.println();
        String level1 = "easy";
        String level2 = "medium";
        String level3 = "hard";

        if (level.compareTo(level3) == 0 || level.compareTo("Hard") == 0) {

            for (int i = 0; i < 10; i++) {

                System.out.print(words[rand.nextInt(9)] + " ");
            }

            System.out.println();
            System.out.println("Start Typing :");

            double start = LocalTime.now().toNanoOfDay();

            String typewords = sc.nextLine();

            double end = LocalTime.now().toNanoOfDay();
            double elapsedtime = end - start;
            double seconds = elapsedtime / 1000000000.0;
            int numchars = typewords.length();

            int wpm = (int) ((((double) numchars / 5) / seconds) * 60);
            if (wpm > 24) {

                System.out.println(name + " your typing speed is " + wpm + " wpm " + "!");
                System.out.println("Well done ! " + name);
            } else if (wpm > 14 && wpm < 24) {

                System.out.println(name + " your typing speed is " + wpm + " wpm " + "!");
                System.out.println("Good !, " + name + " You can improve.");

            } else {
                System.out.println(name + " your typing speed is " + wpm + " wpm " + "!");
                System.out.println(name + " You need to practice !");

            }

        } else if (level.compareTo(level2) == 0 || level.compareTo("Medium") == 0) {

            for (int i = 0; i < 10; i++) {

                System.out.print(wordmedium[rand.nextInt(9)] + " ");
            }

            System.out.println();
            System.out.println("Start Typing");

            double start = LocalTime.now().toNanoOfDay();

            String typewords = sc.nextLine();

            double end = LocalTime.now().toNanoOfDay();
            double elapsedtime = end - start;
            double seconds = elapsedtime / 1000000000.0;
            int numchars = typewords.length();

            int wpm = (int) ((((double) numchars / 5) / seconds) * 60);
            if (wpm > 24) {

                System.out.println(name + " your typing speed is " + wpm + " wpm " + "!");
                System.out.println("Well done ! " + name);
            } else if (wpm > 14 && wpm < 24) {

                System.out.println(name + " your typing speed is " + wpm + " wpm " + "!");
                System.out.println("Good !, " + name + " You can improve.");

            } else {
                System.out.println(name + " your typing speed is " + wpm + " wpm " + "!");
                System.out.println(name + " You need to practice !");

            }

        }

        else if (level.compareTo(level1) == 0 || level.compareTo("Easy") == 0) {

            for (int i = 0; i < 10; i++) {

                System.out.print(wordseasy[rand.nextInt(9)] + " ");
            }

            System.out.println();
            System.out.println("Start Typing");

            double start = LocalTime.now().toNanoOfDay();

            String typewords = sc.nextLine();

            double end = LocalTime.now().toNanoOfDay();
            double elapsedtime = end - start;
            double seconds = elapsedtime / 1000000000.0;
            int numchars = typewords.length();

            int wpm = (int) ((((double) numchars / 5) / seconds) * 60);
            if (wpm > 24) {

                System.out.println(name + " your typing speed is " + wpm + " wpm " + "!");
                System.out.println("Well done ! " + name);
            } else if (wpm > 14 && wpm < 24) {

                System.out.println(name + " your typing speed is " + wpm + " wpm " + "!");
                System.out.println("Good !, " + name + " You can improve.");

            } else {
                System.out.println(name + " your typing speed is " + wpm + " wpm " + "!");
                System.out.println(name + " You need to practice !");

            }

        }

        else if (level.compareTo(level3) != 0 || level.compareTo("Hard") != 0 || level.compareTo(level2) != 0
                || level.compareTo("Medium") != 0 || level.compareTo(level1) != 0 || level.compareTo("Easy") != 0) {

            System.out.println("You Entered The Wrong Level.");
            System.out.println("Enter level as");
            System.out.println("Easy");
            System.out.println("Medium");
            System.out.println("Hard");
        }

    }
}
