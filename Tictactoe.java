import java.util.Scanner;
import java.util.Random;
public class Tictactoe
{
    char[][]tictactoe = new char[3][3];
    public static void main(String[]args)
    {
        System.out.println("Welcome to a game of Tic Tac Toe!");
        char[][]tictactoe = new char[3][3];
        for(int i = 0; i < tictactoe.length; i++)
        {
            for(int j = 0; j < tictactoe[i].length; j++)
            {
                tictactoe[i][j] = '*';
            }
        }
        tictactoegame(tictactoe);
        
    }
    public static void tictactoegame(char[][]tictactoe)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your coordinates");
        int user_coord1;
        int user_coord2;
        System.out.println("Enter you first coordinate");
        user_coord1 = scanner.nextInt();
        System.out.println("Enter the second coordinate");
        user_coord2 = scanner.nextInt();
        while(!((user_coord1 >= 0 && user_coord1 < tictactoe.length) && (user_coord2 >= 0 && user_coord2 < tictactoe[0].length)) && (tictactoe[user_coord1][user_coord2] != '*'))
        {
            System.out.println("Invalid coordinates or already filled try again");
            System.out.println("Enter you first coordinate");
            user_coord1 = scanner.nextInt();
            System.out.println("Enter the second coordinate");
            user_coord2 = scanner.nextInt();
        }
        tictactoe[user_coord1][user_coord2] = 'O';

        Random rand = new Random();
        System.out.println("Computer's turn");
        int computer_coord1 = rand.nextInt(3);
        int computer_coord2 = rand.nextInt(3);
        while(tictactoe[computer_coord1][computer_coord2] != '*')
        {
            computer_coord1 = rand.nextInt(3);
            computer_coord2 = rand.nextInt(3);
        }
        tictactoe[computer_coord1][computer_coord2]='X';
        for(int i = 0; i < tictactoe.length; i++)
        {
            for(int j = 0; j < tictactoe[0].length; j++)
            {
                System.out.print(tictactoe[i][j]+" ");
            }
            System.out.println("\n");
        }

    }   
   
}