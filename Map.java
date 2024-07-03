import java.util.*;

public class Map {
	public int [][] map;
	
	
	
	public Map(int height, int width) {
		this.map = new int [height][width];
		for(int row = 0; row < height; row++){
			for(int col = 0; col < width; col++){
				this.map[row][col] = 0;
			}
		}
	}



	public void drawLine(int [] p1, int [] p2, int num){
		
		int x1 = p1[0];
		int x2 = p2[0];
		
		int y1 = p1[1];
		int y2 = p2[1];
		
		int minX=Math.min(x1, x2);
		int maxX=Math.max(x1, x2);
		
		int minY=Math.min(y1, y2);
		int maxY=Math.max(y1, y2);
		
		
		for (int x = minX; x<=maxX; x++){
			for (int y = minY; y<=maxY; y++){
				this.map[y][x]=num;
			}
		}
		
	}
	
	public void drawSnake(Snake snake, int num){
		ArrayList<SnakePoint> snakePoints = snake.getCoordinates();
		for(int i = 0; i < (snakePoints.size() - 1); i++){
			int [] p1 = {snakePoints.get(i).getX(),snakePoints[i].getY};
			this.drawLine(snakePoints[i],snakePoints[i+1], num);
		}
	}
	
}
