    public static int bitSwapRequired(int a, int b) {
        String binaryA = Integer.toBinaryString(a);
        String binaryB = Integer.toBinaryString(b);
        if (binaryA.length() < binaryB.length()) {
            String temp = binaryB;
            binaryB = binaryA;
            binaryA = temp;
        }
        int count = 0;
        for (int i = 1; i <= binaryB.length(); i++) {
            if (binaryA.charAt(binaryA.length() - i) != binaryB.charAt(binaryB.length() - i)) {
                count++;
            }
        }
        for (int i = 0; i < binaryA.length() - binaryB.length(); i++) {
            if (binaryA.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }