package controllers;

import controllers.interfaces.MazeSolver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import models.Cells;

public class MazeSolverRecursivo implements MazeSolver{

    @Override
    public List<Cells> getPath(boolean[][] grid, Cells start, Cells end){
        System.out.println(" Implementacion Recursiva");
        List<Cells> path = new ArrayList<>();
        Set<Cells> visit = new HashSet<>(); 
        if (grid == null ||grid.length == 0) {
            return path;
        }
        if (findPath(grid,start.row,start.col,end,path,visit)){
                    return path;
                }
                return new ArrayList<>();
        }
        
    private boolean findPath(boolean[][] grid, int row, int col, Cells end, List<Cells> path, Set<Cells> visit) {
        if (row>= grid.length || col >= grid[0].length || !grid[row][col]) {
            return false;
        }
        Cells cell = new Cells (row,col);
        if (visit.contains(cell)) {
            return false;
        }
        visit.add(cell);
        
        if (row == end.row && col == end.col) {
            path.add(cell);
            return true;
        }
        if(findPath(grid,row+1,col,end,path,visit)){
            path.add(cell);
            return true;
        }
        if(findPath(grid,row,col+1,end,path,visit)){
            path.add(cell);
            return true;
        }
        if(findPath(grid,row-1,col,end,path,visit)){
            path.add(cell);
            return true;
        }
        if(findPath(grid,row,col-1,end,path,visit)){
            path.add(cell);
            return true;
        }
        
        return false;
    }
    
}
