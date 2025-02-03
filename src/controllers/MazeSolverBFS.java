package controllers;

import java.util.ArrayList;
import java.util.List;

import controllers.interfaces.MazeSolver;
import models.Cells;

public class MazeSolverBFS implements MazeSolver{

    @Override
    public List<Cells> getPath(boolean[][] grid, Cells start, Cells end) {
        System.out.println(" Implementacion con BFS");
        List<Cells> lista = new ArrayList<>();
        return lista;
    }
    
}
