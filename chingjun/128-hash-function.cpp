class Solution {
public:
    /**
     * @param key: A String you should hash
     * @param HASH_SIZE: An integer
     * @return an integer
     */
    int hashCode(string key,int HASH_SIZE) {
        long hash = 0;
        for (char c : key) {
            hash = (hash * 33 + c) % HASH_SIZE;
        }
        return hash;
    }
};
