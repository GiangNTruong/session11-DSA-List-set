package Session10_DSA.Baitap;

import java.util.ArrayList;
import java.util.List;

public class Bai7 {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random()*10));
        }
        List<Integer> listNew =new ArrayList<>();
        for(int num :list){
            if (num%2!=0){
                listNew.add(num);
            }
        }
        for(int num :listNew){
            System.out.println(num);
        }
    }
}
