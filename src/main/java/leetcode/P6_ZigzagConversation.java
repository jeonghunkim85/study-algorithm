package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class P6_ZigzagConversation {

    public String convert(String s, int numRows) {
        boolean direction = true;
        List<Character>[] results = new ArrayList[numRows];

        for(int i=0, rowNum=0, max=s.length(); i<max; i++){
            if(results[rowNum] == null) {
                results[rowNum] = new ArrayList<>();
            }
            results[rowNum].add(s.charAt(i));

            if(direction) {
                rowNum++;
                if(rowNum >= numRows-1) {
                    rowNum = numRows-1;
                    direction = false;
                }
            }else{
                rowNum--;
                if(rowNum <= 0) {
                    rowNum = 0;
                    direction = true;
                }
            }
        }

        return Arrays.stream(results).filter(Objects::nonNull).flatMap(Collection::stream).map(Object::toString).collect(Collectors.joining(""));
    }
}
