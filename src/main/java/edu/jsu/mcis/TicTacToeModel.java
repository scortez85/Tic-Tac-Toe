package edu.jsu.mcis;

import java.util.Scanner;
import javax.xml.bind.PrintConversionEvent;


//import edu.jsu.mcis.TicTacToeModel.Mark;


import java.util.Random;
//package edu.jsu.mcis;
public class TicTacToeModel {
    public static Scanner userInput = new Scanner(System.in);
    public enum Mark {EMPTY, X, O};
    public static Mark[][] GameBoard;
    public boolean playerTurn;
    
	//public static Scanner input = new Scanner(System.in);
	public static int Row,Col;

    public TicTacToeModel()
    {
        initGame();
       

        
    }

    public void fillBoard()
    {
        initGame();
        
        for (int w=0;w<3;w++)
            for (int h=0;h<3;h++)
            {
                setMark(h,h);
            }
            
    }
public Mark checkForWinner()
{
    Mark returnMark = Mark.EMPTY;
    for (int h=0;h<3;h++)
    {
        if (GameBoard[h][0].equals(GameBoard[h][1]) && GameBoard[h][1].equals(GameBoard[h][2]) || GameBoard[0][h].equals(GameBoard[1][h]) && GameBoard[2][h].equals(GameBoard[2][h]) || GameBoard[0][0].equals(GameBoard[1][1]) && GameBoard[1][1].equals(GameBoard[2][2]) )
            returnMark = GameBoard[h][0];
    }
        return returnMark;
}
    public boolean isEmpty()
    {
        for (int w = 0;w<3;w++)
            for (int h = 0;h<3;h++)
            {
                if (!GameBoard[w][h].equals(Mark.EMPTY))
                    return false;
            }
            return true;
    }

    public void initGame()
    {
         GameBoard = new Mark[3][3];
        for (int w = 0;w < 3;w++)
        {
            for (int h=0;h<3;h++)
            {
                GameBoard[w][h] = Mark.EMPTY;
                playerTurn = true;
            }
        }
    }
    

     public Mark getMark(int row, int col) {
        return GameBoard[row][col];
    }
    
    public void setMark(int row, int col) {
        Mark myMark = (playerTurn)? Mark.X : Mark.O;
        if(GameBoard[row][col] == Mark.EMPTY) {
            GameBoard[row][col] = myMark;
            
            if (!GameBoard[row][col].equals(Mark.X) || !GameBoard[row][col].equals(Mark.O))
                playerTurn = !playerTurn;
        }
    }
}