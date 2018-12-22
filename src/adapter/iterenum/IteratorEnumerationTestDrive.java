package adapter.iterenum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

public class IteratorEnumerationTestDrive {

    public static void main(String[] args) {
        String[] test = { "a", "b", "c", "d" };
        ArrayList<String> l = new ArrayList<>(Arrays.asList(test));
        Enumeration<?> enumeration = new IteratorEnumeration(l.iterator());
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
