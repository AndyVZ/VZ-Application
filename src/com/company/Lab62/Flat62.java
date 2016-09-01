package com.company.Lab62;

/**
 * Created by VZ-RED on 24.08.2016.
 */
public class Flat62 {
    private String fridge ;
    private String microwave ;
    private String toaster ;
    private int powerFridge;
    private int powerMicrowave ;
    private int powerToaster ;

    public String getFridge() {
        return fridge;
    }

    public void setFridge(String fridge) {
        this.fridge = fridge;
    }

    public String getMicrowave() {
        return microwave;
    }

    public void setMicrowave(String microwave) {

        this.microwave = microwave;
    }

    public String getToaster() {
        return toaster;
    }

    public void setToaster(String toaster) {
        this.toaster = toaster;
    }



    public int getPowerFridge() {
        return powerFridge;
    }

    public void setPowerFridge(String powerFridge) {
        try{
            int temp = Integer.parseInt(powerFridge);
            if (temp>0)   this.powerFridge = temp;
            else System.out.println("Неверная мощность холодильника");
        }
        catch (RuntimeException e) {System.out.println("Неверная мощность холодильника");}
            }

    public int getPowerMicrowave() {
        return powerMicrowave;
    }

    public void setPowerMicrowave(String powerMicrowave) {

        try{
            int temp = Integer.parseInt(powerMicrowave);
            if (temp>0) this.powerMicrowave = temp;
            else System.out.println("Неверная мощность микроволновки");
        }
        catch (RuntimeException e) {System.out.println("Неверная мощность микроволновки");}
    }

    public int getPowerToaster() {
        return powerToaster;
    }

    public void setPowerToaster(String powerToaster) {

        try{
            int temp = Integer.parseInt(powerToaster);
            if (temp>0)this.powerToaster = temp;
            else System.out.println("Неверная мощность тостера");
        }
        catch (RuntimeException e) {System.out.println("Неверная мощность тостера");}
    }
}
