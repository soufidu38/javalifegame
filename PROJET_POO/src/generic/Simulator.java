package generic;
import java.awt.*;
import gui.*;

public class Simulator implements Simulable{
	public static final int WINDOW_WIDTH = 800;
	public static final Color WINDOW_COLOR= Color.WHITE;
	
	protected GUISimulator gui;
	protected Grid grid;
	
	public Simulator(Grid grid) {
		this.grid=grid;
		setGrid(this.grid);
		gui = new GUISimulator(WINDOW_WIDTH,WINDOW_WIDTH, WINDOW_COLOR);
		gui.setSimulable(this); 
	} 
	 
	public void setGrid(Grid grid) {
		this.grid=grid;
	}
	
	
	@Override
	public void next() {
		gui.reset();
		try {
			grid.computeNextGrid();
			grid.draw(gui);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void restart() {
		gui.reset();

	}
}
