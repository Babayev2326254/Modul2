package AdventureApp;

public class Game {
    public static void start() {
        System.out.println("\n\t\t\tWelcome to the Adventure Game!");

//        System.out.println("Enter the name ");
//        String name = scanner.nextLine();
//        System.out.printf("Enterthe name %s,Everything is real you see here!", name);

        String name1 = InputUtill.getText("Enter the name ,Everything is real you see here");
        Integer age = InputUtill.getInteger("Enter name age");


    }
}
