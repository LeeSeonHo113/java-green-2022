package ex20;

import java.util.*;

public class StringTest {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("will Java change my life?");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }

}
