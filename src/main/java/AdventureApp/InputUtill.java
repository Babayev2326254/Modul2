package AdventureApp;

import java.util.Scanner;

public class InputUtill {
    public static final Scanner scanner = new Scanner(System.in);


    public static String getText(String title) {
        System.out.print(title + ": ");
        return scanner.nextLine();
    }

    public static Integer getInteger(String title) {
        System.out.print(title + ": ");
        return scanner.nextInt();
    }
}
