package tictactoe;

import java.util.Scanner;

public class TicTacToe {
    public static char letter, player, computer;

    //Method to give player chance to choose character X or O before starting game
    public static char chooseLetterXorO() {
        System.out.println("Choose a letter between x or o before starting game");
        Scanner scanner = new Scanner(System.in);
        letter = scanner.next().charAt(0);
        return letter;
    }

    public static void main(String[] args) {
        char[] gameBoard = new char[10];
        for (int i = 1; i < 10; i++) {
            gameBoard[i] = (char) (-+'0');
        }
        System.out.println("Welcome to TicTacToe game");
        for (int i = 1; i < 10; i++) {
            if (i == 4 || i == 7) {
                System.out.println();
            }
            System.out.print(gameBoard[i] + " ");
        }
        System.out.println();
        //player choose a letter between x or o to proceed
        player = chooseLetterXorO();
        if (player == 'x') {
            computer = 'o';
        } else {
            computer = 'x';
        }

    }
}