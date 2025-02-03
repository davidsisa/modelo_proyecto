import controllers.MazeSolverBFS;
import controllers.MazeSolverRecursivo;
import controllers.interfaces.MazeSolver;
import java.util.Arrays;
import java.util.List;
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

        List<MazeSolver> soluciones = Arrays.asList(
            new MazeSolverRecursivo(),
            new MazeSolverBFS());
        int option = 1;
        MazeSolver solver = soluciones.get( option - 1);
        System.out.println("Camino Encontrado");
        List<Cells> camino = solver.getPath(laberinto, start, end);
        System.out.println(camino);
        
        
    }
}
