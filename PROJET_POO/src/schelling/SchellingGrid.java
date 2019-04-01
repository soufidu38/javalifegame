package schelling;

import generic.*;

public class SchellingGrid extends Grid{
	
	private double percentageFreeHouses;
	
	public SchellingGrid(int gridWidth, int cellWidth, int nbFamilles, int K, double percentageFreeHouses) {
		super(gridWidth, cellWidth);
		this.percentageFreeHouses=percentageFreeHouses;
		
	}
	
	protected Cell createRandomCell(int i, int j) {
		
	}
	
	protected void init() {
		
	}
	
	protected void computeNextGrid() {
		
	}

	
	
	
}
