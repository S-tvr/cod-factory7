package gr.aueb.cf.ch6;

public class TwoDimArrayApp {

    public static void main(String[] args) {
        // kata grammes kai stiles to 2 einai to grammes
        int[][] grid =  new int[2][3];

        grid[0][0] = 5;
        grid[0][1] = 7;
        grid[0][2] = 10;
        grid[1][0] = 6;
        grid[1][1] = 6;
        grid[1][2] = 6;

        //traverse
        //η Java θεωρεί ως grid.length τον αριθμό των γραμμών.
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                System.out.println(grid[i][j]);
            }
        }
        System.out.println();

        for(int[] row : grid) {
            for(int el : row) {
                System.out.println(el);
            }
        }
        System.out.println();
    }
}
