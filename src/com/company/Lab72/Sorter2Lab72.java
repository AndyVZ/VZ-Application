package com.company.Lab72;

/**
 * Created by VZ-RED on 30.10.2016.
 */
public class Sorter2Lab72 extends Thread{

    int bigArray2[];
    int ARRAY_LENGHT2;


    Sorter2Lab72 (int array[], int ARRAY_LENGHT){
        bigArray2 = array;
        ARRAY_LENGHT2 = ARRAY_LENGHT;
    }

    public void run(){
    //    System.out.println("start2");
        int j=0;
        MainLab72.halfArray2 = new int [ARRAY_LENGHT2/2];
        for (int i=(ARRAY_LENGHT2/2); i<ARRAY_LENGHT2; i++) {
            MainLab72.halfArray2[j]=bigArray2[i];
      //      System.out.println("половина *2 "+MainLab72.halfArray2[j]);
            j++;
        }
        for (int i=0; i<(ARRAY_LENGHT2/2); i++) {
            for (int k=0; k<(ARRAY_LENGHT2/2-1); k++) {
                if (MainLab72.halfArray2[k]>MainLab72.halfArray2[k+1]){
                    int temp = MainLab72.halfArray2[k];
                    MainLab72.halfArray2[k] = MainLab72.halfArray2[k+1];
                    MainLab72.halfArray2[k+1] = temp;
                }
            }
        }
    //    for (int i=0; i<(ARRAY_LENGHT2/2); i++) System.out.println("половина *2 сорт "+MainLab72.halfArray2[i]);
    }

}
