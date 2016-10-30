package com.company.Lab72;

import java.util.Random;

/**
 * Created by VZ-RED on 30.10.2016.
 */
public class ss {

    static int array4 [];
    static int ARRAY_LENGHT4;
    long start, finish, result;

    public static void sss(int qq){
        ARRAY_LENGHT4=qq;
        long start0, finish0, result0;

        final Random random = new Random();
        array4 = new int [ARRAY_LENGHT4];
        for (int i=0; i<ARRAY_LENGHT4; i++) array4[i]= random.nextInt(100);

        start0 = System.currentTimeMillis();



        //  System.out.println("start"+ARRAY_LENGHT3);
        for (int i=0; i<ARRAY_LENGHT4; i++) {
            for (int j=0; j<(ARRAY_LENGHT4-1); j++) {
                if (array4[j]>array4[j+1]){
                    int temp = array4[j];
                    array4[j] = array4[j+1];
                    array4[j+1] = temp;
                }
            }
        }
        finish0 = System.currentTimeMillis();
        result0 = start0 - finish0;
        System.out.println("Время выполнения сортировки "+ARRAY_LENGHT4+" элементов без потоков нового массива"+result0+" милисекунд");

    }
}
