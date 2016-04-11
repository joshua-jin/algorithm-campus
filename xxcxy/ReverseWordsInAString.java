package algorithm.lintcode.easy;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] splits = s.split("\\s");
        for (int i = 0, l = splits.length, len = splits.length / 2; i < len; i++) {
            swap(splits, i, l - i - 1);
        }
        return join(" ", splits);
    }

    private void swap(String[] arr, int i, int j) {
        String tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private String join(String split, String[] arrayString) {
        if (arrayString.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(arrayString[0]);
        for (int i = 1, len = arrayString.length; i < len; i++) {
            sb.append(split).append(arrayString[i]);
        }
        return sb.toString();
    }
}
