import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        int age = -2;
        System.out.println("How old are you?");
        do {
            try {
                age = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number between 1 and 5");
                System.out.println(e.getMessage());
                scan.nextLine();
                System.out.println("How old are you?");
            }
        } while (age == -2);

        // int age = scan.nextInt();

        System.out.println("You are " + age + " years old.");
    }


}