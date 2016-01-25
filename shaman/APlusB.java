public class APlusB {
    public int aplusb(int a, int b) {
        int carry = a & b, result = a ^ b;
        return carry == 0 ? result : aplusb(result, carry << 1);
    }
}