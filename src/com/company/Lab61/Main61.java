package com.company.Lab61;
import java.util.Scanner;

/**
 * Created by VZ-RED on 23.08.2016.
 */
public class Main61 {

    static int QUANTITY = 100;
    static Flat61 [] flat  = new Flat61 [QUANTITY];



    public static void main(String[] args) {
        for (int i=0; i<QUANTITY; i++) {
            flat[i]=new Flat61();
        }

     Main61.start();
    }

    public static void start(){
     System.out.println("Выберите необходимое действие и нажмите соответствующую цифру");
        System.out.println("1. Добавить квартиру с электроприборами");
        System.out.println("2. Изменить данные по электроприборам квартиры");
        System.out.println("3. Удалить электроприборы по квартире");
        System.out.println("4. Вывести на экран все квартиры с электроприборами");
        System.out.println("\nДля выхода из программы нажмите любую другую клавишу");

        Scanner s = new Scanner(System.in);
        String f = s.nextLine();
      //  s.close();

        if (f.equals("1")) Tasks61.additionFlat();
        if (f.equals("2")) Tasks61.changeFlat();
        if (f.equals("3")) Tasks61.deleteFlat();
        if (f.equals("4")) Tasks61.printAllFlat();

    }
}
