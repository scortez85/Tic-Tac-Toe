package keywords;

import com.sun.media.jfxmedia.events.NewFrameEvent;

import edu.jsu.mcis.*;

public class TicTacToeKeywords {
	public TicTacToeModel model;
    
	public void startNewGame() {
		model = new TicTacToeModel();
		model.initGame();
	}
	
	public void markLocation(int row, int col) {
		model.setMark(row, col);
	}
	
	public String getMark(int row, int col) {
        return "";
	}
    
	public String getWinner() {
        return "";
	}
}
