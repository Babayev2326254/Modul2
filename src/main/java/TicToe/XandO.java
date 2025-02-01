package TicToe;

import java.util.Scanner;

public class XandO {
    private String player;

    public XandO() {

    }

    public XandO(String player) {
        this.player = player;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String choose() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("X və ya O seçin: ");
            String input = scanner.nextLine().trim().toUpperCase();

            if (input.equals("X") || input.equals("O")) {
                this.player = input;
                break;
            } else {
                System.out.println("Yalnız X və ya O seçə bilərsiniz!");
            }
        }
        return this.player;
    }
}

