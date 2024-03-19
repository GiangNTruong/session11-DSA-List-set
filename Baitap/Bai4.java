package Session10_DSA.Baitap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai4 {
    public static void main(String[] args) {
        // B1: Tạo một chuỗi
        String str = "Rekkei Academy để nông dân biết code";

        // B2: Tạo một danh sách chứa các chuỗi
        List<String> list = new ArrayList<>();

        // B3: Chuyển đổi chuỗi thành danh sách chuỗi và gán vào danh sách
        list = Arrays.asList(str.split(" "));

        // B4: Duyệt danh sách và in ra các phần tử có nhiều hơn 3 ký tự
        for (String s : list) {
            if (s.length() > 3) {
                System.out.println(s);
            }
        }
    }
}
