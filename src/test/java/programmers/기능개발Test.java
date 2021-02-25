package programmers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.params.provider.Arguments.of;

public class 기능개발Test {

    기능개발 s = new 기능개발();

    @ParameterizedTest
    @MethodSource("getTestCases")
    public void test(int[] progresses, int[] speeds, int[] expects) {
        var result = this.s.solution(progresses, speeds);
        assertThat(result, is(expects));
    }

    public static Stream<Arguments> getTestCases() {
        return Stream.of(
            of(new int[]{93, 30, 55}, new int[]{1, 30, 5}, new int[]{2, 1}),
            of(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1}, new int[]{1, 3, 2})
        );
    }
}
