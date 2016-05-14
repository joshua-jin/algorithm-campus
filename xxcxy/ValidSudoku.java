package algorithm.lintcode.easy;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] boxs = createNineSetArray();
        Set<Character>[] bars = createNineSetArray();
        Set<Character>[] placings = createNineSetArray();
        for (int i = 0, ilen = board.length; i < ilen; i++) {
            for (int j = 0, jlen = board[i].length; j < jlen; j++) {
                char c = board[i][j];
                if (c == '.') {
                    continue;
                }
                if (!addWhenNotContains(c, boxs[i / 3 + ((j / 3) * 3)], bars[i], placings[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    private Set[] createNineSetArray() {
        return new Set[]{new HashSet(), new HashSet(), new HashSet(),
                new HashSet(), new HashSet(), new HashSet(),
                new HashSet(), new HashSet(), new HashSet()};
    }

    private boolean addWhenNotContains(final char c, Set<Character>... sets) {
        for (Set<Character> set : sets) {
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        return true;
    }
}
