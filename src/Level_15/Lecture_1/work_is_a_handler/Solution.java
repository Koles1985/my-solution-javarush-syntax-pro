package Level_15.Lecture_1.work_is_a_handler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static final String INPUT_NAME = "\nВведите имя:  \n";
    public static final String INPUT_AGE = "Введите возраст пользователя '%s': \n";

    public static final String CANNOT_BE_NULL = "Имя не может быть null";
    public static final String CANNOT_BE_EMPTY = "Имя не может быть пустым.";
    public static final String CANNOT_CONTAIN_DIGIT = "Имя не может содержать цыфры";
    public static final String CANNOT_BE_NEGATIVE = "Возраст не может быть меньше нуля.";
    public static final String CANNOT_BE_TOO_BIG = "Возраст не может быть больше 200.";
    public static final String UNKNOWN_ERROR = "Неизвестная ошибка!";

    public static final String FOUND = "\nПользователь'%s' найден под индексом %d. \n";
    public static final String NOT_FOUND = "\nПользователь'%s' не найден.\n";

    public static List<User> users = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            addUser(new User());
        }

        User userToSearch = new User();
        userToSearch.setName("MegaGuru");

        findUserIndex(userToSearch);
    }

    static void addUser(User user) {
        System.out.print(INPUT_NAME);
        String name = scanner.nextLine();

        System.out.printf(INPUT_AGE, name);
        int age = Integer.MIN_VALUE;
        try {
            age = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Должен быть return");
            return;
        }

        int userSetName = user.setName(name);
        int userSetAge = user.setAge(age);

        if (userSetName == 0 && userSetAge == 0)
            users.add(user);
        else {
            switch (userSetName) {
                case 0:
                    break;
                case -1:
                    System.out.println(CANNOT_BE_NULL);
                    break;
                case -2:
                    System.out.println(CANNOT_BE_EMPTY);
                    break;
                case -3:
                    System.out.println(CANNOT_CONTAIN_DIGIT);
                    break;
                default:
                    System.out.println("field name " + UNKNOWN_ERROR);
                    break;
            }
            switch (userSetAge) {
                case 0:
                    break;
                case -1:
                    System.out.println(CANNOT_BE_NEGATIVE);
                    break;
                case -2:
                    System.out.println(CANNOT_BE_TOO_BIG);
                    break;
                default:
                    System.out.println("field age " + UNKNOWN_ERROR);
            }
            System.out.println("Else!!!");
        }


    }

    static void findUserIndex(User user) {
        if(users.indexOf(user) < 0){
            System.out.printf(NOT_FOUND, user.getName());
        }else {
            System.out.printf(FOUND, user.getName(), users.indexOf(user));
        }
    }
}
