package com.company.Lab62;

import java.util.Scanner;


import static com.company.Lab62.Main62.flat;


/**
 * Created by VZ-RED on 24.08.2016.
 */
public class Task62
{
    public static void additionFlat(){
        try {
            System.out.println ("Введите номер квартиры");
            Scanner scanner = new Scanner(System.in);
            String tempNumberFlat = scanner.nextLine();
            int numberFlat = Integer.parseInt(tempNumberFlat);


            System.out.println ("Введите модель холодильника");
            String tempFridge = scanner.nextLine();
            flat[numberFlat-1].setFridge(tempFridge) ;
            System.out.println ("Введите мощность холодильника");
            String tempPowerFridge = scanner.nextLine();
            flat[numberFlat-1].setPowerFridge(tempPowerFridge) ;
            System.out.println ("Введите модель микроволновки");
            String tempMicrowave = scanner.nextLine();
            flat[numberFlat-1].setMicrowave(tempMicrowave);
            System.out.println ("Введите мощность микроволновки");
            String tempPowerMicrowave = scanner.nextLine();
            flat[numberFlat-1].setPowerMicrowave(tempPowerMicrowave);
            System.out.println ("Введите модель тостера");
            String tempToaster = scanner.nextLine();
            flat[numberFlat-1].setToaster(tempToaster);
            System.out.println ("Введите мощность тостера");
            String tempPowerToaster = scanner.nextLine();
            flat[numberFlat-1].setPowerToaster(tempPowerToaster);


        }
        catch (RuntimeException e) {System.out.println("Неверный номер квартиры");}
        //     scanner.close();
        Main62.start();
    }

    public static void changeFlat(){

        try {
            System.out.println ("Введите номер редактируемой квартиры");
            Scanner scanner = new Scanner(System.in);
            String tempNumberFlat = scanner.nextLine();
            int numberFlat = Integer.parseInt(tempNumberFlat);

            System.out.println ("Введите номер редактируемого поля\nмодель холодильника-1\nмощность холодильника-2\n");
            System.out.println ("модель микроволновки-3\nмощность микроволновки-4\n");
            System.out.println ("модель тостера-5\nмощность тостера-6\n");
            String tempNumberDevice = scanner.nextLine();
            if (tempNumberDevice.equals("1")){
                String tempFridge = scanner.nextLine();
                flat[numberFlat-1].setFridge(tempFridge) ;
            } ;
            if (tempNumberDevice.equals("3")){
                String tempMicrowave = scanner.nextLine();
                flat[numberFlat-1].setMicrowave(tempMicrowave);
            } ;
            if (tempNumberDevice.equals("5")){
                String tempToaster = scanner.nextLine();
                flat[numberFlat-1].setToaster(tempToaster);
            } ;


            if (tempNumberDevice.equals("2")){
                String tempPowerFridge = scanner.nextLine();
                flat[numberFlat-1].setPowerFridge(tempPowerFridge) ;
            } ;
            if (tempNumberDevice.equals("4")){
                String tempPowerMicrowave = scanner.nextLine();
                flat[numberFlat-1].setPowerMicrowave(tempPowerMicrowave);
            } ;
            if (tempNumberDevice.equals("6")){
                String tempPowerToaster = scanner.nextLine();
                flat[numberFlat-1].setPowerToaster(tempPowerToaster);
            } ;

        }
        catch (RuntimeException e) {System.out.println("Неверный номер квартиры");}
        //      scanner.close();
        Main62.start();
    }

    public static void deleteFlat(){
        try {
            System.out.println ("Введите номер квартиры для которой удалить электроприборы");
            Scanner scanner = new Scanner(System.in);
            String tempNumberFlat = scanner.nextLine();
            int numberFlat = Integer.parseInt(tempNumberFlat);

            flat[numberFlat-1].setFridge(null) ;
            flat[numberFlat-1].setMicrowave(null);
            flat[numberFlat-1].setToaster(null);
            flat[numberFlat-1].setPowerFridge(null) ;
            flat[numberFlat-1].setPowerMicrowave(null);
            flat[numberFlat-1].setPowerToaster(null);
        }
        catch (RuntimeException e) {System.out.println("Неверный номер квартиры");}
        //      scanner.close();
        Main62.start();
    }

    public static void printAllFlat(){
        for (int i=0; i<Main62.QUANTITY; i++){
            if (flat[i].getFridge()!=null | flat[i].getMicrowave()!=null |flat[i].getToaster()!=null ){
                System.out.println("Квартира № "+(i+1));
                System.out.println("холодильник: "+flat[i].getFridge()+" мощность: "+flat[i].getPowerFridge());
                System.out.println ("микроволновка: "+flat[i].getMicrowave()+" мощность: "+flat[i].getPowerMicrowave());
                System.out.println ("тостер: "+flat[i].getToaster()+" мощность: "+flat[i].getPowerToaster());
            }}
        Main62.start();

    }

    public static void flatMaxPower (){
        int sum=0;
        int maxSum=0;
        int k=0;
        for (int i=0; i<Main62.QUANTITY; i++){
            if (flat[i].getPowerFridge()!=0 | flat[i].getPowerMicrowave()!=0 |flat[i].getPowerToaster()!=0 ){
                sum = flat[i].getPowerFridge()+ flat[i].getPowerMicrowave()+ flat[i].getPowerToaster();
                if (sum>maxSum) {maxSum = sum;k=i;}

            }}
                System.out.println("Наибольшая присоединенная мощность в квартире № "+(k+1));

        Main62.start();
    }


    public static void printAverage(){
        int sum=0;
        int k=0;
        float average=0;
        for (int i=0; i<Main62.QUANTITY; i++){
            if (flat[i].getPowerFridge()!=0 | flat[i].getPowerMicrowave()!=0 |flat[i].getPowerToaster()!=0 ){
             sum = sum + flat[i].getPowerFridge()+ flat[i].getPowerMicrowave()+ flat[i].getPowerToaster();
             k++;
            }}
            average=sum/k;
            System.out.println("Средняя присоединенная мощность: "+average);
        Main62.start();

    }





}
