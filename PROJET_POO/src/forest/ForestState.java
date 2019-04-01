package forest;
import java.awt.*;

public enum ForestState {
	EMPTY(Color.WHITE),
	TREE(Color.GREEN),
	FIRE(Color.RED),
	ASHES(Color.GRAY);
	
	private Color color;
	
	private ForestState(Color color) {
		this.color=color;
	}
	
	private Color getColor() {
		return color;
	}
}
