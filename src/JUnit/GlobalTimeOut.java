package JUnit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class GlobalTimeOut {
    public static String log;

    @Rule
    public Timeout globalTimeout = new Timeout(10000); // 10 seconds max per method tested

    @Test
    public void testInfiniteLoop1() {
        log += "ran1";
        for (;;) {
        }
    }

    @Test
    public void testInfiniteLoop2() {
        log += "ran2";
        for (;;) {
        }
    }
}