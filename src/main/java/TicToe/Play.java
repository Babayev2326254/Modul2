package TicToe;


public class Play {
    public static void main(String[] args) {
        System.out.println("\n Welcome turing Tic Tao game ");
        XandO xandO = new XandO();

        String secim = xandO.choose();
        if (secim.equals("X")) {
            System.out.println("Birinci oyunçu: X");
        } else {
            System.out.println("Birinci oyunçu: O");
        }

        System.out.println("Good luck");

        Gamelogic.gamedefault();

        for (int i = 0; i < 4; i++) {
            if (secim.equals("X")) {
                System.out.println(" Hədəfi secin");
                Gamelogic.switchX();
                System.out.println(" Hədəfi secin");
                Gamelogic.switchY();
            } else {
                System.out.println(" Hədəfi secin");
                Gamelogic.switchY();
                System.out.println(" Hədəfi secin");
                Gamelogic.switchX();
            }

        }

        System.out.println("Game final");
        Gamelogic.gamedefault();
    }
}
