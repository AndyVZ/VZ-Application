package com.company.Lab7;

import java.util.Date;

import static com.company.Lab7.Main7.start;

/**
 * Created by VZ-RED on 04.10.2016.
 */
public class TimePrint {
    static long end;

    public static void  timePrint(){
        end = System.currentTimeMillis();
        long result = end - start;
        System.out.println("The program working "+result+" millis");
    }
}
