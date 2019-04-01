package forest;

import java.awt.Color;

import generic.*;

public class ForestCell extends GenericCell {

	private ForestState state;

	public ForestCell(int i, int j, int cellSize) {
		super(i, j, cellSize);
	}

	public Color getFillColor() {
		return state.valueOf(Color, EMPTY);
	}

	public void setRandomStatus() {
		int r = (int) Math.random() * 3;
		if (r == 0)
			state = ForestState.EMPTY;
		if (r == 1)
			state = ForestState.TREE;
		if (r == 2)
			state = ForestState.FIRE;
		if (r == 3)
			state = ForestState.ASHES;
	}

	public Cell getNewCell(Cell[][] neighborhood) {
		
	}

	public void setStatusToArbre() {
		state = ForestState.TREE;
	}

	public void setStatusToFeu() {
		state = ForestState.FIRE;
	}

	public ForestState getStatus() {
		return state;
	}

	protected boolean oneOfMyNeighboorIsOnFire(Cell[][] neighborhood) {
		Cell c;		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(i!=j) {
					c=new ForestCell(neighborhood[i][j].centre);
					if(c.state==ForestState.FIRE)
						return true;
				}
			}
		}
		return false;
	}

}
