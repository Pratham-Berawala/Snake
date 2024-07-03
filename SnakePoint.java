
public class SnakePoint {
	int x;
	int y;
	
	public SnakePoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public SnakePoint(String s, String seperator){
		String[] vals = s.split(seperator);
		this.x = Integer.parseInt(vals[0]);
		this.y = Integer.parseInt(vals[1]);
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public boolean above(SnakePoint other){
		return y<other.y;
	}
	
	public boolean below(SnakePoint other){
		return y>other.y;
	}
	
}
