package gr.aueb.cf.quiz;

import static java.lang.Math.abs;

public class FrogsApp {

    public static void main(String[] args) {

        int [][] grid = {
                {1,2,3},
                {7,3,2},
                {2,4,3},
                {4,2,1},
                {14,12,10},
                {8,8,8},
                {1,5,2}
        };

        for (int i = 0; i < grid.length; i++){
            distance(grid[i][0],grid[i][1],grid[i][2]);
        }

    }

    public static void distance(int posFrog1, int posFrog2, int posSpider){

        if (abs(posFrog1 - posSpider) < abs(posFrog2 - posSpider)){
            System.out.println("Frog 1 reached first");
        }else if (abs(posFrog1 - posSpider) == abs(posFrog2 - posSpider)) {
            System.out.println("Spider ");
        }else System.out.println("Frog 2 reached first");

    }
}
