import java.util.Scanner;

public class tac_tie_toe {
    private static final char EMPTY = '-';
    private static final char PLAYER_X = 'X';
    private static final char PLAYER_O = 'O';

    private static char[][] board = new char[3][3];
    private static char currentPlayer = PLAYER_X;

    public static void main(String[] args) {
        initializeBoard();
        printBoard();

        Scanner scanner = new Scanner(System.in);

        while (!isGameOver()) {
            if (currentPlayer == PLAYER_X) {
                System.out.print("Player X's turn. Enter row (0-2): ");
                int row = scanner.nextInt();
                System.out.print("Enter column (0-2): ");
                int col = scanner.nextInt();
                makeMove(row, col);
            } else {
                System.out.println("Player O's turn (AI):");
                int[] move = getBestMove();
                makeMove(move[0], move[1]);
            }

            printBoard();
            switchPlayer();
        }

        scanner.close();
        displayResult();
    }

    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    private static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    private static boolean isGameOver() {
        return hasPlayerWon(PLAYER_X) || hasPlayerWon(PLAYER_O) || isBoardFull();
    }

    private static boolean hasPlayerWon(char player) {
        // Check rows, columns, and diagonals
        return (board[0][0] == player && board[0][1] == player && board[0][2] == player)
                || (board[1][0] == player && board[1][1] == player && board[1][2] == player)
                || (board[2][0] == player && board[2][1] == player && board[2][2] == player)
                || (board[0][0] == player && board[1][0] == player && board[2][0] == player)
                || (board[0][1] == player && board[1][1] == player && board[2][1] == player)
                || (board[0][2] == player && board[1][2] == player && board[2][2] == player)
                || (board[0][0] == player && board[1][1] == player && board[2][2] == player)
                || (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void makeMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != EMPTY) {
            System.out.println("Invalid move. Try again.");
        } else {
            board[row][col] = currentPlayer;
        }
    }

    private static void switchPlayer() {
        currentPlayer = (currentPlayer == PLAYER_X) ? PLAYER_O : PLAYER_X;
    }

    private static void displayResult() {
        if (hasPlayerWon(PLAYER_X)) {
            System.out.println("Player X wins!");
        } else if (hasPlayerWon(PLAYER_O)) {
            System.out.println("Player O wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }

    private static int[] getBestMove() {
        int[] bestMove = new int[] { -1, -1 };
        int bestScore = Integer.MIN_VALUE;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == EMPTY) {
                    board[i][j] = PLAYER_O;
                    int score = minimax(board, 0, false);
                    board[i][j] = EMPTY;
                    if (score > bestScore) {
                        bestScore = score;
                        bestMove[0] = i;
                        bestMove[1] = j;
                    }
                }
            }
        }

        return bestMove;
    }

    private static int minimax(char[][] board, int depth, boolean isMaximizing) {
        if (hasPlayerWon(PLAYER_X)) {
            return -10;
        } else if (hasPlayerWon(PLAYER_O)) {
            return 10;
        } else if (isBoardFull()) {
            return 0;
        }

        if (isMaximizing) {
            int bestScore = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == EMPTY) {
                        board[i][j] = PLAYER_O;
                        bestScore = Math.max(bestScore, minimax(board, depth + 1, false));
                        board[i][j] = EMPTY;
                    }
                }
            }
            return bestScore;
        } else {
            int bestScore = Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == EMPTY) {
                        board[i][j] = PLAYER_X;
                        bestScore = Math.min(bestScore, minimax(board, depth + 1, true));
                        board[i][j] = EMPTY;
                    }
                }
            }
            return bestScore;
        }
    }
}

