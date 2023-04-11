package day17;


import java.awt.*;
import java.util.Map;

public class ChessBoard {

    private Map<Point, ChessPiece> board;

    public ChessBoard(Map<Point, ChessPiece> board) {
        this.board = board;
    }

    public void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Point point = new Point(i, j);
                ChessPiece piece = board.getOrDefault(point, ChessPiece.EMPTY);
                System.out.print(piece.getPicture());
            }
            System.out.println();
        }
    }
}

//    private ChessPiece[][] board;
//
//    public ChessBoard(ChessPiece[][] board) {
//        this.board = board;
//
//    }
//
//    public void printBoard() {
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board.length; j++) {

//                System.out.print(board[i][j].getPicture());
//            }
//            System.out.println();
//        }
//    }
//}