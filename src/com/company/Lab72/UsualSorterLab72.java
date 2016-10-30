package com.company.Lab72;

/**
 * Created by VZ-RED on 30.10.2016.
 */
public class UsualSorterLab72  {

    static int array3 [];
    static int ARRAY_LENGHT3;
    long start, finish, result;

    UsualSorterLab72 (int array[], int ARRAY_LENGHT){
        array3 = array;
        ARRAY_LENGHT3 = ARRAY_LENGHT;
    }
public static void usualSort(){
    long start0, finish0, result0;
    start0 = System.currentTimeMillis();
    array3 = new int [ARRAY_LENGHT3];


  //  System.out.println("start"+ARRAY_LENGHT3);
    for (int i=0; i<ARRAY_LENGHT3; i++) {
        for (int j=0; j<(ARRAY_LENGHT3-1); j++) {
            if (array3[j]>array3[j+1]){
                int temp = array3[j];
                array3[j] = array3[j+1];
                array3[j+1] = temp;
            }
        }
    }
    finish0 = System.currentTimeMillis();
    result0 = start0 - finish0;
    System.out.println("Время выполнения сортировки "+ARRAY_LENGHT3+" элементов без потоков "+result0+" милисекунд");

}}
