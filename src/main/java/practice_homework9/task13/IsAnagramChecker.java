package practice_homework9.task13;

import java.util.Arrays;

public class IsAnagramChecker {
    public boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.toLowerCase().replaceAll("\\s", "").toCharArray();
        char[] arr2 = str2.toLowerCase().replaceAll("\\s", "").toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

}
