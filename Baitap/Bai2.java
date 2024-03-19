package Session10_DSA.Baitap;

import java.util.ArrayList;
import java.util.List;

public class Bai2 {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listNumber.add((int)(Math.random()*10));
        }
        List<Integer> listNumberNew =new ArrayList<>();
        for (int i = listNumber.size(); i >0 ; i--) {
            listNumberNew.add(listNumber.get(i));
        }
        System.out.println(listNumberNew);
    }
}
