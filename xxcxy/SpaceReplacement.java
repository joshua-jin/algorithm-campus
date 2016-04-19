package algorithm.lintcode.easy;

import java.util.ArrayDeque;
import java.util.Queue;

public class SpaceReplacement {
    public int replaceBlank(char[] string, int length) {
        if (string == null) {
            return 0;
        }
        int index = 0;
        Queue<Character> queue = new ArrayDeque<>(length);
        queue.offer(string[index]);
        while (!queue.isEmpty()) {
            char c = queue.poll();
            if (c != ' ') {
                string[index++] = c;
                addChatToQueue(queue, string, index, length);
            } else {
                for (int i = 1; i < 4; i++) {
                    addChatToQueue(queue, string, index + i, length);
                }
                string[index++] = '%';
                string[index++] = '2';
                string[index++] = '0';
            }
        }
        return index;
    }

    private void addChatToQueue(final Queue<Character> queue, final char[] string, final int index, final int length) {
        if (index < length) {
            queue.offer(string[index]);
        }
    }
}
