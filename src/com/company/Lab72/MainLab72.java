package com.company.Lab72;

import java.util.Random;

import static com.company.Lab72.ss.sss;

/**
 * Created by VZ-RED on 30.10.2016.
 */
public class MainLab72 {

    static int halfArray1[];
    static int halfArray2[];
    static int array[];

    public static void main(String[] args) {


        testThreadSort (5_000);
        testThreadSort(10_000);
        testThreadSort (50_000);
        usualSort(5_000);
        usualSort(10_000);
        usualSort(50_000);
        sss(5_000);
        sss(10_000);
        sss(50_000);

    }

    public static void testThreadSort (int al){

        long start, finish;
        long result;

        int ARRAY_LENGHT = al;
        int array[] = new int[ARRAY_LENGHT];
        int sortArray[] = new int [ARRAY_LENGHT];

        final Random random = new Random();

        for (int i=0; i<ARRAY_LENGHT; i++) array[i]= random.nextInt(100);
       // for(int i=0; i<(ARRAY_LENGHT); i++) System.out.println("Исходный массив "+array[i]);


        Sorter1Lab72 sort1 = new Sorter1Lab72(array, ARRAY_LENGHT);
        Sorter2Lab72 sort2 = new Sorter2Lab72(array, ARRAY_LENGHT);


        start = System.currentTimeMillis();

        sort1.start();
        sort2.start();


        try{
            sort1.join();
            sort2.join();
        } catch(InterruptedException e){e.printStackTrace();}


        int i1=0,i2=0;
        for (int i=0; i<ARRAY_LENGHT; i++) {
            if (halfArray1[i1]>=halfArray2[i2]) {
                sortArray[i]=halfArray2[i2];
          //      System.out.println(sortArray[i]);
                if (i2<(ARRAY_LENGHT/2-1)) i2++;
            }
            else {
                sortArray[i]=halfArray1[i1];
          //  System.out.println(sortArray[i]);
                if (i1<(ARRAY_LENGHT/2-1)) i1++;
                }}


        finish = System.currentTimeMillis();
        result = start - finish;
        System.out.println("Время выполнения сортировки "+ARRAY_LENGHT+" элементов потоками "+result+" милисекунд");
}
public static void usualSort(int al3){

    UsualSorterLab72 u_sort = new UsualSorterLab72(array, al3);
    UsualSorterLab72.usualSort();
}
}
