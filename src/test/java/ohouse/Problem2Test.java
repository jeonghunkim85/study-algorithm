package ohouse;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.params.provider.Arguments.of;

class Problem2Test {

    Problem2 problem2 = new Problem2();

    @ParameterizedTest
    @MethodSource("getTestCases")
    public void test(int[] input, int expect) {
        var result = this.problem2.solution(input);
        assertThat(result, is(expect));
    }

    public static Stream<Arguments> getTestCases() {
        return Stream.of(
                of(new int[]{1,3,2,5,7,6,10}, 0),
                of(new int[]{3,5,7,10}, 1),
                of(new int[]{1,2,3,4,5,6,7,8,9,10}, 1),
                of(new int[]{1,3,5,7,9}, 1)
        );
    }
}