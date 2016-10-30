package com.company.Lab72;

/**
 * Created by VZ-RED on 30.10.2016.
 */
public class Sorter1Lab72 extends Thread {


    int bigArray1[];
    int ARRAY_LENGHT1;


    Sorter1Lab72 (int array[], int ARRAY_LENGHT){
    bigArray1 = array;
    ARRAY_LENGHT1 = ARRAY_LENGHT;
    }

    public void run(){

     //   System.out.println("start1");
        MainLab72.halfArray1 = new int [ARRAY_LENGHT1/2];
     for (int i=0; i<(ARRAY_LENGHT1/2); i++) {
         MainLab72.halfArray1[i]=bigArray1[i];
        // System.out.println("половина *1 "+MainLab72.halfArray1[i]);
     }

        for (int i=0; i<(ARRAY_LENGHT1/2); i++) {
            for (int j=0; j<(ARRAY_LENGHT1/2-1); j++) {
                if (MainLab72.halfArray1[j]>MainLab72.halfArray1[j+1]){
                    int temp = MainLab72.halfArray1[j];
                    MainLab72.halfArray1[j] = MainLab72.halfArray1[j+1];
                    MainLab72.halfArray1[j+1] = temp;
                }
            }
        }
     //   for (int i=0; i<(ARRAY_LENGHT1/2); i++) System.out.println("половина *1 сорт "+MainLab72.halfArray1[i]);

    }


}
