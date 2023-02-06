package by.teachmeskills.kirbut.hw10;

public class StringUtils {

    private static final int SPACE = 32;

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

    /*
    * str - string whose passed as a parameter
    * lastNumbers - four last numbers of card
    * count - counter of array elements
    */
    public static String changeFormatOfCard(String str) {
        str = str.trim();

        if (str.length() != 16)
            throw new IllegalArgumentException("Enter correct number of card.");

        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) < '0' || str.charAt(i) > '9')
                throw new IllegalArgumentException("Your number of card isn't correct. Please enter again.");

        String lastNumbers = str.substring(str.length() - 4);

        int count = 0;
        char[] str1 = str.toCharArray();
        for (int i = 1; i < str1.length; i++) {
            if (i % 5 != 0)
                str1[count++] = '*';
            else str1[count++] = SPACE;
        }

        str = String.valueOf(str1).substring(0, 15);
        str = str + lastNumbers;

        return str;
    }

}
