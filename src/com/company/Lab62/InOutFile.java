package com.company.Lab62;

import java.io.*;
import java.util.Scanner;

import static com.company.Lab62.Main62.flat;


/**
 * Created by VZ-RED on 01.09.2016.
 */
public class InOutFile {

        public static void out ()  {

        try {

            System.out.println ("Введите название файла для чтения ");
            Scanner scanner = new Scanner(System.in);
            String fileName = scanner.nextLine();

            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);


            try {
                 flat = (Flat62[]) ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            ois.close();


        } catch(IOException e)
        { throw new RuntimeException(e);        }
        Main62.start();
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
        Main62.start();
    }
}
