package generic;

import java.awt.Color;
import java.awt.Point;
import gui.*;

public abstract class GenericCell implements Cell {

	protected Point centre;
	protected int cellSize;

	protected GenericCell(Point centre, int cellSize) {
		this.centre = centre;
		this.cellSize = cellSize;
	}

	public GenericCell(int i, int j, int cellSize) {
		centre = new Point(i,j);
		this.cellSize = cellSize;
	}

	public Color getDrawColor() {
		if (cellSize > 4)
			return Color.BLACK;
		else
			return getFillColor();
	}

	public Rectangle getRepresentation() {
		Rectangle r = new Rectangle((int) centre.getX(), (int) centre.getY(), getDrawColor(), getFillColor(), cellSize);
		return r;
	}

	public Cell getNewCell(Cell[][] neighborhood) throws Exception{
		if (neighborhood[0].length==3 && neighborhood[1].length==3 && neighborhood.length == 3)
			return null;
		else {
			throw new Exception("Nuuuul");
		}
	}

	public Color getFillColor() {
		return Simulator.WINDOW_COLOR;
	}

	@Override
	public void setRandomStatus() {

	}
}
