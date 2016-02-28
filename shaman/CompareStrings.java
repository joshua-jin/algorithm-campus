public class CompareStrings {
    public boolean compareStrings(String A, String B) {
        for (int i = 0; i < B.length(); i++) {
            if (A.indexOf(B.charAt(i)) == -1) {
                return false;
            }
            A = new StringBuilder(A).deleteCharAt(A.indexOf(B.charAt(i))).toString();
        }
        return true;
    }
}