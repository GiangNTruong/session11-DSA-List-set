package Session10_DSA.Baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bai14 {
    public static void main(String[] args) {
        Random rand = new Random();
        int size = rand.nextInt(10) + 1;
        System.out.println(size);
        List<List<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < size; j++) {

                row.add(rand.nextInt(101));
            }
            matrix.add(row);
        }

        for (List<Integer> row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
