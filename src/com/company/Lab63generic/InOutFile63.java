package com.company.Lab63generic;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static com.company.Lab63generic.Main63.flat;

/**
 * Created by VZ-RED on 13.09.2016.
 */
public class InOutFile63 {



    public static void out ()  {

        try {

            System.out.println ("Введите название файла для чтения ");
            Scanner scanner = new Scanner(System.in);
            String fileName = scanner.nextLine();

            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);


            try {
                flat = (ArrayList<Flat63>) ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            ois.close();


        } catch(IOException e)
        { throw new RuntimeException(e);        }
        Main63.start();
    }


    public static void in()  {
        try {

            System.out.println ("Введите название файла для записи ");
            Scanner scanner = new Scanner(System.in);
            String fileName = scanner.nextLine();

            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(flat);
            oos.flush();
            oos.close();

        } catch(IOException e)
        { throw new RuntimeException(e);        }
        Main63.start();
    }
}
