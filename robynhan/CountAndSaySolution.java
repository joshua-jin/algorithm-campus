package org.robynhan.week4;

public class CountAndSaySolution {
    public String countAndSay(int n) {
        String oldString = "1";
        while (--n > 0) {
            StringBuilder sb = new StringBuilder();
            char[] oldChars = oldString.toCharArray();

            for (int i = 0; i < oldChars.length; i++) {
                int count = 1;

                // 取连续的字符的个数.
                while ((i + 1) < oldChars.length && oldChars[i] == oldChars[i + 1]) {
                    count++;
                    i++;
                }

                // 个数 & 字符.
                sb.append(String.valueOf(count)).append(String.valueOf(oldChars[i]));
            }
            oldString = sb.toString();
        }

        return oldString;
    }
}
