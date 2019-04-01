package conway;

import generic.*;
import java.awt.Color;
import java.awt.Point;

// salut c'est jules !
public class ConwayCell extends GenericCell {

	private static final Color CELLS_ALIVE_COLOR = Color.BLUE;
	private static final Color CELLS_DEAD_COLOR = Color.WHITE;
	private boolean alive;

	protected ConwayCell(Point centre, int cellWidth) {
		super(centre, cellWidth);
		alive = false;
	}

	public ConwayCell(int i, int j, int cellSize) {
		super(i, j, cellSize);
		alive = false;
	}

	public Color getFillColor() {
		if (alive)
			return CELLS_ALIVE_COLOR;
		else
			return CELLS_DEAD_COLOR;
	}

	public void setRandomStatus() {
		int k = (int) Math.round(Math.random());
		if (k == 1)
			alive = true;
		else
			alive = false;
	}

	public Cell getNewCell(Cell[][] neighborhood) {
		Cell c = new ConwayCell
		if (getNbAliveNeighborhood(neighborhood) ==3) {
			
		}
		if(getNbAliveNeighborhood(neighborhood)==2) {
			alive = true;
		}
	}

	protected int getNbAliveNeighborhood(Cell[][] neighborhood) {
		int r = 0;
		Grid d;
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++) {
				ConwayCell c = new ConwayCell(d);;
			}
		}
		ConwayCell c =  (ConwayCell) new GenericCell(neighborhood[0][0].centre, 10);
		
		if (neighborhood[0][0].alive == true)
			r++;
		if (neighborhood[i][j - 1].isAlive() == true)
			r++;
		if (neighborhood[i + 1][j - 1].isAlive() == true)
			r++;
		if (neighborhood[i - 1][j].isAlive() == true)
			r++;
		if (neighborhood[i + 1][j].isAlive() == true)
			r++;
		if (grille[i - 1][j + 1].isAlive() == true)
			r++;
		if (grille[i][j + 1].isAlive() == true)
			r++;
		if (grille[i + 1][j + 1].isAlive() == true)
			r++;

		return r;
	}
}
