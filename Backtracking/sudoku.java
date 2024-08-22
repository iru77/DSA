package Backtracking;

public class sudoku {

    public static boolean IsSafe(int sudoku[][], int row, int col, int digit)
    {
        // row
        for(int i=0;i<=8;i++)
        {
            if(sudoku[i][col]==digit || sudoku[row][i]==digit)
            {
                return false;
            }
        }

        // grid  fk
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++)
        {
            for(int j=sc;j<sc+3;j++)
            {
                if(sudoku[i][j]==digit)
                {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean game(int sudoku[][], int row,int col)
    {
        // base
        if(row==9)
        {
            return true;
        }

        int nextrow=row,  nextcol=col+1;
        if(col+1==9)
        {
           nextrow=row+1;
            nextcol=0;
        }

        if(sudoku[row][col] !=0)
        {
            return game(sudoku, nextrow, nextcol);
        }

        for(int digit=1; digit<=9;digit++)
        {
            if(IsSafe(sudoku,row,col,digit))
            {
                sudoku[row][col]=digit;
                if(game(sudoku, nextrow, nextcol))
                {
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int sudokugame[][]={{8,2,0,0,5,0,4,0,6},
                            {1,5,6,0,2,9,3,7,0},
                            {0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,0,2,0,4,0},
                            {2,0,8,0,9,0,1,0,7},
                            {0,4,0,1,0,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0},
                            {0,8,2,9,3,0,5,6,1},
                            {9,0,3,0,6,0,0,8,4}};
     
        if(game(sudokugame,0,0))
        {
            System.out.println("Solution is possible");
            PrintS(sudokugame);
        }
        else{
            System.out.println("Solutin is not Possible");
        }
    }

    public static void PrintS(int sudoku[][])
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
}
