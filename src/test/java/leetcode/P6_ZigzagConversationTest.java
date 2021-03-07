package leetcode;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

class P6_ZigzagConversationTest {

    @Test
    void test1(){
        var result = new P6_ZigzagConversation().convert("PAYPALISHIRING", 3);
        MatcherAssert.assertThat(result, Matchers.is("PAHNAPLSIIGYIR"));
    }

    @Test
    void test2() {
        var result = new P6_ZigzagConversation().convert("PAYPALISHIRING", 4);
        MatcherAssert.assertThat(result, Matchers.is("PINALSIGYAHRPI"));
    }

    @Test
    void test3() {
        var result = new P6_ZigzagConversation().convert("AB", 1);
        MatcherAssert.assertThat(result, Matchers.is("AB"));
    }
}