package Session10_DSA.Baitap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bai11 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(2);
        int min = Collections.min(list);
        System.out.println("Nhỏ nhất là : " + min);
    }
}
