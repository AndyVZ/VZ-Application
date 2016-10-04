package com.company.Lab7;

/**
 * Created by VZ-RED on 04.10.2016.
 */
public class Main7 {
    static int count=0;
    static int incrKill=0;
    static int decrKill=0;
    static long start;

    public static void main(String[] args) {

        start = System.currentTimeMillis();

        Incr incr = new Incr ();
        Decr decr = new Decr();

        incr.start();
        decr.start();

       // System.out.println("Result is " + count);
    }
}

