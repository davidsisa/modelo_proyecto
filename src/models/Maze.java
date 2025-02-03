package models;

import java.util.Arrays;
import java.util.List;

public class Maze {
    private boolean [][] grid;
    private int size;
    public Maze(boolean[][] grid, int size) {
        this.size = size;
        grid = new boolean[size][size];
        for (int i = 0; i<size;i++) {
            Arrays.fill(grid[i], true);
        }
    }
    public Maze(boolean[][] predefineGrid){
        this.size = predefineGrid.length;
        this.grid = predefineGrid;
    }
    public boolean[][] getGrid() {
        return grid;
    }
    public void printMaze(){
        for (boolean[] row : grid) {
            for (boolean col :row) {
                System.out.print( col? " - ": " * " );
            }
            System.out.println();
        }
    }
    public void printMazeSolver(List<Cells> path){
        for (int j = 0;j < grid.length;j++) {
            for (int k = 0;k < grid[j].length;k++) {
                boolean celda = grid [j][k];
                if (isInPath(j,k,path)) {
                    
                } else if (celda) {
                    System.out.println(" - ");
                }else{
                    System.out.println(" * ");
                }
            }
            System.out.println();
        }
    }
    private boolean isInPath(int j, int z, List<Cells> path){
        for (Cells cell : path) {
            if (cell.row == j && cell.col == z) {
                    return true;
            }
        }
            return false;
        
    }
}
