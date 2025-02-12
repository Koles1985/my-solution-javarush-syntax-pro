package Level_15.Lecture_2.exceptions_in_java_programs.tеaching_assistant;

import java.util.*;

public class Solution {
    public static final String PROMPT_STRING = "Введите номер студента, или exit для выхода из программы";
    public static final String EXIT = "exit";
    public static final String ANSWERING = "Отвечает ";
    public static final String NOT_EXIST = "Студента с таким именем не существует в нашей вселенной!";

    static List<String> studentJournal = Arrays.asList(
            "Тимур Мясной",
            "Пенлопа сиволап",
            "Том круз",
            "Энтони хопкинз",
            "Вася Сигнаулов",
            "Ебать какое имя",
            "Не повезло с родителями",
            "Шлюхин сын",
            "Брат сестры брата шлюхи брата сестры шлюхиного сына",
            "просто вася"
    );


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println(PROMPT_STRING);
            String input = scanner.nextLine();
            if(input.toLowerCase().equals(EXIT))
                break;

            int studentId = Integer.parseInt(input);
            try {
                System.out.println(ANSWERING + studentJournal.get(studentId));
            }catch(IndexOutOfBoundsException e){
                System.out.println(NOT_EXIST);
            }
        }
    }
}
