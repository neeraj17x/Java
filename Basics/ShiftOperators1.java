public class ShiftOperators1 {
    public static void main(String[] args) {
        int a = 10; // Binary: 0000 1010
        int b = -20; // Binary: 1110 1100 (assuming 8-bit two's complement)

        // Left Shift (<<)
        // a << 2: Shifts bits of 'a' to the left by 2 positions.
        // 0000 1010 << 2 = 0010 1000 (40 in decimal)
        System.out.println("a << 2 = " + (a << 2)); // Expected: 40

        // Right Shift (>>)
        // a >> 2: Shifts bits of 'a' to the right by 2 positions, preserving sign.
        // 0000 1010 >> 2 = 0000 0010 (2 in decimal)
        System.out.println("a >> 2 = " + (a >> 2)); // Expected: 2

        // b >> 2: Shifts bits of 'b' to the right by 2 positions, preserving sign.
        // 1110 1100 >> 2 = 1111 1011 (-5 in decimal)
        System.out.println("b >> 2 = " + (b >> 2)); // Expected: -5

        // Unsigned Right Shift (>>>)
        // a >>> 2: Shifts bits of 'a' to the right by 2 positions, filling with zeros.
        // 0000 1010 >>> 2 = 0000 0010 (2 in decimal)
        System.out.println("a >>> 2 = " + (a >>> 2)); // Expected: 2

        // b >>> 2: Shifts bits of 'b' to the right by 2 positions, filling with zeros.
        // 1110 1100 >>> 2 = 0011 1011 (59 in decimal, for 8-bit)
        // For 32-bit int, it would be a very large positive number.
        System.out.println("b >>> 2 = " + (b >>> 2)); // Expected: 59
    }

}
