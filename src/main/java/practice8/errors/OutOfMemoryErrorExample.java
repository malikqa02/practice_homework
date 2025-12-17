package practice8.errors;

import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorExample {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        while (true) {
            list.add(new byte[1024 * 1024]);
        }
    }

}
