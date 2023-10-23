import java.util.*;
public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        int[][] grid = {{1,2}, {3,4}};
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                al.add(grid[i][j]);
            }
        }

        System.out.println(al);
    }
}