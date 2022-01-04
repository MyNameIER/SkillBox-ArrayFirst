package ArrayFirst;

import java.util.ArrayList;
import java.util.Scanner;

public class newList {
    public static void main(String[] args) {
        ArrayList<String> todoList = new ArrayList<>(){{
            add("Первое дело");
            add("Второе дело");
            add("Третье дело");
            add("Четвертое дело");
        }};
        System.out.println("Введите команду:");
        Scanner ad = new Scanner(System.in);
        String command = ad.nextLine();
        switch (command) {
            case "List":
                for (String item : todoList) {
                    System.out.println(item);
                }
                break;
            case "Add":
                System.out.println("Введите дело и порядковый номер");
                String todo = ad.nextLine();
                todoList.add(todo);
                System.out.println("Дело записано за номером:" + todoList.size());
                break;
            case "Delete":
                System.out.println("Введите номер дела для удаления");
                int number = ad.nextInt();
                todoList.remove(number);
                System.out.println("Дело номер " + number + " удалено");
                break;
            case "Edit":
                System.out.println("Введите номер дела для редактирования");
                int numberEdit = ad.nextInt();
                System.out.println("Введите новое дело для редактирования");
                String todoEdit = ad.nextLine();
                todoList.set(numberEdit, todoEdit);
                System.out.println("Дело номер " + numberEdit + " отредактировано");
                break;
            }
    }
}
