import java.util.Random;
import java.util.Scanner;

public class mainClass
{

    public static int Random1(int min, int max)
    {

        if (min >= max)
        {
            throw new IllegalArgumentException("Max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static void main(String args[])
    {
        char[][] v = new char[10][12];
        int[][] n = new int [10][12];
        int linie, coloana, nivel = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("|   | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |");
        System.out.println("|---|---|---|---|---|---|---|---|---|---|----|");
        System.out.println("| 1 |   |   |   |   |   |   |   |   |   |    |");
        System.out.println("|---|---|---|---|---|---|---|---|---|---|----|");
        System.out.println("| 2 |   |   |   |   |   |   |   |   |   |    |");
        System.out.println("|---|---|---|---|---|---|---|---|---|---|----|");
        System.out.println("| 3 |   |   |   |   |   |   |   |   |   |    |");
        System.out.println("|---|---|---|---|---|---|---|---|---|---|----|");
        System.out.println("| 4 |   |   |   |   |   |   |   |   |   |    |");
        System.out.println("|---|---|---|---|---|---|---|---|---|---|----|");
        System.out.println("| 5 |   |   |   |   |   |   |   |   |   |    |");
        System.out.println("|---|---|---|---|---|---|---|---|---|---|----|");


            System.out.println("1.Beginner");
            System.out.println("2.Intermediate");
            System.out.println("3.Advanced");
            System.out.print("Choose your level : ");

            nivel = scan.nextInt();



        if(nivel == 1)
        {
            for(int i = 0 ; i <= 6 ; i++)
            {
                v[Random1(1,5)][Random1(1,10)] = 'B';
            }
        }
        else if(nivel == 2)
        {
            for(int i = 0 ; i <= 8 ; i++)
            {
                v[Random1(1,5)][Random1(1,10)] = 'B';
            }
        }
        else if(nivel == 3)
        {
            for(int i = 0 ; i <= 10 ; i++)
            {
                v[Random1(1,5)][Random1(1,10)] = 'B';
            }
        }
        else
        {
            System.out.println("ERROR!");
            System.exit(1);
        }

        for(int i = 1 ; i <= 5 ; i++)
        {
            for(int j = 1 ; j <= 10 ; j++)
            {
                n[i][j] = 0;
            }
        }

        for(int i = 1 ; i <= 5 ; i++)
        {
            for(int j = 1 ; j <= 10 ; j++)
            {
                if(v[i+1][j+1] == 'B') n[i][j]++;
                if(v[i][j+1] == 'B') n[i][j]++;
                if(v[i+1][j] == 'B') n[i][j]++;
                if(v[i-1][j+1] == 'B') n[i][j]++;
                if(v[i+1][j-1] == 'B') n[i][j]++;
                if(v[i-1][j-1] == 'B') n[i][j]++;
                if(v[i-1][j] == 'B') n[i][j]++;
                if(v[i][j-1] == 'B') n[i][j]++;
            }
        }


        do
        {

            System.out.print("Linie : ");
            linie = scan.nextInt();
            if(linie > 5 || linie < 1) System.exit(1);

            System.out.print("Coloana : ");
            coloana = scan.nextInt();
            if(coloana > 10 || coloana < 1) System.exit(1);


            if(v[linie][coloana] == 'B')
            {
                System.out.println("BOOM");
            }
            else if(v[linie][coloana] == 'L' || v[linie][coloana] == '1' || v[linie][coloana] == '2' || v[linie][coloana] == '3' || v[linie][coloana] == '0' || v[linie][coloana] == '4')
            {
                System.out.println("Casuta deja ocupata !");
            }
            else
            {
                v[linie][coloana] = 'L';

                if(v[linie+1][coloana+1] != 'B' && v[linie+1][coloana+1] != 'L' &&v[linie+1][coloana+1] != '0' && v[linie+1][coloana+1] != '1' && v[linie+1][coloana+1] != '2' && v[linie+1][coloana+1] != '3' && v[linie+1][coloana+1] != '4' ) v[linie+1][coloana+1] = (char)(n[linie+1][coloana+1] + '0');
                if(v[linie+1][coloana+1] == '0') v[linie+1][coloana+1] ='L';

                if(v[linie][coloana+1] != 'B' && v[linie][coloana+1] != 'L' &&v[linie][coloana+1] != '0' && v[linie][coloana+1] != '1' && v[linie][coloana+1] != '2' && v[linie][coloana+1] != '3' && v[linie][coloana+1] != '4' ) v[linie][coloana+1] = (char)(n[linie][coloana+1] + '0');
                if(v[linie][coloana+1] == '0') v[linie][coloana+1] ='L';

                if(v[linie+1][coloana] != 'B' && v[linie+1][coloana] != 'L' &&v[linie+1][coloana] != '0' && v[linie+1][coloana] != '1' && v[linie+1][coloana] != '2' && v[linie+1][coloana] != '3' && v[linie+1][coloana] != '4' ) v[linie+1][coloana] = (char)(n[linie+1][coloana] + '0');
                if(v[linie+1][coloana] == '0') v[linie+1][coloana] ='L';

                if(v[linie-1][coloana-1] != 'B' && v[linie-1][coloana-1] != 'L' &&v[linie-1][coloana-1] != '0' && v[linie-1][coloana-1] != '1' && v[linie-1][coloana-1] != '2' && v[linie-1][coloana-1] != '3' && v[linie-1][coloana-1] != '4' ) v[linie-1][coloana-1] = (char)(n[linie-1][coloana-1] + '0');
                if(v[linie-1][coloana-1] == '0') v[linie-1][coloana-1] ='L';

                if(v[linie-1][coloana] != 'B' && v[linie-1][coloana] != 'L' &&v[linie-1][coloana] != '0' && v[linie-1][coloana] != '1' && v[linie-1][coloana] != '2' && v[linie-1][coloana] != '3' && v[linie-1][coloana] != '4' ) v[linie-1][coloana] = (char)(n[linie-1][coloana] + '0');
                if(v[linie-1][coloana] == '0') v[linie-1][coloana] ='L';

                if(v[linie][coloana-1] != 'B' && v[linie][coloana-1] != 'L' &&v[linie][coloana-1] != '0' && v[linie][coloana-1] != '1' && v[linie][coloana-1] != '2' && v[linie][coloana-1] != '3' && v[linie][coloana-1] != '4' ) v[linie][coloana-1] = (char)(n[linie][coloana-1] + '0');
                if(v[linie][coloana-1] == '0') v[linie][coloana-1] ='L';

                if(v[linie-1][coloana+1] != 'B' && v[linie-1][coloana+1] != 'L' &&v[linie-1][coloana+1] != '0' && v[linie-1][coloana+1] != '1' && v[linie-1][coloana+1] != '2' && v[linie-1][coloana+1] != '3' && v[linie-1][coloana+1] != '4' ) v[linie-1][coloana+1] = (char)(n[linie-1][coloana+1] + '0');
                if(v[linie-1][coloana+1] == '0') v[linie-1][coloana+1] ='L';

                if(v[linie+1][coloana-1] != 'B' && v[linie+1][coloana-1] != 'L' &&v[linie+1][coloana-1] != '0' && v[linie+1][coloana-1] != '1' && v[linie+1][coloana-1] != '2' && v[linie+1][coloana-1] != '3' && v[linie+1][coloana-1] != '4' ) v[linie+1][coloana-1] = (char)(n[linie+1][coloana-1] + '0');
                if(v[linie+1][coloana-1] == '0') v[linie+1][coloana-1] ='L';


                    System.out.println("|   | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |");
                    System.out.println("|---|---|---|---|---|---|---|---|---|---|----|");
                    System.out.print("| 1 | ");
                    if (v[1][1] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[1][1] + " | ");
                    }
                    if (v[1][2] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[1][2] + " | ");
                    }
                    if (v[1][3] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[1][3] + " | ");
                    }
                    if (v[1][4] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[1][4] + " | ");
                    }
                    if (v[1][5] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[1][5] + " | ");
                    }
                    if (v[1][6] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[1][6] + " | ");
                    }
                    if (v[1][7] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[1][7] + " | ");
                    }
                    if (v[1][8] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[1][8] + " | ");
                    }
                    if (v[1][9] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[1][9] + " | ");
                    }
                    if (v[1][10] == 'B')
                    {
                        System.out.println("   | ");
                    }
                    else
                    {
                        System.out.println(v[1][10] + "  | ");
                    }
                    System.out.println("|---|---|---|---|---|---|---|---|---|---|----|");
                    System.out.print("| 2 | ");
                    if (v[2][1] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[2][1] + " | ");
                    }
                    if (v[2][2] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[2][2] + " | ");
                    }
                    if (v[2][3] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[2][3] + " | ");
                    }
                    if (v[2][4] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[2][4] + " | ");
                    }
                    if (v[2][5] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[2][5] + " | ");
                    }
                    if (v[2][6] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[2][6] + " | ");
                    }
                    if (v[2][7] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[2][7] + " | ");
                    }
                    if (v[2][8] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[2][8] + " | ");
                    }
                    if (v[2][9] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[2][9] + " | ");
                    }
                    if (v[2][10] == 'B')
                    {
                        System.out.println("   | ");
                    }
                    else
                    {
                        System.out.println(v[2][10] + "  | ");
                    }
                    System.out.println("|---|---|---|---|---|---|---|---|---|---|----|");
                    System.out.print("| 3 | ");
                    if (v[3][1] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[3][1] + " | ");
                    }
                    if (v[3][2] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[3][2] + " | ");
                    }
                    if (v[3][3] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[3][3] + " | ");
                    }
                    if (v[3][4] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[3][4] + " | ");
                    }
                    if (v[3][5] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[3][5] + " | ");
                    }
                    if (v[3][6] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[3][6] + " | ");
                    }
                    if (v[3][7] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[3][7] + " | ");
                    }
                    if (v[3][8] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[3][8] + " | ");
                    }
                    if (v[3][9] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[3][9] + " | ");
                    }
                    if (v[3][10] == 'B')
                    {
                        System.out.println("   | ");
                    }
                    else
                    {
                        System.out.println(v[3][10] + "  | ");
                    }
                    System.out.println("|---|---|---|---|---|---|---|---|---|---|----|");
                    System.out.print("| 4 | ");
                    if (v[4][1] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[4][1] + " | ");
                    }
                    if (v[4][2] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[4][2] + " | ");
                    }
                    if (v[4][3] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[4][3] + " | ");
                    }
                    if (v[4][4] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[4][4] + " | ");
                    }
                    if (v[4][5] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[4][5] + " | ");
                    }
                    if (v[4][6] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[4][6] + " | ");
                    }
                    if (v[4][7] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[4][7] + " | ");
                    }
                    if (v[4][8] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[4][8] + " | ");
                    }
                    if (v[4][9] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[4][9] + " | ");
                    }
                    if (v[4][10] == 'B')
                    {
                        System.out.println("   | ");
                    }
                    else
                    {
                        System.out.println(v[4][10] + "  | ");
                    }
                    System.out.println("|---|---|---|---|---|---|---|---|---|---|----|");
                    System.out.print("| 5 | ");
                    if (v[5][1] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[5][1] + " | ");
                    }
                    if (v[5][2] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[5][2] + " | ");
                    }
                    if (v[5][3] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[5][3] + " | ");
                    }
                    if (v[5][4] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[5][4] + " | ");
                    }
                    if (v[5][5] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[5][5] + " | ");
                    }
                    if (v[5][6] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[5][6] + " | ");
                    }
                    if (v[5][7] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[5][7] + " | ");
                    }
                    if (v[5][8] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[5][8] + " | ");
                    }
                    if (v[5][9] == 'B')
                    {
                        System.out.print("  | ");
                    }
                    else
                    {
                        System.out.print(v[5][9] + " | ");
                    }
                    if (v[5][10] == 'B')
                    {
                        System.out.println("   | ");
                    }
                    else
                    {
                        System.out.println(v[5][10] + "  | ");
                    }
                    System.out.println("|---|---|---|---|---|---|---|---|---|---|----|");

            }

            if(v[1][1] != '\u0000' && v[1][2] != '\u0000' && v[1][3] != '\u0000' && v[1][4] != '\u0000' && v[1][5] != '\u0000' && v[1][6] != '\u0000' && v[1][7] != '\u0000' && v[1][8] != '\u0000' && v[1][9] != '\u0000' && v[1][10] != '\u0000'
           && v[2][1] != '\u0000' && v[2][2] != '\u0000' && v[2][3] != '\u0000' && v[2][4] != '\u0000' && v[2][5] != '\u0000' && v[2][6] != '\u0000' && v[2][7] != '\u0000' && v[2][8] != '\u0000' && v[2][9] != '\u0000' && v[2][10] != '\u0000'
           && v[3][1] != '\u0000' && v[3][2] != '\u0000' && v[3][3] != '\u0000' && v[3][4] != '\u0000' && v[3][5] != '\u0000' && v[3][6] != '\u0000' && v[3][7] != '\u0000' && v[3][8] != '\u0000' && v[3][9] != '\u0000' && v[3][10] != '\u0000'
           && v[4][1] != '\u0000' && v[4][2] != '\u0000' && v[4][3] != '\u0000' && v[4][4] != '\u0000' && v[4][5] != '\u0000' && v[4][6] != '\u0000' && v[4][7] != '\u0000' && v[4][8] != '\u0000' && v[4][9] != '\u0000' && v[4][10] != '\u0000'
           && v[5][1] != '\u0000' && v[5][2] != '\u0000' && v[5][3] != '\u0000' && v[5][4] != '\u0000' && v[5][5] != '\u0000' && v[5][6] != '\u0000' && v[5][7] != '\u0000' && v[5][8] != '\u0000' && v[5][9] != '\u0000' && v[5][10] != '\u0000')
            {
                System.out.println("|   | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |");
                System.out.println("|---|---|---|---|---|---|---|---|---|---|----|");
                System.out.println("| 1 | "+v[1][1]+" | "+v[1][2]+" | "+v[1][3]+" | "+v[1][4]+" | "+v[1][5]+" | "+v[1][6]+" | "+v[1][7]+" | "+v[1][8]+" | "+v[1][9]+" | "+v[1][10]+"  |");
                System.out.println("|---|---|---|---|---|---|---|---|---|---|----|");
                System.out.println("| 2 | "+v[2][1]+" | "+v[2][2]+" | "+v[2][3]+" | "+v[2][4]+" | "+v[2][5]+" | "+v[2][6]+" | "+v[2][7]+" | "+v[2][8]+" | "+v[2][9]+" | "+v[2][10]+"  |");
                System.out.println("|---|---|---|---|---|---|---|---|---|---|----|");
                System.out.println("| 3 | "+v[3][1]+" | "+v[3][2]+" | "+v[3][3]+" | "+v[3][4]+" | "+v[3][5]+" | "+v[3][6]+" | "+v[3][7]+" | "+v[3][8]+" | "+v[3][9]+" | "+v[3][10]+"  | \t\t FELICITARI, ATI CASTIGAT !");
                System.out.println("|---|---|---|---|---|---|---|---|---|---|----|");
                System.out.println("| 4 | "+v[4][1]+" | "+v[4][2]+" | "+v[4][3]+" | "+v[4][4]+" | "+v[4][5]+" | "+v[4][6]+" | "+v[4][7]+" | "+v[4][8]+" | "+v[4][9]+" | "+v[4][10]+"  |");
                System.out.println("|---|---|---|---|---|---|---|---|---|---|----|");
                System.out.println("| 5 | "+v[5][1]+" | "+v[5][2]+" | "+v[5][3]+" | "+v[5][4]+" | "+v[5][5]+" | "+v[5][6]+" | "+v[5][7]+" | "+v[5][8]+" | "+v[5][9]+" | "+v[5][10]+"  |");
                System.out.println("|---|---|---|---|---|---|---|---|---|---|----|");
                System.exit(1);
            }


        } while (v[linie][coloana] != 'B');



    }
}
