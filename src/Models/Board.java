package Models;

import java.util.List;

public class Board {
    List<List<Cell>>grid;

    public List<List<Cell>> getGrid() {
        return grid;
    }

    public void setGrid(List<List<Cell>> grid) {
        this.grid = grid;
    }

    public void printBoard() {
        for(List<Cell>cellsList: grid) {
            for(Cell cell: cellsList) {
                System.out.println(cell.getPlayer().getSymbol() + "  ");
            }
            System.out.println("\n");
        }
    }
}
