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
        int maxturns = tictactoe.length * tictactoe[0].length;
        int currentturn = 0;
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
        currentturn +=1;
        if(maxturns % 2 == 1)
        {
            if(currentturn == maxturns)
            {
                
            }
        }
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
    private static boolean checkwins(char[][]tictactoe)
    {
        return true;
    }
    private static boolean checkhorizontaluserwinner(char[][]tictactoe)
    {
        boolean horizontaluserwin = false;
        
        for(int i = 0; i < tictactoe.length; i++)
        {
            for(int j = 0; j < tictactoe[0].length; j++)
            {
                if(tictactoe[i][j]=='O')
                {
                    horizontaluserwin = true;
                }
                else
                {
                    horizontaluserwin = false;
                    break;
                }
            }
            if(horizontaluserwin == true)
            {
                break;
            }
        }
        return horizontaluserwin;
    }
    private static boolean checkhorizontalCPUwinner(char[][]tictactoe)
    {
        boolean horizontalCPUwin = false;
        for(int i = 0; i < tictactoe.length; i++)
        {
            for(int j = 0; j < tictactoe[0].length; j++)
            {
                if(tictactoe[i][j]=='X')
                {
                    horizontalCPUwin = true;
                }
                else
                {
                    horizontalCPUwin = false;
                    break;
                }
            }
            if(horizontalCPUwin == true)
            {
                break;
            }
        }
        return horizontalCPUwin;
    }
    private static boolean checkverticaluserwinner(char[][]tictactoe)
    {
        boolean verticaluserwin = false;
        for(int i = 0; i < tictactoe.length; i++)
        {
            for(int j = 0; j < tictactoe[0].length; j++)
            {
                if(tictactoe[j][i]=='O')
                {
                    verticaluserwin = true;
                }
                else
                {
                    verticaluserwin = false;
                    break;
                }
            }
            if(verticaluserwin == true)
            {
                break;
            }
        }
        return verticaluserwin;
    }
    private static boolean checkverticalCPUwinner(char[][]tictactoe)
    {
        boolean verticalcpuwin = false;
        for(int i = 0; i < tictactoe.length; i++)
        {
            for(int j = 0; j < tictactoe[0].length; j++)
            {
                if(tictactoe[j][i]=='X')
                {
                    verticalcpuwin = true;
                }
                else
                {
                    verticalcpuwin = false;
                    break;
                }
            }
            if(verticalcpuwin == true)
            {
                break;
            }
        }
        return verticalcpuwin;
    }
    private static boolean diagnolsuserwinner(char[][]tictactoe)
    {
        boolean diagnolsuserwin = false;
        boolean diagnolsuserfirst = false;
        boolean diagnolsusersecond = false;
        for(int i = 0; i < tictactoe.length; i++)
        {
            if(tictactoe[i][i]=='O')
            {
                diagnolsuserfirst = true;
            }
            else{
                diagnolsuserfirst = false;
                break;
            }
        }
        for(int j = 0; j < tictactoe.length; j++)
        {
            if(tictactoe[j][tictactoe[j].length-1-j]=='O')
            {
                diagnolsusersecond = true;
            }
            else
            {
                diagnolsusersecond = false;
                break;
            }
        }
        diagnolsuserwin = diagnolsuserfirst ||  diagnolsusersecond;
        return diagnolsuserwin;
        
    }
    private static boolean diagnolcpuwinner(char[][]tictactoe)
    {
        boolean diagnolcpuwin = false;
        boolean diagnolcpufirst = false;
        boolean diagnolcpusecond = false;
        for(int i = 0; i < tictactoe.length; i++)
        {
            if(tictactoe[i][i]=='X')
            {
                diagnolcpufirst = true;
            }
            else{
                diagnolcpusecond = false;
                break;
            }
        }
        for(int j = 0; j < tictactoe.length; j++)
        {
            if(tictactoe[j][tictactoe[j].length-1-j]=='O')
            {
                diagnolcpufirst = true;
            }
            else
            {
                diagnolcpusecond = false;
                break;
            }
        }
        diagnolcpuwin = diagnolcpufirst || diagnolcpusecond;
        return diagnolcpuwin;
    }
    
}