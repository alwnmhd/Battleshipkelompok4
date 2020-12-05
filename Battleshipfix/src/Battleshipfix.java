import java.util.Scanner;
public class Battleshipfix {
    public static int numRows = 7;
    public static int numCols = 7;
    public static int user;
    public static int komputer;
    public static String[][] grid = new String[numRows][numCols];
    public static int[][] missedGuesses = new int[numRows][numCols];
    private static Battleshipfix BattleShips;

    public static void main(String[] args) {
        System.out.println("##### SELAMAT DATANG DI PERTEMPURAN #####");
        System.out.println("=========================================");
        System.out.println("Anda Siap Untuk Bertempur?\n");

        Map();

        kordinat();


    }

    public static void Map() {
        System.out.print("  ");
        for (int i = 0; i < numCols; i++)
            System.out.print(i);
        System.out.println();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = " ";
                if (j == 0)
                    System.out.print(i + "|" + grid[i][j]);
                else if (j == grid[i].length - 1)
                    System.out.print(grid[i][j] + "|" + i);
                else
                    System.out.print(grid[i][j]);
            }
            System.out.println();
        }

        System.out.print("  ");
        for (int i = 0; i < numCols; i++)
            System.out.print(i);
        System.out.println();
    }

    public static void kordinat() {
        Scanner input = new Scanner(System.in);

        System.out.println("\nMenyiapkan Kapal Perang:");
        Battleshipfix.user = 5;
        for (int i = 1; i <= Battleshipfix.user; ) {
            System.out.print("Input Kordinat X" + i + ": ");
            int x = input.nextInt();
            System.out.print("Input Kordinat Y" + i + ": ");
            int y = input.nextInt();

            if ((x >= 0 && x < numRows) && (y >= 0 && y < numCols) && (grid[x][y] == " ")) {
                grid[x][y] = "@";
                i++;
            } else if ((x >= 0 && x < numRows) && (y >= 0 && y < numCols) && grid[x][y] == "@")
                System.out.println("Kordinat Sudah Digunakan");
            else if ((x < 0 || x >= numRows) || (y < 0 || y >= numCols))
                System.out.println("Kordinat Hanya sampai " + numRows + "." + numCols + " bos");
        }
    }
}