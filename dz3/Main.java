package ru.alex.java2.dz3;

/*
1 Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и
вывести  список  уникальных  слов,  из  которых  состоит  массив  (дубликаты  не  считаем).
Посчитать, сколько раз встречается каждое слово.
2 Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
телефонных  номеров.  В  этот  телефонный  справочник  с  помощью  метода  add()  можно
добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует
учесть,  что  под  одной  фамилией  может  быть  несколько  телефонов  (в  случае
однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную
запись  добавлять  еще  дополнительные  поля  (имя,  отчество,  адрес),  делать  взаимодействие  с
пользователем  через  консоль  и т.д. Консоль желательно не использовать (в том числе Scanner),
тестировать просто из метода main(), прописывая add() и get().
 */


//import java.util.Collections;
//import java.util.LinkedHashSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String[] fruitArray = new String[]{
                "Абрикос", "Айва", "Апельсин", "Арбуз", "Банан",
                "Виноград", "Гранат", "Грейпфрут", "Груша", "Гуава",
                "Абрикос", "Айва", "Апельсин", "Арбуз", "Банан",
                "Дыня", "Инжир", "Киви", "Банан", "Лимон"};
//
//        LinkedHashSet<String> fruitList = new LinkedHashSet<>();
//        Collections.addAll(fruitList, fruitArray);
//        System.out.println(fruitList);


        Phonebook yelets = new Phonebook();

        yelets.add("Petrov", "89623457892");
        yelets.add("Ivanov", "89623457887");
        yelets.add("Sidorov", "89623457989");
        yelets.add("Pushkin", "89514445555");
        yelets.add("Petrov", "89998887766");
        yelets.add("Sidorov", "89623466666");
        yelets.add("Gamov", "89063224155");
        yelets.add("Petrov", "89623455555");


        yelets.get("Petrov");
        yelets.get("Sidorov");
        yelets.get("Gamov");
        yelets.get("IVanov");


        checkArrayUniqueWord(fruitArray);

    }


    public static void checkArrayUniqueWord(String[] arrayCheck) {

//        String[] array = new String[arrayCheck.length];
        Map<String, Integer> array = new HashMap<String, Integer>();
        for (String s : arrayCheck) {
            if (array.get(s) != null) {
                int count = array.get(s);
                count++;
                array.put(s, count);
            } else {
                array.put(s, 1);
            }

        }
        for (Map.Entry<String, Integer> item : array.entrySet()) {

            System.out.printf("Cлово : %s  Встречается: %d раз(а) \n", item.getKey(), item.getValue());

        }


    }
}

