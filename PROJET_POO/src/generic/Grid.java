package generic;

import java.awt.Color;

import gui.GUISimulator;
import gui.Rectangle;

public abstract class Grid {
	protected int gridWidth;
	protected int cellWidth;
	protected Cell[][] grid;

	public Grid(int gridWidth, int cellWidth) {
		this.gridWidth = gridWidth;
		this.cellWidth = cellWidth;
	}

	protected void init() {
		for (int i = 0; i < gridWidth; i++) {
			for (int j = 0; j < gridWidth; j++) {
				grid[i][j]= createRandomCell(i,j);
			}
		}
	}


	protected void computeNextGrid() throws Exception {
		Cell[][] g = grid;
		for (int i = 0; i < gridWidth; i++) {
			for (int j = 0; j < gridWidth; j++) {
				g[i][j] = grid[i][j].getNewCell(getNeighborhood(i,j));
			}
		}
		grid=g;
	}

	


	protected Cell[][] getNeighborhood(int i, int j) {
		Cell[][] c = null;
		c[0][0]=grid[i-1][j-1];
		c[0][1]=grid[i-1][j];
		c[0][2]=grid[i-1][j+1];
		c[1][0]=grid[i-1][j];
		c[1][1]=grid[i][j];
		c[1][2]=grid[i][j+1];
		c[2][0]=grid[i+1][j-1];
		c[2][1]=grid[i+1][j];
		c[2][2]=grid[i+1][j+1];
		return c;
	}

	protected void draw(GUISimulator gui) {
		for (int i = 0; i < gridWidth; i++) {
			for (int j = 0; j < gridWidth; j++) {
				gui.addGraphicalElement(grid[i][j].getRepresentation());
			}
		}
	}

	protected abstract Cell createRandomCell(int i, int j);

}
