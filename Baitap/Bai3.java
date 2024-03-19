package Session10_DSA.Baitap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bai3 {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listNumber.add((int)(Math.random()*10));
        }
        Collections.sort(listNumber,Collections.reverseOrder());
        for (int num : listNumber){
            System.out.println(num);
        }
    }
}
