import UI.UI;
import boardgame.Board;
import boardgame.Piece;
import chess.ChessMatch;

public class Application {
    public static void main(String[] args) {
        ChessMatch chessMatch  = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }

}
