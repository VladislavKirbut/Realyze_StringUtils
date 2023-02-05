package by.teachmeskills.kirbut.hw10;

public class StringUtils {

    private final static int SPACE = 32;

    /*
    * str - string whose passed as parameter
    * count - counter of character array elements
    */
    public static String normalizeString(String str) {
        if (str.length() == 0)
            return str;

        str = str.trim();
        char[] str1 = str.toCharArray();

        int count = 1;
        for (int i = 1; i < str1.length; i++) {
            if (!(str1[i - 1] == SPACE && str1[i] == SPACE))
                str1[count++] = str1[i];
        }

        return new String(str1, 0, count);
    }
}
