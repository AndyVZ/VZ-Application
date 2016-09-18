package com.company.Lab63generic;

import java.util.Scanner;

import static com.company.Lab63generic.Main63.*;

/**
 * Created by VZ-RED on 13.09.2016.
 */
public class Task63 {



    public static void additionFlat(){


        try {

            Flat63 tempStorage = new Flat63();

            System.out.println("Введите номер квартиры");
            Scanner scanner = new Scanner(System.in);
            String tempNumberFlat = scanner.nextLine();
            int numberFlat = Integer.parseInt(tempNumberFlat);
            tempStorage.setNumberFlat(numberFlat);
            System.out.println ("Введите модель холодильника");
            String tempFridge = scanner.nextLine();
            tempStorage.setFridge(tempFridge) ;
            System.out.println ("Введите мощность холодильника");
            String tempPowerFridge = scanner.nextLine();
            tempStorage.setPowerFridge(tempPowerFridge) ;
            System.out.println ("Введите модель микроволновки");
            String tempMicrowave = scanner.nextLine();
            tempStorage.setMicrowave(tempMicrowave);
            System.out.println ("Введите мощность микроволновки");
            String tempPowerMicrowave = scanner.nextLine();
            tempStorage.setPowerMicrowave(tempPowerMicrowave);
            System.out.println ("Введите модель тостера");
            String tempToaster = scanner.nextLine();
            tempStorage.setToaster(tempToaster);
            System.out.println ("Введите мощность тостера");
            String tempPowerToaster = scanner.nextLine();
            tempStorage.setPowerToaster(tempPowerToaster);

            flat.add( tempStorage);

        } catch (RuntimeException e) {
            System.out.println("Неверный номер квартиры");
        }

        start();
    }

    public static void changeFlat(){

        try {
            System.out.println ("Введите номер редактируемой квартиры");
            Scanner scanner = new Scanner(System.in);
            String tempNumberFlat = scanner.nextLine();
            int numberFlat = Integer.parseInt(tempNumberFlat);

            Flat63 tempStorage = new Flat63();
            int targetNumberInArrayList = -1;
            int tempTargetNumberInArrayList = -1;

            for (int i=0; i<flat.size(); i++){
              tempStorage = flat.get(i);
              tempTargetNumberInArrayList = (int)tempStorage.getNumberFlat();
                if (tempTargetNumberInArrayList==numberFlat-1) targetNumberInArrayList = numberFlat;
            }


            System.out.println ("Введите номер редактируемого поля\nмодель холодильника-1\nмощность холодильника-2\n");
            System.out.println ("модель микроволновки-3\nмощность микроволновки-4\n");
            System.out.println ("модель тостера-5\nмощность тостера-6\n");
            String tempNumberDevice = scanner.nextLine();



            if (tempNumberDevice.equals("1")){
                String tempFridge = scanner.nextLine();
                tempStorage.setFridge(tempFridge) ;
            } ;
            if (tempNumberDevice.equals("3")){
                String tempMicrowave = scanner.nextLine();
                tempStorage.setMicrowave(tempMicrowave);
            } ;
            if (tempNumberDevice.equals("5")){
                String tempToaster = scanner.nextLine();
                tempStorage.setToaster(tempToaster);
            } ;
            if (tempNumberDevice.equals("2")){
                String tempPowerFridge = scanner.nextLine();
                tempStorage.setPowerFridge(tempPowerFridge) ;
            } ;
            if (tempNumberDevice.equals("4")){
                String tempPowerMicrowave = scanner.nextLine();
                tempStorage.setPowerMicrowave(tempPowerMicrowave);
            } ;
            if (tempNumberDevice.equals("6")){
                String tempPowerToaster = scanner.nextLine();
                tempStorage.setPowerToaster(tempPowerToaster);
            } ;

            flat.set(targetNumberInArrayList-1, tempStorage);
        }
        catch (RuntimeException e) {System.out.println("Неверный номер квартиры");}

        start();
    }

    public static void deleteFlat(){
        try {
            System.out.println ("Введите номер квартиры для которой удалить электроприборы");
            Scanner scanner = new Scanner(System.in);
            String tempNumberFlat = scanner.nextLine();
            int numberFlat = Integer.parseInt(tempNumberFlat);

            Flat63 tempStorage = new Flat63();
            int targetNumberInArrayList = -1;
            int tempTargetNumberInArrayList = -1;

            for (int i=0; i<flat.size(); i++){
                tempStorage = flat.get(i);
                tempTargetNumberInArrayList = (int)tempStorage.getNumberFlat();
                if (tempTargetNumberInArrayList==numberFlat) flat.remove(i);
            }

        }
        catch (RuntimeException e) {System.out.println("Неверный номер квартиры");}

        Main63.start();
    }

    public static void printAllFlat(){
        for (int i=0; i<flat.size(); i++){

            Flat63 tempStorage = flat.get(i);
            if (tempStorage.getFridge()!=null | tempStorage.getMicrowave()!=null |tempStorage.getToaster()!=null ){
               System.out.println("Квартира № "+tempStorage.getNumberFlat());
                System.out.println("холодильник: "+tempStorage.getFridge()+" мощность: "+tempStorage.getPowerFridge());
                System.out.println ("микроволновка: "+tempStorage.getMicrowave()+" мощность: "+tempStorage.getPowerMicrowave());
                System.out.println ("тостер: "+tempStorage.getToaster()+" мощность: "+tempStorage.getPowerToaster());}

    }
        Main63.start();

    }

    public static void flatMaxPower (){
        Flat63 tempStorage = new Flat63();

        int sum=0;
        int maxSum=0;
        int k=0;
        for (int i=0; i<flat.size(); i++){
        tempStorage = flat.get(i);
                  if (tempStorage.getPowerFridge()!=null | tempStorage.getPowerMicrowave()!=null |tempStorage.getPowerToaster()!=null ){
                     int i1=0, i2=0, i3=0;

                      String s1 = (String) tempStorage.getPowerFridge();
                      i1= Integer.parseInt(s1);
                      String s2 = (String)tempStorage.getPowerMicrowave();
                      i2= Integer.parseInt(s2);
                      String s3 = (String)tempStorage.getPowerToaster();
                      i3= Integer.parseInt(s3);
                sum =i1+ i2+ i3;
                if (sum>maxSum) {maxSum = sum;k=(int)tempStorage.getNumberFlat();}

            }}
        System.out.println("Наибольшая присоединенная мощность в квартире № "+k);

        Main63.start();
    }


    public static void printAverage(){
        Flat63 tempStorage = new Flat63();

        int sum=0;
        int k=0;
        float average=0;
        for (int i=0; i<flat.size(); i++){
                tempStorage = flat.get(i);
                int i1=0, i2=0, i3=0;

                String s1 = (String) tempStorage.getPowerFridge();
                i1= Integer.parseInt(s1);
                String s2 = (String)tempStorage.getPowerMicrowave();
                i2= Integer.parseInt(s2);
                String s3 = (String)tempStorage.getPowerToaster();
                i3= Integer.parseInt(s3);
                sum = sum + i1 + i2 + i3;
                k++;
                System.out.println(k);
            }

        average=sum/k;

        System.out.println("Средняя присоединенная мощность: "+average);
        Main63.start();

    }


}
