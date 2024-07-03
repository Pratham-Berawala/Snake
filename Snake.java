import java.util.ArrayList;

public class Snake {
	private ArrayList<SnakePoint> coordinates;
	
	public Snake(String snakeLine){
		coordinates = new ArrayList<SnakePoint>();
		String[] vals = snakeLine.split(" "); 
		if (vals[0].equals("alive")){
			for (int i=3; i<vals.length; i++){
				SnakePoint sp = new SnakePoint(vals[i],",");
				coordinates.add(sp);
			}
		}
	}
	
	public ArrayList<SnakePoint> getCoordinates(){
		return coordinates;
	}
	
	public SnakePoint head(){
		return coordinates.get(0);
	}

}
