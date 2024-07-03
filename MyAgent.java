import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import za.ac.wits.snake.DevelopmentAgent;

public class MyAgent extends DevelopmentAgent {
	

	public static void main(String args[]) throws IOException {
		MyAgent agent = new MyAgent();
		MyAgent.start(agent, args);
	}

	public void log(String s) {
		System.out.println("log " + s);
	}

	@Override
	public void run() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String initString = br.readLine();
			String[] temp = initString.split(" ");
			int nSnakes = Integer.parseInt(temp[0]);
			Map map = new Map(Integer.parseInt(temp[1]), Integer.parseInt(temp[2]));
			while (true) {
				String line = br.readLine();
				if (line.contains("Game Over")) {
					break;
				}
				String apple1 = line;

				String apple2 = br.readLine();

				SnakePoint myApple = new SnakePoint(apple2, " ");
				Snake me = null;

				log(apple2);
				// do stuff with apples
				int mySnakeNum = Integer.parseInt(br.readLine());
				for (int i = 0; i < nSnakes; i++) {
					String snakeLine = br.readLine();
					if (i == mySnakeNum) {
						me = new Snake(snakeLine);
					}
					// do stuff with snakes
				}

				if (myApple.above(me.head())) {
					up();
				} else if (myApple.below(me.head())){
					down();
				} else {
					// finished reading, calculate move:
					System.out.println("log calculating...");
					int move = new Random().nextInt(4);
					System.out.println(move);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void up(){
		System.out.println(0);
	}
	
	public void down(){
		System.out.println(1);
	}
	
	
}