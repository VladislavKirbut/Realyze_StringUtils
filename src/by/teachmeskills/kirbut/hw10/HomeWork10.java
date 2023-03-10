package by.teachmeskills.kirbut.hw10;
import by.teachmeskills.kirbut.hw10.util.StringUtils;

import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Methods:\n1. normalizeString\n" +
                                     "2. changeFormatOfCard\n" +
                                     "3. getFullName\n" +
                                     "4. isNumberOfPassportCorrect\n" +
                                     "5. isPasswordReliable\n" +
                                     "6. isAnEmail");
        System.out.println("Enter number of method from 1 to 6: ");
        int numberOfMethod = scan.nextInt();

        switch (numberOfMethod) {
            case 1 -> {
                System.out.println("Enter a string: ");
                String str = StringUtils.createString();
                System.out.println("Your string is normalized: "+ StringUtils.normalizeString(str));
            }
            case 2 -> {
                System.out.println("Enter number of card (16 digits): ");
                String numberOfCard = StringUtils.createString().trim();

                String newFormatCard = StringUtils.changeFormatOfCard(numberOfCard);
                System.out.println("You change format of card number. Your number: " + newFormatCard);
            }
            case 3 -> {
                System.out.println("Enter your name:");
                String name = StringUtils.createString().trim();
                System.out.println("Enter your surname:");
                String surname = StringUtils.createString().trim();
                System.out.println("Enter your patronymic: ");
                String patronymic = StringUtils.createString().trim();

                String fullName = StringUtils.getFullName(name, surname, patronymic);
                System.out.println("Your full name is: " + fullName);
            }
            case 4 -> {
                System.out.println("Enter number of passport:");
                String numberOfPassport = StringUtils.createString().trim();

                if (StringUtils.isNumberOfPassportCorrect(numberOfPassport))
                    System.out.println("Your passport number: " + numberOfPassport + " is correct.");
                else System.out.println("Your passport number: " + numberOfPassport + " isn't correct.");
            }
            case 5 -> {
                System.out.println("Enter password:");
                String password = StringUtils.createString();

                if (StringUtils.isPasswordReliable(password))
                    System.out.println("Your password is reliable.");
                else System.out.println("Your password isn't reliable.");
            }
            case 6 -> {
                System.out.println("Enter an email:");
                String email = StringUtils.createString().trim();

                if (StringUtils.isAnEmail(email))
                    System.out.println(email + " is a correct email.");
                else System.out.println(email + "isn't correct. It isn't an email.");
            }
            default -> System.out.println("This number doesn't exist. Enter number from 1 to 6");
        }
    }
}
