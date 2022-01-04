package ArrayFirst;

public class HighArray {
    public static void main(String[] args) {
        int [][] board = new int [10][10];
        int x = 0;
        int y = 0;
        for (int i = 0; i < board.length; i++)
        {
            y++;
            x = 0;
            for (int j = 0; j < board.length; j++)
            {
                if (x == 0)
                {
                switch (y) {
                    case 1:
                        System.out.println("X         X");
                        x++;
                        break;
                    case 2:
                        System.out.println(" X       X ");
                        x++;
                        break;
                    case 3:
                        System.out.println("  X     X   ");
                        x++;
                        break;
                    case 4:
                        System.out.println("    X  X   ");
                        x++;
                        break;
                    case 5:
                        System.out.println("     XX    ");
                        x++;
                        break;
                    case 6:
                        System.out.println("    X  X   ");
                        x++;
                        break;
                    case 7:
                        System.out.println("  X     X   ");
                        x++;
                        break;
                    case 8:
                        System.out.println(" X       X ");
                        x++;
                        break;
                    case 9:
                        System.out.println("X         X");
                        x++;
                        break;
                    }
                }
            }
        }
    }
}
