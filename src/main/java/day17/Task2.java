package day17;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<Point, ChessPiece> initialSetup = new HashMap<>();
        initialSetup.put(new Point(0, 0), ChessPiece.ROOK_BLACK);
        initialSetup.put(new Point(0, 5), ChessPiece.ROOK_BLACK);
        initialSetup.put(new Point(0, 6), ChessPiece.KING_BLACK);
        initialSetup.put(new Point(1, 1), ChessPiece.ROOK_WHITE);
        initialSetup.put(new Point(1, 4), ChessPiece.PAWN_BLACK);
        initialSetup.put(new Point(1, 5), ChessPiece.PAWN_BLACK);
        initialSetup.put(new Point(1, 7), ChessPiece.PAWN_BLACK);
        initialSetup.put(new Point(2, 0), ChessPiece.PAWN_BLACK);
        initialSetup.put(new Point(2, 2), ChessPiece.KNIGHT_BLACK);
        initialSetup.put(new Point(2, 6), ChessPiece.PAWN_BLACK);
        initialSetup.put(new Point(3, 0), ChessPiece.QUEEN_BLACK);
        initialSetup.put(new Point(3, 3), ChessPiece.BISHOP_WHITE);
        initialSetup.put(new Point(4, 3), ChessPiece.BISHOP_BLACK);
        initialSetup.put(new Point(4, 4), ChessPiece.PAWN_WHITE);
        initialSetup.put(new Point(5, 4), ChessPiece.BISHOP_WHITE);
        initialSetup.put(new Point(5, 5), ChessPiece.PAWN_WHITE);
        initialSetup.put(new Point(6, 0), ChessPiece.PAWN_WHITE);
        initialSetup.put(new Point(6, 3), ChessPiece.QUEEN_WHITE);
        initialSetup.put(new Point(6, 5), ChessPiece.PAWN_WHITE);
        initialSetup.put(new Point(6, 7), ChessPiece.PAWN_WHITE);
        initialSetup.put(new Point(7, 5), ChessPiece.ROOK_WHITE);
        initialSetup.put(new Point(7, 6), ChessPiece.KING_WHITE);

        ChessBoard chessBoard = new ChessBoard(initialSetup);
        chessBoard.printBoard();
    }
}

//         ChessBoard chessBoard = new Map<Point, ChessBoard>(new ChessPiece[][]{
//
//                {ChessPiece.ROOK_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROOK_BLACK, ChessPiece.KING_BLACK, ChessPiece.EMPTY},
//                {ChessPiece.EMPTY, ChessPiece.ROOK_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK},
//                {ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.KNIGHT_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY},
//                {ChessPiece.QUEEN_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY},
//                {ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_BLACK, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY},
//                {ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY},
//                {ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.QUEEN_WHITE, ChessPiece.EMPTY, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.PAWN_WHITE},
//                {ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROOK_WHITE, ChessPiece.KING_WHITE, ChessPiece.EMPTY}
//        });
