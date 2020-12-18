package day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ChessBoard {

    ChessPiece[][] chessboard;

    public ChessBoard(ChessPiece[][] chessBoard) {
        this.chessboard = chessBoard;
    }

    public void print() {
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length; j++) {
                System.out.print(chessboard[i][j].getName());
            }
            System.out.println();
        }
    }
}