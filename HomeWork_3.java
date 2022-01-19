package ru.geekbrains.homework_3;

import java.util.Random;
import java.util.Scanner;

public class HomeWork_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создание объекта класса Scanner
        Random rand = new Random(); // создание объекта класса Random

        int count = 0;  // количество попыток
        int guess = -1; // цифра пользователя с консоли
        int number = rand.nextInt(10);  // рандомная цифра, которую нужно угадать

        //цикл do-while:

            do {
                while (count < 3 && guess != number) { // пока попыток меньше 3х и цифра не угадана, добавляется одна попытка

                    System.out.println("Программа рандомно выбрала цифру от 0 до 9.\nПопробуйте её угадать за 3 попытки:");
                    guess = sc.nextInt(); // ввод пользователем цифры в консоль
                    if (number != guess) {
                        System.out.println("Ваша цифра " + ((guess > number) ? "больше нужной." : "меньше нужной."));
                        // тернарный оператор: если условие в скобках true, то в консоль возвращается значение слева от двоеточия, если false — справа.

                        count++; // добавление попытки при несовпадении цифр
                    }



                }   System.out.println("Вы " + ((guess == number)? "угадали!" : "не угадали."));

                System.out.println("Повторить игру еще раз?\n1 - да / 0 - нет");

            }   while (sc.nextInt() == 1);
    }

}









