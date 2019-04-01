package generic;
import java.awt.Color;

import gui.*;

public interface Cell {

	
	public default void setRandomStatus() {
		
	}
	
	public default gui.GraphicalElement getRepresentation(){
		return null;
	}
	
	public default Cell getNewCell(Cell[][] neighborhood) throws Exception{
		return null;
	}
}
