package ohouse;

import java.util.stream.IntStream;

public class Problem2 {

    int solution(int[] input) {
        int[] sorted = IntStream.of(input)
                .sorted()
                .toArray();

        int a = 0;
        int b = 0;

        for(int i = sorted.length - 1 ; i >= 0 ; i--) {
            if(a <= b) {
                a += sorted[i];
            } else {
                b += sorted[i];
            }
        }

        return Math.abs(a-b);
    }
}
