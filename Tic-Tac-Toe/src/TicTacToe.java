import java.util.Scanner;

public class TicTacToe {
    public static final int X=1,O=-1;
    public static final int Empty=0;
    private int board[][]=new int[3][3];
    private int player;

    public TicTacToe(){
        clearBoard();
    }
    public void clearBoard(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j]=Empty;
                player=X;
            }
        }
    }
    public void putMark(int i, int j) throws IllegalArgumentException {
        if ((i < 0) || (i > 2) || (j < 0) || (j > 2))
             throw new IllegalArgumentException("Invalid board position");
        if (board[i][j] != Empty)
             throw new IllegalArgumentException("Board position occupied");
        board[i][j] = player;
        player =-player;
       }
    public boolean isWin(int mark) {

        return ((board[0][0] + board[0][1] + board[0][2] == mark*3)
         || (board[1][0] + board[1][1] + board[1][2] == mark*3)
         || (board[2][0] + board[2][1] + board[2][2] == mark*3)
         || (board[0][0] + board[1][0] + board[2][0] == mark*3)
         || (board[0][1] + board[1][1] + board[2][1] == mark*3)
         || (board[0][2] + board[1][2] + board[2][2] == mark*3)
         || (board[0][0] + board[1][1] + board[2][2] == mark*3)
         || (board[2][0] + board[1][1] + board[0][2] == mark*3));
         }

    public int winner( ) {
         if (isWin(X))
            return(X);
         else if (isWin(O))
             return(O);
         else
         return(0);
         }

    public String toString( ) {
         StringBuilder sb = new StringBuilder( );
         for (int i=0; i<3; i++) {
             for (int j=0; j<3; j++) {
                 switch (board[i][j]) {
                     case X: sb.append("X"); break;
                     case O: sb.append("O"); break;
                     case Empty: sb.append(" "); break;
                     }
                 if (j < 2) sb.append("|"); // column boundary
                 }
             if (i < 2) sb.append("\n-----\n"); // row boundary
             }
         return sb.toString( );
         }
    public static void main(String[ ] args) {
        Scanner scanner=new Scanner(System.in);
         TicTacToe game = new TicTacToe( );

        for (int i = 0; i <9 ; i++) {
            System.out.println(game);
            System.out.println("Enter the x,y");
            game.putMark(scanner.nextInt(),scanner.nextInt());
            if (i>3)
            {
                int winningPlayer = game.winner( );
                if (winningPlayer==1)
                {
                    System.out.println(" X wins");
                    break;
                }
                else if (winningPlayer==-1)
                {
                    System.out.println(" O wins");
                    break;
                }
                else {
                    if (i==8)
                        System.out.println("Tie");
                }

            }
        }



         }

}
