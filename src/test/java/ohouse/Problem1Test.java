package ohouse;


import ohouse.Problem1;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.params.provider.Arguments.of;

class Problem1Test {

    Problem1 problem1 = new Problem1();

    @ParameterizedTest
    @MethodSource("getTestCases")
    public void test(Long input, Long expect) {
        var result = this.problem1.getSmallestMultiple(input);
        assertThat(result, is(expect));
    }

    public static Stream<Arguments> getTestCases() {
        return Stream.of(
                of(1L, 1L),
                of(2L, 10L),
                of(3L, 111L),
                of(4L, 100L),
                of(5L, 10L),
                of(6L, 1110L),
                of(7L, 111111L),
                of(8L, 1000L),
                of(9L, 111111111L),
                of(10L, 10L)
        );
    }
}
