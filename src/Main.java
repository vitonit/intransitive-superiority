import java.util.Random;

public class Main {


    public static void main(String[] args) {

        int[] ValueRed = {2, 2, 4, 4, 9, 9};
        int[] ValueYellow = {1, 1, 6, 6, 8, 8};
        int[] ValueGreen = {3, 3, 5, 5, 7, 7};

        int RedWin = 0;
        int YellowWin = 0;
        int GreenWin = 0;

        System.out.println();

            System.out.println("Бросаем Красный и Жёлтый кубики и сравниваем выпавшие числа");

        System.out.println();

            System.out.println("Value Red" + "         " + "Value Yellow");

        System.out.println();


        for (int x = 1; x < 15; x++)

            {

                int r = (int) (Math.random() * 6);

                int y = (int) (Math.random() * 6);
                System.out.println(r + " - " + ValueRed[r] + "                    " + y + " - " +  ValueYellow[y]);

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
            System.out.println();
            System.out.println("Red is Winner!");
        }
        else
        {
            System.out.println();
            System.out.println ("Yellow is Winner!");
        }


        System.out.println();

        System.out.println("Бросаем Жёлтый и  Зелёный кубики и сравниваем выпавшие числа");

        System.out.println();

        System.out.println("Value Green" + "         " + "Value Yellow");

        System.out.println();


        for (int x = 1; x < 15; x++)

        {

            int r = (int) (Math.random() * 6);

            int y = (int) (Math.random() * 6);
            System.out.println(ValueGreen[r] + "                    " + ValueYellow[y]);

            if (ValueGreen[r] > ValueYellow[y])
            {
                GreenWin = GreenWin +1;
            }
            else
            {
                YellowWin = YellowWin + 1;
            }

        }
        if (GreenWin > YellowWin)
        {
            System.out.println();
            System.out.println("Green is Winner!");
        }
        else
        {
            System.out.println();
            System.out.println ("Yellow is Winner!");

            System.out.println();

            System.out.println("Бросаем Красный и  Зелёный кубики и сравниваем выпавшие числа");

            System.out.println();

            System.out.println("Value Green" + "         " + "Value Red");

            System.out.println();


            for (int x = 1; x < 15; x++)

            {

                int r = (int) (Math.random() * 6);

                int y = (int) (Math.random() * 6);
                System.out.println(ValueGreen[r] + "                    " + ValueRed[y]);

                if (ValueGreen[r] > ValueRed[y])
                {
                    GreenWin = GreenWin +1;
                }
                else
                {
                    RedWin = RedWin + 1;
                }

            }
            if (GreenWin > RedWin)
            {
                System.out.println();
                System.out.println("Green is Winner!");
            }
            else
            {
                System.out.println();
                System.out.println ("Red is Winner!");
            }
        }

    }


    }


