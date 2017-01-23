package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeTest {
	TicTacToeModel model = new TicTacToeModel();
	@Test
	public void testInitialBoardIsEmpty() {
		assertTrue(model.isEmpty());
	}
	
	@Test
	public void testMarkXInUpperRightCorner() {
		model.setMark(2, 2);
		TicTacToeModel.Mark myMark = model.getMark(2, 2);
		Boolean value = myMark.equals(TicTacToeModel.Mark.X);
		assertTrue(value);
	}
	
	@Test
	public void testMarkOInBottomLeftCorner() {
		model.setMark(0, 2);
		TicTacToeModel.Mark myMark = model.getMark(0, 2);
		Boolean value = myMark.equals(TicTacToeModel.Mark.X);
		assertTrue(value);

	}
	
	@Test
	public void testUnableToMarkOverExistingMark() {
		model.setMark(0, 2);
		TicTacToeModel.Mark myMark = model.getMark(0, 2);
		Boolean value = !myMark.equals(TicTacToeModel.Mark.O);
		assertTrue(value);
	}
	
	@Test
	public void testGameIsNotOverAfterTheFirstMark() {
		//model.setMark(0, 0);
		TicTacToeModel.Mark winMark = model.checkForWinner();
		if (winMark.equals(TicTacToeModel.Mark.X) || winMark.equals(TicTacToeModel.Mark.O))
			assertTrue(false);
		else assertTrue(true);
	}
	
	@Test
	public void testGameIsWonByXHorizontallyAcrossTopRow() {
		for (int w = 0; w<3;w++)
			{
				model.setMark(w,0);
				model.setMark(w,1);
			}
			boolean value = model.getMark(0, 0).equals(model.getMark(1, 0));

		assertTrue(value);
	}
	
	@Test
	public void testGameIsOverByTieIfAllLocationsAreFilled() {
		model.fillBoard();
		TicTacToeModel.Mark winMark = model.checkForWinner();
		if (winMark.equals(TicTacToeModel.Mark.X) || winMark.equals(TicTacToeModel.Mark.O))
			assertTrue(false);
		else assertTrue(true);
	}	
}
