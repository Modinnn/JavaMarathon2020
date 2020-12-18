package day17;

import java.util.Arrays;

import static day17.ChessPiece.PAWN_WHITE;
import static day17.ChessPiece.ROOK_BLACK;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] piece = new ChessPiece[8];
        for (int i = 0; i < piece.length; i++) {
            piece[i] = PAWN_WHITE;
            if (i > 3) {
                piece[i] = ROOK_BLACK;
            }
        }
        System.out.println(Arrays.toString(piece));
    }
}