package models;

import java.util.Arrays;

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
}
