package timus.task_1209;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        long[] K = new long[N];
        long maxK = 0;
        for (int i = 0; i < N; i++) {
            K[i] = Long.parseLong(in.readLine());
            if (K[i] > maxK) maxK = K[i];
        }

        List<Long> S = new ArrayList<>();
        long sum = 0;
        int m = 0;
        while (sum < maxK) {
            sum += (m + 1);
            S.add(sum);
            m++;
        }

        long[] pref = new long[S.size()];
        for (int i = 0; i < S.size(); i++) {
            pref[i] = S.get(i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            long k = K[i];

            int lo = 0, hi = pref.length - 1;
            while (lo < hi) {
                int mid = (lo + hi) >>> 1;
                if (pref[mid] < k) {
                    lo = mid + 1;
                } else {
                    hi = mid;
                }
            }
            int idx = lo;
            long prevSum = idx == 0 ? 0 : pref[idx - 1];
            long offset = k - prevSum - 1;
            char digit = (offset == 0 ? '1' : '0');
            sb.append(digit).append(' ');
        }

        // выводим, убрав последний пробел
        if (sb.length() > 0) sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}

