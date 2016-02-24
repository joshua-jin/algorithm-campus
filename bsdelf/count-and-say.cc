/**
 * @author      Yanhui Shen
 * @version     1.0
 * @since       2016-02-11 
 */

class Solution {
public:
    /**
     * @param n the nth
     * @return the nth sequence
     */
    string countAndSay(int n) {
        const auto succeed = [](string seq) -> string {
            const auto end = '.';
            seq += end;
            int nch = 1;
            char ch = seq[0];
            string nxtseq = "";
            for (int i = 1; i < seq.size(); ++i) {
                if (ch != seq[i]) {
                    nxtseq += std::to_string(nch) + ch;
                    ch = seq[i];
                    nch = 1;
                } else {
                    ++nch;
                }
            }
            return nxtseq;
        };
        
        string&& seq = "1"; 
        for (int i = 1; i < n; ++i) {
            seq = succeed(seq);
        }
        return seq;
    }
};
