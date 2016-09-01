package com.company.Lab61;

import java.util.Scanner;

import static com.company.Lab61.Main61.flat;

/**
 * Created by VZ-RED on 23.08.2016.
 */
public class Tasks61 {


    public static void additionFlat(){
        try {
        System.out.println ("Введите номер квартиры");
        Scanner scanner = new Scanner(System.in);
        String tempNumberFlat = scanner.nextLine();
        int numberFlat = Integer.parseInt(tempNumberFlat);

        System.out.println ("Введите модель холодильника");
        String tempFridge = scanner.nextLine();
        flat[numberFlat-1].setFridge(tempFridge) ;
        System.out.println ("Введите модель микроволновки");
        String tempMicrowave = scanner.nextLine();
        flat[numberFlat-1].setMicrowave(tempMicrowave);
        System.out.println ("Введите модель тостера");
        String tempToaster = scanner.nextLine();
        flat[numberFlat-1].setToaster(tempToaster);}
        catch (RuntimeException e) {System.out.println("Неверный номер квартиры");}
   //     scanner.close();
     Main61.start();
    }

    public static void changeFlat(){

        try {
        System.out.println ("Введите номер редактируемой квартиры");
        Scanner scanner = new Scanner(System.in);
        String tempNumberFlat = scanner.nextLine();
        int numberFlat = Integer.parseInt(tempNumberFlat);

        System.out.println ("Введите номер редактируемого электроприбора\nхолодильник-1\nмикроволновка-2\nтостер-3\n");
        String tempNumberDevice = scanner.nextLine();
        if (tempNumberDevice.equals("1")){
            String tempFridge = scanner.nextLine();
            flat[numberFlat-1].setFridge(tempFridge) ;
        } ;
        if (tempNumberDevice.equals("2")){
            String tempMicrowave = scanner.nextLine();
            flat[numberFlat-1].setMicrowave(tempMicrowave);
        } ;
        if (tempNumberDevice.equals("3")){
            String tempToaster = scanner.nextLine();
            flat[numberFlat-1].setToaster(tempToaster);
        } ;
        }
catch (RuntimeException e) {System.out.println("Неверный номер квартиры");}
  //      scanner.close();
        Main61.start();
    }

    public static void deleteFlat(){
        try {
        System.out.println ("Введите номер квартиры для которой удалить электроприборы");
        Scanner scanner = new Scanner(System.in);
        String tempNumberFlat = scanner.nextLine();
        int numberFlat = Integer.parseInt(tempNumberFlat);

        flat[numberFlat-1].setFridge(null) ;
        flat[numberFlat-1].setMicrowave(null);
        flat[numberFlat-1].setToaster(null);}
        catch (RuntimeException e) {System.out.println("Неверный номер квартиры");}
  //      scanner.close();
        Main61.start();
    }

    public static void printAllFlat(){
        for (int i=0; i<Main61.QUANTITY; i++){
                if (flat[i].getFridge()!=null | flat[i].getMicrowave()!=null |flat[i].getToaster()!=null ){
                System.out.println("Квартира № "+(i+1));
                System.out.println("холодильник: "+flat[i].getFridge()+" микроволновка: "+flat[i].getMicrowave()+" тостер: "+flat[i].getToaster());
                  }}
        Main61.start();

    }
}
