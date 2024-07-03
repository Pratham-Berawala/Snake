import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import za.ac.wits.snake.DevelopmentAgent;

public class MyAgent extends DevelopmentAgent {

    public static void main(String args[]) {
        MyAgent agent = new MyAgent();
        MyAgent.start(agent, args);
    }

    public void log(String s){
        System.out.println("log" + s);
    }

    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String initString = br.readLine(); // Get the number of snakes, width, breath and 1
            String[] temp = initString.split(" ");
            int nSnakes = Integer.parseInt(temp[0]);


            while (true) {
                String line = br.readLine(); // Gets the location of the apple
                if (line.contains("Game Over")) {
                    break;
                }

                String apple1 = line; // apple1 get the location

                //do stuff with apples

                for (int zombie=0; zombie<6; zombie++) {
                    String zombieLine=br.readLine();      //Get the description of the zombies all 6 of them
                }

                int mySnakeNum = Integer.parseInt(br.readLine()); //This takes in the number of my name
                for (int i = 0; i < nSnakes; i++) {
                    String snakeLine = br.readLine(); // Reads in the description of all the 4 snakes
                    if (i == mySnakeNum) {  //this is to identify my snake
                        //hey! That's me :)
                    }
                    //do stuff with other snakes
                }
                //finished reading, calculate move:
                int move = new Random().nextInt(4);
                System.out.println(move);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}