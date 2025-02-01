package TicToe;


import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        System.out.println("\n Welcome turing Tic Tao game ");
        XandO xandO = new XandO();
        Gamelogic gamelogic = new Gamelogic();
        String[][] arrays = Gamelogic.getArray();

        String secim = xandO.choose();
        if (secim.equals("X")) {
            System.out.println("Birinci oyunçu: X");
        } else {
            System.out.println("Birinci oyunçu: O");
        }

        System.out.println("Good luck");

        Gamelogic.gamedefault();

        for (int i = 0; i < 4; i++) {
            System.out.println(" Hədəfi secin");
            Scanner scanner = new Scanner(System.in);
            Gamelogic.switchX();
            Gamelogic.switchY();
        }
        Gamelogic.switchX();


        System.out.println("Game final");
        Gamelogic.gamedefault();
    }
}
