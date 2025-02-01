package TicToe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Gamelogic extends XandO {
    int[] numbers = new int[9];
    int k;
    private static String[][] array = {
            {"-", "-", "-"},
            {"-", "-", "-"},
            {"-", "-", "-"}
    };

    public Gamelogic() {
    }

    public Gamelogic(String player) {
        super(player);
    }

    public static String[][] getArray() {
        return array;
    }

    public static void setArray(String[][] array) {
        Gamelogic.array = array;
    }

    public static void gamedefault() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    public static void switchX() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                if (!(array[0][0].equals("Y") || array[0][0].equals("X"))) {
                    array[0][0] = "X";
                    Gamelogic.gamedefault();
                    break;
                } else {
                    System.out.println("Yeniden");
                    switchX();
                }
            case 2:
                if (!(array[0][1].equals("Y") || array[0][1].equals("X"))) {
                    array[0][1] = "X";
                    Gamelogic.gamedefault();
                    break;
                } else {
                    System.out.println("Yeniden");
                    switchX();
                }
            case 3:
                if (!(array[0][2].equals("Y") || array[0][2].equals("X"))) {
                    array[0][2] = "X";
                    Gamelogic.gamedefault();
                    break;
                } else {
                    System.out.println("Yeniden");
                    switchX();
                }
            case 4:
                if (!(array[1][0].equals("Y") || array[1][0].equals("X"))) {
                    array[1][0] = "X";
                    Gamelogic.gamedefault();
                    break;
                } else {
                    System.out.println("Yeniden");
                    switchX();
                }
            case 5:
                if (!(array[1][1].equals("Y") || array[1][1].equals("X"))) {
                    array[1][1] = "X";
                    Gamelogic.gamedefault();
                    break;
                } else {
                    System.out.println("Yeniden");
                    switchX();
                }
            case 6:
                if (!(array[1][2].equals("Y") || array[1][2].equals("X"))) {
                    array[1][2] = "X";
                    Gamelogic.gamedefault();
                    break;
                } else {
                    System.out.println("Yeniden");
                    switchX();
                }
            case 7:
                if (!(array[2][0].equals("Y") || array[2][0].equals("X"))) {
                    array[2][0] = "X";
                    Gamelogic.gamedefault();
                    break;
                } else {
                    System.out.println("Yeniden");
                    switchX();
                }
            case 8:
                if (!(array[2][1].equals("Y") || array[2][1].equals("X"))) {
                    array[2][1] = "X";
                    Gamelogic.gamedefault();
                    break;
                } else {
                    System.out.println("Yeniden");
                    switchX();
                }
            case 9:
                if (!(array[2][2].equals("Y") || array[2][2].equals("X"))) {
                    array[2][2] = "X";
                    Gamelogic.gamedefault();
                    break;
                } else {
                    System.out.println("Yeniden");
                    switchX();
                }
            default:
                System.out.println("Yanlış dəyər! 1-9 arası ədəd daxil edin.");
        }

    }

    public static void switchY() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                if (!(array[0][0].equals("Y") || array[0][0].equals("X"))) {
                    array[0][0] = "Y";
                    Gamelogic.gamedefault();
                    break;
                } else {
                    System.out.println("Yeniden");
                    switchY();
                }
            case 2:
                if (!(array[0][1].equals("Y") || array[0][1].equals("X"))) {
                    array[0][1] = "Y";
                    Gamelogic.gamedefault();
                    break;
                } else {
                    System.out.println("Yeniden");
                    switchY();
                }
            case 3:
                if (!(array[0][2].equals("Y") || array[0][2].equals("X"))) {
                    array[0][2] = "Y";
                    Gamelogic.gamedefault();
                    break;
                } else {
                    System.out.println("Yeniden");
                    switchY();
                }
            case 4:
                if (!(array[1][0].equals("Y") || array[1][0].equals("X"))) {
                    array[1][0] = "Y";
                    Gamelogic.gamedefault();
                    break;
                } else {
                    System.out.println("Yeniden");
                    switchY();
                }
            case 5:
                if (!(array[1][1].equals("Y") || array[1][1].equals("X"))) {
                    array[1][1] = "Y";
                    Gamelogic.gamedefault();
                    break;
                } else {
                    System.out.println("Yeniden");
                    switchY();
                }
            case 6:
                if (!(array[1][2].equals("Y") || array[1][2].equals("X"))) {
                    array[1][2] = "Y";
                    Gamelogic.gamedefault();
                    break;
                } else {
                    System.out.println("Yeniden");
                    switchY();
                }
            case 7:
                if (!(array[2][0].equals("Y") || array[2][0].equals("X"))) {
                    array[2][0] = "Y";
                    Gamelogic.gamedefault();
                    break;
                } else {
                    System.out.println("Yeniden");
                    switchY();
                }
            case 8:
                if (!(array[2][1].equals("Y") || array[2][1].equals("X"))) {
                    array[2][1] = "Y";
                    Gamelogic.gamedefault();
                    break;
                } else {
                    System.out.println("Yeniden");
                    switchY();
                }
            case 9:
                if (!(array[2][2].equals("Y") || array[2][2].equals("X"))) {
                    array[2][2] = "Y";
                    Gamelogic.gamedefault();
                    break;
                } else {
                    System.out.println("Yeniden");
                    switchY();
                }
            default:
                System.out.println("Yanlış dəyər! 1-9 arası ədəd daxil edin.");
        }
    }

}
