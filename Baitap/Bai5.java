package Session10_DSA.Baitap;

import java.util.*;

public class Bai5 {
    public static void main(String[] args) {
        String str = "Đây là đâu tôi là ai";
        String[] words = str.split(" ");
        List<String> shortWords = new ArrayList<>();

        // Thêm các từ vào danh sách shortWords
        Collections.addAll(shortWords, words);

        if (!shortWords.isEmpty()) {
            int min = shortWords.get(0).length();
            List<String> minList = new ArrayList<>();
            for (String word : shortWords) {
                if (word.length() < min) {
                    minList.clear();
                    minList.add(word);
                    min = word.length();
                } else if (word.length() == min) {
                    minList.add(word);
                }
            }
            System.out.println("Các từ ngắn nhất trong chuỗi: " + minList);
        } else {
            System.out.println("Chuỗi không có từ.");
        }
    }
}
