package Session10_DSA.Baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Bai10 {
    public static void main(String[] args) {
        // Tạo danh sách các số nguyên
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        // Tính tổng các phần tử trong danh sách sử dụng phương thức forEach()
        AtomicInteger sum = new AtomicInteger();
//        for (Integer element : integerList) {
//            sum += element;
//        }

        integerList.forEach(sum::addAndGet);

        // Hiển thị tổng
        System.out.println("Tổng của các phần tử trong danh sách: " + sum);
    }
}
