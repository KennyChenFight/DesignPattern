package adapter.iterenum;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationIteratorTestDrive {

    public static void main(String[] args) {
        String[] test = { "a", "b", "c", "d" };
        Vector<String> v = new Vector<String>(Arrays.asList(test));
        Iterator<?> iterator = new EnumerationIterator(v.elements());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
