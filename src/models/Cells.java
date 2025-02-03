package models;

public class Cells {
    public int row, col;

    public Cells(int row, int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString() {
        return  "(" + row  +"," + col + ")" ;
    }
    
}
