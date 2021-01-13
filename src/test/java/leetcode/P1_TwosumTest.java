/**
 * https://leetcode.com/problems/two-sum/
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 *
 * Constraints:
 *
 * 2 <= nums.length <= 103
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 */

package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.params.provider.Arguments.of;

class P1_TwosumTest {

    P1_Twosum towsum = new P1_Twosum();

    @ParameterizedTest
    @MethodSource("getTestCases")
    public void test(int[] nums, int target, int[] expect) {
        var result = towsum.twoSum(nums, target);
        assertThat(result[0], is(expect[0]));
        assertThat(result[1], is(expect[1]));
    }

    public static Stream<Arguments> getTestCases() {
        return Stream.of(
            of(new int[]{2,7,11,15}, 9, new int[]{0,1}),
            of(new int[]{3,2,4}, 6, new int[]{1,2}),
            of(new int[]{3,3}, 6, new int[]{0,1})
        );
    }

}