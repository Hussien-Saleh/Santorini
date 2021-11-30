package chessboard;

public class ChessBoard
{
    private boolean belongsToPlayer(char piece, int player)
    {
        if (player == 0 && Character.isUpperCase(piece))
            return true;
        if (player== 1 && Character.isLowerCase(piece)){
            return true;
        }
        return false;
    }

    public int getCount(String[] board, int player)
    {
        int count = 0;

        int size = board.length;
        for (int i =0; i < size; i++){
            for (int j = 0; j < size; j++)
                if (belongsToPlayer(board[i].charAt(j), player)){
                    count++;
                }
        }
        return count;
    }
}
