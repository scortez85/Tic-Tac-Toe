package edu.jsu.mcis;
import java.util.Scanner;
import javax.xml.bind.PrintConversionEvent;
import java.util.Random;
import java.awt.*;

public class tictactoe
{
	public static String[][] GameBoard;
	public static Scanner s = new Scanner(System.in);
	public static int Row,Col;
	private static final Scanner keyboard = new Scanner(System.in);

        private static Point getUserMove() {
            return new Point();
    }
    
        private static void controlModel(TicTacToeModel model) {
    }
    
        private static void viewModel(TicTacToeModel model) {
    }

	public static void main(String[] args) {
        TicTacToeModel model = new TicTacToeModel();
        viewModel(model);
        controlModel(model);
        String conclusion = "The game is a tie.";
        System.out.println(conclusion);
		
	}
        
}