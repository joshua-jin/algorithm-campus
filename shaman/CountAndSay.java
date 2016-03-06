public class CountAndSay {
    public String countAndSay(int n) {
        if (n <= 0)
            return null;

        String result = "1";

        while (n > 1) {
            result = generateNextString(result);
            n--;
        }

        return result;
    }

    private String generateNextString(final String result) {
        String nextString = "";
        char[] chars = result.toCharArray();
        char current = chars[0];
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == current) {
                count++;
            } else {
                nextString += String.valueOf(count) + String.valueOf(current);
                count = 1;
                current = chars[i];
            }
        }
        if (count > 0) {
            nextString += String.valueOf(count) + String.valueOf(current);
        }
        return nextString;
    }
}
