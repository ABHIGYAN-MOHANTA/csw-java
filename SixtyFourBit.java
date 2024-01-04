public class SixtyFourBit {
    public static void main(String[] args) {
        long inputWord = 0b1110101010101010L; // Replace with your 64-bit word
        long outputWord = reverseBits(inputWord);

        System.out.println("Input:  " + Long.toBinaryString(inputWord));
        System.out.println("Output: " + Long.toBinaryString(outputWord));
    }

    public static long reverseBits(long inputWord) {
        // Ensure the input is a 64-bit word
        if (Long.bitCount(inputWord) > 64) {
            throw new IllegalArgumentException("Input must be a 64-bit word");
        }

        // Reverse the bits
        long reversedBits = 0;
        for (int i = 0; i < 64; i++) {
            reversedBits = (reversedBits << 1) | ((inputWord >> i) & 1);
        }

        return reversedBits;
    }
}
