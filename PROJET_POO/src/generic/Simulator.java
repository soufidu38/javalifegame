package generic;
import java.awt.*;
import gui.*;

public class Simulator implements Simulable {
	public static final int WINDOW_WIDTH = 800;
	public static final Color WINDOW_COLOR= Color.WHITE;
	
	protected GUISimulator gui;
	protected Grid grid;
	
	public Simulator(Grid grid) {
		this.grid=grid;
	}
	
	public void setGrid(Grid grid) {
		this.grid=grid;
	}
	
	
	@Override
	public void next() {
		
	}

	@Override
	public void restart() {
		
	}
}
