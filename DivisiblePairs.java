import java.io.*;
import java.util.*;

public class DivisiblePairs {
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }
        long nextLong() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ');

            long sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }

            long res = 0;
            while (c > ' ') {
                res = res * 10 + (c - '0');
                c = read();
            }
            return res * sign;
        }
        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();
        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();
            long x = fs.nextLong();
            long y = fs.nextLong();
            HashMap<Long, Long> freq = new HashMap<>();
            long answer = 0;
            for (int i = 0; i < n; i++) {
                long a = fs.nextLong();
                long rx = a % x;
                long ry = a % y;
                long neededX = (x - rx) % x;
                long neededKey = (neededX << 32) | ry;
                answer += freq.getOrDefault(neededKey, 0L);
                long currentKey = (rx << 32) | ry;
                freq.put(currentKey,
                        freq.getOrDefault(currentKey, 0L) + 1);
            }
            out.append(answer).append('\n');
        }
        System.out.print(out);
    }
}