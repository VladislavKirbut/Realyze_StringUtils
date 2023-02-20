package by.teachmeskills.kirbut.hw10.util;
import java.util.Scanner;

public class StringUtils {

    private static final int CARD_NUMBER_LENGTH = 16;
    /*
    * str - string whose passed as parameter
    * count - counter of character array elements
    */
    public static String normalizeString(String str) {
        if (str == null || str.length() == 0)
            return str;

        str = str.trim();
        char[] str1 = str.toCharArray();

        int count = 1;
        for (int i = 1; i < str1.length; i++) {
            if (!(Character.isWhitespace(str1[i - 1]) && Character.isWhitespace(str1[i])))
                str1[count++] = str1[i];
        }

        return new String(str1, 0, count);
    }

    /*
    * numberOfCard - number of card whose passed as a parameter
    * lastNumbers - four last numbers of card
    * count - counter of array elements
    */
    public static String changeFormatOfCard(String numberOfCard) {
        if (numberOfCard.length() != CARD_NUMBER_LENGTH)
            throw new IllegalArgumentException("Enter correct number of card.");

        for (int i = 0; i < numberOfCard.length(); i++)
            if (numberOfCard.charAt(i) < '0' || numberOfCard.charAt(i) > '9')
                throw new IllegalArgumentException("Your number of card isn't correct. Please enter again.");

        String lastNumbers = numberOfCard.substring(numberOfCard.length() - 4);

        return "**** **** **** " + lastNumbers;
    }

    /*
    * name - name of user
    * surname - surname of user
    * patronymic - patronymic of user
    */
    public static String getFullName(String name, String surname, String patronymic) {
        if (name.length() == 0 || surname.length() == 0)
            throw new IllegalArgumentException("Enter correct name or surname.");

        if (patronymic.length() != 0)
            return surname + " " + name.toUpperCase().charAt(0) + "." + patronymic.toUpperCase().charAt(0) + ".";

        return surname + " " + name.toUpperCase().charAt(0) + ".";
    }

    /*
    * numberOfPassport - user data of passport
    */
    public static boolean isNumberOfPassportCorrect(String numberOfPassport) {

        if (numberOfPassport.length() != 9 || !isEnglishUpperCase(numberOfPassport.charAt(0)) ||
                !isEnglishUpperCase(numberOfPassport.charAt(1))) {

            return false;
        }

        for (int i = 2; i < numberOfPassport.length(); i++)
            if (numberOfPassport.charAt(i) < '0' || numberOfPassport.charAt(i) > '9')
                return false;

        return true;
    }

    /*
    * password - user password which passed as parameter
    */
    public static boolean isPasswordReliable(String password) {
        if (password.isBlank())
            throw new IllegalArgumentException("You didn't enter a password.");

        if (password.length() < 8)
            return false;

        int countOfUppercaseLetter = 0;
        int countOfLowerCaseLetter = 0;
        int countOfNumbers = 0;

        for (int i = 0; i < password.length(); i++) {
            if (isEnglishUpperCase(password.charAt(i)) || isRussianUpperCase(password.charAt(i)))
                countOfUppercaseLetter++;
            else if (Character.isDigit(password.charAt(i)))
                countOfNumbers++;
            else if(isEnglishLowerCase(password.charAt(i)) || isRussianLowerCase(password.charAt(i)))
                countOfLowerCaseLetter++;

            if (countOfNumbers >= 1 && countOfLowerCaseLetter >= 1 && countOfUppercaseLetter >= 1)
                return true;
        }

        return false;
    }

    /*
    * string - email which passed as a parameter of function
    * indexOfSymbolAt - variable whose get index of symbol @ (at)
    * countOfAt - counter of symbol @ (at)
    */
    public static boolean isAnEmail(String email) {
        if (email.isBlank())
            throw new IllegalArgumentException("You don't enter email"); // true/false

        int indexOfSymbolAt = email.indexOf('@');
        if (indexOfSymbolAt == 0 || indexOfSymbolAt == email.length() - 1)
            return false;

        char[] charString = email.toCharArray();

        int countOfAt = 0;
        for (int elem: charString) {
            if (Character.isWhitespace(elem))
                return false;
            if (elem == '@')
                countOfAt++;
        }

        return countOfAt == 1;
    }

    public static boolean isRussianUpperCase(char letter) {
        if ((letter < 'А' || letter > 'Я') && letter != 'Ё' )
            return false;

        return true;
    }

    public static boolean isRussianLowerCase(char letter) {
        if ((letter < 'а' || letter > 'я') && letter != 'ё')
            return false;

        return true;
    }

    public static boolean isEnglishUpperCase(char letter) {
        if (!Character.isUpperCase(letter) || !Character.isLetter(letter))
            return false;

        return true;
    }

    public static boolean isEnglishLowerCase(char letter) {
        if (!Character.isLowerCase(letter))
            return false;

        return true;
    }

    public static String createString() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
