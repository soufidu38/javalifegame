package schelling;

import java.awt.Color;

import generic.*;

public class SchellingCell extends GenericCell {

	private static final Color[] colors = { Color.BLUE, Color.BLACK };
	private static int nbStatus;
	private static int K;
	private int i;
	private int j;
	private int status;

	public SchellingCell(int i, int j, int cellSize) {
		super(i, j, cellSize);
		// TODO Auto-generated constructor stub
	}

	public SchellingCell(SchellingCell toCopy) {

	}

	public boolean isEmpty() {

	}

	public boolean hasToMove(Cell[][] neighborhood) {

	}

	public int getNbNeighboorDifferentColor(Cell[][] neighborhood) {

	}

	public void moveFrom(SchellingCell otherCell) {

	}

	public void moveOut() {

	}

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}

	public void setRandomStatus() {

	}

	public Cell getNewCell(Cell[][] neighborhood) {

	}

	public Color getFillColor() {

	}

	public static int getNbStatus() {
		return nbStatus;
	}

	public static void setNbStatus(int nbStatus) {
		SchellingCell.nbStatus = nbStatus;
	}

	public static int getK() {
		return K;
	}

	public static void setK(int k) {
		K = k;
	}

}
