package com.company.Lab63generic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by VZ-RED on 13.09.2016.
 */
public class Main63 {

static ArrayList <Flat63> flat = new ArrayList<>();


        public static void main(String[] args) {

            Main63.start();
        }

        public static void start()  {


            System.out.println("Выберите необходимое действие и нажмите соответствующую цифру");
            System.out.println("1. Добавить квартиру с электроприборами");
            System.out.println("2. Изменить данные по электроприборам квартиры");
            System.out.println("3. Удалить электроприборы по квартире");
            System.out.println("4. Вывести на экран все квартиры с электроприборами");
            System.out.println("5. Вывести на экран квартиру с наибольшей суммарной мощностью электроприборов");
            System.out.println("6. Вывести на экран среднюю поквартирную мощность");
            System.out.println("7. Запись базы в файл");
            System.out.println("8. Загрузить базу из файла");
            System.out.println("\nДля выхода из программы нажмите любую другую клавишу");

            Scanner s = new Scanner(System.in);
            String f = s.nextLine();

            if (f.equals("1")) Task63.additionFlat();
            if (f.equals("2")) Task63.changeFlat();
            if (f.equals("3")) Task63.deleteFlat();
            if (f.equals("4")) Task63.printAllFlat();
            if (f.equals("5")) Task63.flatMaxPower();
            if (f.equals("6")) Task63.printAverage();
            if (f.equals("7")) InOutFile63.in();
            if (f.equals("8")) InOutFile63.out();


        }


    }

