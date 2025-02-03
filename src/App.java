import models.Cells;
import models.Maze;

public class App {
    public static void main(String[] args) throws Exception {
        boolean[][] laberinto = {
            {true,true,true,true},
            {false,true,true,true},
            {true,true,false,false},
            {true,true,true,true},
        };
        Maze maze = new Maze(laberinto);
        System.out.println("Laberinto");
        maze.printMaze();
        Cells start = new Cells(0,0);
        Cells end = new Cells(3,3);
    }
}
