package ohouse;

public class Problem1 {

    private static final String ZERO = "0";

    public long getSmallestMultiple(long n) {
        long i = 1;
        while(true) {
            if(i % n == 0) {
                return i;
            }
            i = this.getNext(i);
        }
    }

    private long getNext(long n) {
        String nString = Long.toString(n);
        if(!nString.contains(ZERO)) {
            return this.rpadded10(nString.length());
        }
        int toBePowed = nString.length() - nString.indexOf(ZERO) - 1;
        return n + this.rpadded10(toBePowed);
    }

    private long rpadded10(int num) {
        return Math.round(Math.pow(10, num));
    }
}
