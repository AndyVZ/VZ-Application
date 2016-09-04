package com.company.Lab62;

import java.io.IOException;
import java.util.Scanner;



/**
 * Created by VZ-RED on 24.08.2016.
 */
public class Main62 {
    static int QUANTITY;
    static Flat62 [] flat;
    static Flat62 [] flatTemp;





    public static void main(String[] args) {
        Array.arraySize();
        Array.arrayInic();
        Main62.start();
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
        System.out.println("9. Ввеcти размерность массива");
        System.out.println("\nДля выхода из программы нажмите любую другую клавишу");

        Scanner s = new Scanner(System.in);
        String f = s.nextLine();

        if (f.equals("1")) Task62.additionFlat();
        if (f.equals("2")) Task62.changeFlat();
        if (f.equals("3")) Task62.deleteFlat();
        if (f.equals("4")) Task62.printAllFlat();
        if (f.equals("5")) Task62.flatMaxPower();
        if (f.equals("6")) Task62.printAverage();
        if (f.equals("7")) InOutFile.in();
        if (f.equals("8")) InOutFile.out();
        if (f.equals("9")) Array.arrayReSize();

    }


}
