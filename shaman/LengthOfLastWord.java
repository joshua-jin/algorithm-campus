public class LengthOfLastWord {
    public int lengthOfLastWord(final String s) {
        String[] split = s.split(" ");
        if (split.length == 0) {
            return 0;
        } else {
            return split[split.length - 1].length();
        }
    }
}