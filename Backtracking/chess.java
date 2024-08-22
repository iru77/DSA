package Backtracking;


public class chess {

    public static void Print(char board[][])
    {
        System.out.println("------------Chess Board--------------");
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void chessboard(char board[][],int row)
    {
        if(row==board.length)
        {
            Print(board);
            return;
        }

        for(int j=0;j<board.length;j++)
        {
           if(IsSafe(board, row, j))
           {
                board[row][j]='Q';
                chessboard(board, row+1);
                board[row][j]='X';
           }
        }
    }

    public static boolean IsSafe(char board[][],int row, int col)
    {
        // vertically up
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col]=='Q')
            {
                return false;
            }
        }

        // diao left up
        for(int i=row-1, j=col-1;i>=0&&j>=0;i--,j--)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }

        // diao right up
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];
        // initilize
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                board[i][j]='X';
            }
        }
        chessboard(board,0);
    }
}
