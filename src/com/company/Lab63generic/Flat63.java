package com.company.Lab63generic;

import java.io.Serializable;

/**
 * Created by VZ-RED on 13.09.2016.
 */
public class Flat63 <S, N> implements Serializable {

    private S fridge ;
    private S microwave ;
    private S toaster ;
    private N powerFridge;
    private N powerMicrowave ;
    private N powerToaster ;
    private N numberFlat;

    public S getFridge() {
        return fridge;
    }

    public void setFridge(S fridge) {
        this.fridge = fridge;
    }

    public S getMicrowave() {
        return microwave;
    }

    public void setMicrowave(S microwave) {

        this.microwave = microwave;
    }

    public S getToaster() {
        return toaster;
    }

    public void setToaster(S toaster) {
        this.toaster = toaster;
    }



    public N getPowerFridge() {
        return powerFridge;
    }

    public void setPowerFridge(N powerFridge) {
        this.powerFridge = powerFridge;
   //     try{
   //         int temp = Integer.parseInt(powerFridge);
   //         if (temp>0) this.powerFridge = temp;
   //         else System.out.println("Неверная мощность холодильника");
   //     }
   //     catch (RuntimeException e) {System.out.println("Неверная мощность холодильника");}
    }

    public N getPowerMicrowave() {
        return powerMicrowave;
    }

    public void setPowerMicrowave(N powerMicrowave) {

        this.powerMicrowave = powerMicrowave;

  //      try{
   //         int temp = Integer.parseInt(powerMicrowave);
   //         if (temp>0) this.powerMicrowave = temp;
  //          else System.out.println("Неверная мощность микроволновки");
  //      }
  //      catch (RuntimeException e) {System.out.println("Неверная мощность микроволновки");}
    }

    public N getPowerToaster() {
        return powerToaster;
    }

    public void setPowerToaster(N powerToaster) {

        this.powerToaster = powerToaster;

   //     try{
   //         int temp = Integer.parseInt(powerToaster);
   //         if (temp>0)this.powerToaster = temp;
   //         else System.out.println("Неверная мощность тостера");
   //     }
   //     catch (RuntimeException e) {System.out.println("Неверная мощность тостера");}
    }

    public N getNumberFlat() {
        return numberFlat;
    }

    public void setNumberFlat(N numberFlat) {

        this.numberFlat = numberFlat;

        //     try{
        //         int temp = Integer.parseInt(powerToaster);
        //         if (temp>0)this.powerToaster = temp;
        //         else System.out.println("Неверная мощность тостера");
        //     }
        //     catch (RuntimeException e) {System.out.println("Неверная мощность тостера");}
    }

}
