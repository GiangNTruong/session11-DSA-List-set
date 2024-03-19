package Session10_DSA.Baitap;

import java.util.ArrayList;
import java.util.List;

public class Bai8 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add((int)(Math.random()*10));
        }
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list1);
        for(int num : list2){
            System.out.println(num);
        }
    }
}
