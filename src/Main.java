import java.util.Random;

public class Main {


    public static void main(String[] args) {

        int[] ValueRed = {2, 4, 9, 2, 4, 9};
        int[] ValueYellow = {1, 6, 8, 1, 6, 8};
        int[] ValueGreen = {3, 5, 7, 3, 5, 7};

        int RedWin = 0;
        int YellowWin = 0;

        System.out.println();

            System.out.println("Бросаем Красный и Жёлтый кубики и сравниваем выпавшие числа");

        System.out.println();

            System.out.println("Winner Red" + "         " + "Winner Yellow");


        for (int x = 1; x < 15; x++)

            {

                int r = (int) (Math.random() * 6);

                int y = (int) (Math.random() * 6);
                System.out.println(r + "                    " + y);

                if (ValueRed[r] > ValueYellow[y])
                {
                    RedWin = RedWin +1;
                }
                else
                {
                    YellowWin = YellowWin + 1;
                }

            }
        if (RedWin > YellowWin)
        {
            System.out.println("RedWin is Winner!");
        }
        else
        {
            System.out.println ("YellowWin is Winner!");
        }


    }


    }


