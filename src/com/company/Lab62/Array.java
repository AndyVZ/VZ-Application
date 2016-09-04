package com.company.Lab62;

import java.util.Scanner;

import static com.company.Lab62.Main62.QUANTITY;
import static com.company.Lab62.Main62.flat;
import static com.company.Lab62.Main62.flatTemp;


/**
 * Created by VZ-RED on 24.08.2016.
 */
public class Array {


    static int tempQUANTITY;
    int tempQ;

    public static void arraySize () {

            System.out.println("Введите размерность базы данных");
            Scanner s = new Scanner(System.in);
            String f = s.nextLine();
            int i = Integer.parseInt(f);
        Array.setQUANTITY (i);

    }



    public static int getQUANTITY() {
        return tempQUANTITY;
    }

    public static void setQUANTITY (int tempQ) {


        try{

            if (tempQ>0) tempQUANTITY = tempQ;
            else System.out.println("Неверная размерность массива");
        }
        catch (RuntimeException e) {System.out.println("Неверная размерность массива");}
    }



    public static void arrayInic (){
        QUANTITY=Array.getQUANTITY();
        flat = new Flat62 [QUANTITY];
        for (int i=0; i<QUANTITY; i++) {
            flat[i]=new Flat62();
        }

    }

    public static void arrayReSize () {
        System.out.println("Введите размерность базы данных");
        Scanner s = new Scanner(System.in);
        String f = s.nextLine();
        int q = Integer.parseInt(f);
        try{

            if (q>0) tempQUANTITY = q;
            else System.out.println("Неверная размерность массива");
        }
        catch (RuntimeException e) {System.out.println("Неверная размерность массива");}

        QUANTITY=Array.getQUANTITY();

        flatTemp = new Flat62 [QUANTITY];
        for (int i=0; i<QUANTITY; i++) {
            flatTemp[i]=new Flat62();
        }


        for (int i=0; i<flat.length; i++) {
            flatTemp[i]=flat[i];
        }

        flat = new Flat62 [QUANTITY];
        for (int i=0; i<QUANTITY; i++) {
            flat[i]=flatTemp[i];
        }
        Main62.start();

    }

}
