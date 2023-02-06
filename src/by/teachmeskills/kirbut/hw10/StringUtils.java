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

    /*
    * name - name of user
    * surname - surname of user
    * patronymic - patronymic of user
    */
    public static String getFullName(String name, String surname, String patronymic) {
        if (name.length() == 0 || surname.length() == 0)
            throw new IllegalArgumentException("Enter correct name or surname.");

        name = name.trim();
        surname = surname.trim();
        patronymic = patronymic.trim();

        if (patronymic.length() != 0)
            return surname + " " + name.charAt(0) + "." + patronymic.charAt(0) + ".";

        return surname + " " + name.charAt(0) + ".";
    }

    /*
    * numberOfPassport - user data of passport
    */
    public static boolean isNumberOfPassportCorrect(String numberOfPassport) {
        numberOfPassport = numberOfPassport.trim();
        char[] charNumber = numberOfPassport.toCharArray();

        if (charNumber.length != 9 || charNumber[0] != 'M' || charNumber[1] != 'P')
            return false;

        for (int i = 2; i < charNumber.length; i++)
            if (charNumber[i] < '0' || charNumber[i] > '9')
                return false;

        return true;
    }

    /*
    * password - user password whose passed as parameter
    */
    public static boolean isPasswordReliable(String password) {
        if (password.isBlank())
            throw new IllegalArgumentException("You didn't enter a password.");

        char[] passwordArray = password.toCharArray();

        if (passwordArray.length < 8)
            return false;

        int countOfUppercaseLetter = 0;
        int countOfLowerCaseLetter = 0;
        int countOfNumbers = 0;

        for (char c : passwordArray) {
            if ((c >= 'A' && c <= 'Z') || (c >= 'À' && c <= 'ß') || c == '¨')
                countOfUppercaseLetter++;
            else if ((c >= 'a' && c <= 'z') || (c >= 'à' && c <= 'ÿ') || c == '¸')
                countOfLowerCaseLetter++;
            else if (c >= '0' && c <= '9')
                countOfNumbers++;
        }

        return countOfNumbers >= 1 && countOfLowerCaseLetter >= 1 && countOfUppercaseLetter >= 1;
    }

}
