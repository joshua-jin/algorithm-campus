public class LongestWords {

    ArrayList<String> longestWords(final String[] dictionary) {
        int max = 0;
        ArrayList<String> result = new ArrayList<>();

        for (String s : dictionary) {
            if (s.length() > max) {
                max = s.length();
                result = new ArrayList<>();
            }
            if (s.length() == max)
                result.add(s);
        }
        return result;
    }
}
