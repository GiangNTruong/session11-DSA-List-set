package Session10_DSA.Baitap;

import java.util.ArrayList;
import java.util.List;

public class Bai6 {


    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
         numberList.add((int)(Math.random()*10));
        }
        for (int i = 0; i < numberList.size() - 1; i++) {
            for (int j = 0; j < numberList.size() - i - 1; j++) {
                if (numberList.get(j) > numberList.get(j + 1)) {
                    // Hoán đổi list[j] và list[j+1]
                    int temp = numberList.get(j);
                    numberList.set(j, numberList.get(j + 1));
                    numberList.set(j + 1, temp);
                }
            }
        }
    }
}
