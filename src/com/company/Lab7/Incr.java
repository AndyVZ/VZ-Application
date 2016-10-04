package com.company.Lab7;

import java.util.Random;

import static com.company.Lab7.Main7.count;
import static com.company.Lab7.Main7.decrKill;
import static com.company.Lab7.Main7.incrKill;

/**
 * Created by VZ-RED on 04.10.2016.
 */
public class Incr extends Thread{
    public  void run() {
        final Random random = new Random();

        for (int i=0; i<100; i++){
            if (incrKill!=1){
            try { count++; System.out.println(count);
                Thread.sleep(random.nextInt(10));}
            catch (InterruptedException e) {System.err.print(e);}
             if (i==99)
            {TimePrint.timePrint(); decrKill=1; System.out.println("Increment win "+count);}}
        }

    }


}
