public class Main {

    /* Implement your solution inside this method. */
   public int orangesRotting(int[][] grid) {
    // WRITE YOUR CODE HERE.

     return -1;
   }


    /*
     * *****************************************************************************
     * DO NOT EDIT THIS CODE.
     * *****************************************************************************
     * 
     * This code is used to boostrap your solution to be checked for correctness by
     * our system.
     */
    public static void main(String[] args) {
        String input = args[0];

        String[] rows = input.split("\\s*\\|\\s*");
        int[][] grid = new int[rows.length][];
        
        for (int i = 0; i < rows.length; i++) {
            String[] cols = rows[i].split(",");
            grid[i] = new int[cols.length];
            for (int j = 0; j < cols.length; j++) {
                grid[i][j] = Integer.parseInt(cols[j]);
            }
        }
        
        int out = new Main().orangesRotting(grid);
        System.out.println(out);
    }
}

