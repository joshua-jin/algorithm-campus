package com.lintcode;

/**
 * @author : Joshua
 * Date:     2/20/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/hash-function/">哈希函数</a>
 */
public class HashFunction {
    /**
     * @param key: A String you should hash
     * @param HASH_SIZE: An integer
     * @return an integer
     */
    public int hashCode(char[] key,int HASH_SIZE) {
        // write your code here
        long result = 0;
        long basePow = 1;
        for (int i = key.length - 1; i >= 0; i--) {
            result += (key[i] * basePow) % HASH_SIZE;
            result %= HASH_SIZE;
            basePow = basePow * 33 % HASH_SIZE;
        }
        return (int)result;
    }
}
