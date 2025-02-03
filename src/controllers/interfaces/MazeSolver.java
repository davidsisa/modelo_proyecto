package controllers.interfaces;

import java.util.List;

import models.Cells;

public interface MazeSolver {
    public List <Cells> getPath(boolean[][] grid,Cells start, Cells end);
}

