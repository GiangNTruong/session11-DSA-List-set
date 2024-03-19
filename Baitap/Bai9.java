package Session10_DSA.Baitap;

import java.util.ArrayList;
import java.util.List;

public class Bai9 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(7);
        List<Integer> uniqueList = new ArrayList<>();
        for (int num : list){
            if (!uniqueList.contains(num)){
                uniqueList.add(num);
            }
        }
        for (int num : uniqueList){
            System.out.println(num);
        }
    }
}
