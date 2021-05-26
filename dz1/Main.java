package com.batiaev.java2.lesson1.homework;


public class Main {
    public static void main(String[] args) {
        Barrier[] barriers = new Barrier[5];
        barriers[0] = new Barrier();
        barriers[1] = new Wall(3);
        barriers[2] = new Wall(5);
        barriers[3] = new Barrier();
        barriers[4] = new Wall(6);
        Course c = new Course(barriers); // Создаем полосу препятствий
        Member[] members = new Member[5]; // Создаем комманду
        members[0] = new Horse("Zoi", 15, 12);
        members[1] = new Tiger("Homa", 8, 7);
        members[2] = new Bear("Misha", 5, 15);
        members[3] = new Horse("Poni", 2, 4);
        members[4] = new Tiger("Poppi", 1, 2);
        Team team = new Team("Winner", members);
        c.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты
    }
}
