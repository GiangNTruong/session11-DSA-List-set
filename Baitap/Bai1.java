package Session10_DSA.Baitap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Bai1 {
    public static void main(String[] args) {
        // Tạo một đối tượng Random
        Random rand = new Random();

        // Tạo một List số nguyên
        List<Integer> list = new ArrayList<>();

        // Lấy số lượng phần tử ngẫu nhiên của list (tối đa 10 phần tử)
        int numElements = rand.nextInt(10) + 1;

        // Duyệt vòng lặp để gán giá trị ngẫu nhiên cho từng phần tử
        for (int i = 0; i < numElements; i++) {
            list.add(rand.nextInt(100)); // Giả sử giá trị ngẫu nhiên nằm trong khoảng từ 0 đến 99
        }

        // In ra List ngẫu nhiên
        System.out.println("List ngẫu nhiên: " + list);

        // Tìm ra phần tử lớn nhất
        int max = Collections.max(list);

        // In phần tử lớn nhất ra
        System.out.println("Phần tử lớn nhất trong list: " + max);
    }
}
