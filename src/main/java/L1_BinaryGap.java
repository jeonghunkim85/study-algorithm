import org.springframework.util.Assert;

public class L1_BinaryGap {
    final static char STANDARD_CHAR = '1';

    public int solution(int number) {
        Assert.isTrue(isPositiveNumber(number), "the given number is not positive.");

        final char[] binaryCharArray = numberToBinaryCharArray(number);
        return getMaxZeroCount(binaryCharArray);
    }

    public boolean isPositiveNumber(int number) {
        return number > 0;
    }

    public char[] numberToBinaryCharArray(int number) {
        return Integer.toBinaryString(number).toCharArray();
    }

    public int getMaxZeroCount(char[] binaryCharArray) {

        int longestGap = 0;
        int currentGap = 0;

        for(char currentChar : binaryCharArray) {
            if(currentChar == STANDARD_CHAR) {
                longestGap = currentGap > longestGap ? currentGap : longestGap;
                currentGap = 0;
            } else {
                currentGap++;
            }
        }
        return longestGap;
    }
}
