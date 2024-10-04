public class Tictactoe
{
    char[][]tictactoe = new char[3][3];
    public static void main(String[]args)
    {
        char[][]tictactoe = new char[3][3];
        for(int i = 0; i < tictactoe.length; i++)
        {
            for(int j = 0; j < tictactoe[i].length; j++)
            {
                tictactoe[i][j] = '*';
            }
        }
        System.out.println(tictactoe[0][0]);
    }
   
}