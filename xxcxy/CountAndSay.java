package algorithm.lintcode.easy;

public class CountAndSay {
    //TODO refactor
    public String countAndSay(int n) {
        return countAndSay("1", n - 1);
    }

    private String countAndSay(final String say, final int time) {
        if(time == 0) {
            return say;
        }
        char last = '0';
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0, len = say.length(); i < len; i++) {
            if(say.charAt(i) == last) {
                count ++;
            }else {
                if(count > 0) {
                    sb.append(count).append(last);
                }
                last = say.charAt(i);
                count = 1;
            }
            if(i == len - 1) {
                sb.append(count).append(last);
            }
        }
        return countAndSay(sb.toString(), time - 1);
    }
}
