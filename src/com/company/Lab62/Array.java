package com.company.Lab62;


import java.util.ArrayList;
import java.util.Arrays;

import static com.company.Lab62.Array.flat;

/**
 * Created by VZ-RED on 24.08.2016.
 */
public class Array {

   static int QUANTITY = 100;
   static Flat62 [] flat  = new Flat62 [QUANTITY];
   // ArrayList<Flat62> flat = new ArrayList<Flat62>();

  //  public static void newArray(int numberFlat){
   //     System.out.println("зашли в метод эррэй");
   //     Flat62 [] tempFlat  = new Flat62 [QUANTITY];
   //     for (int i=0; i<numberFlat; i++) flat[i]=new Flat62();
   //     Flat62 [] flat = Arrays.copyOf(tempFlat,numberFlat);
    //    for (int i=0; i<QUANTITY; i++)
     //   {tempFlat[i]=flat[i];System.out.println(tempFlat[i]);}
    //    System.out.println(" эррэй 1-й фор");


     //   Flat62 [] flat  = new Flat62 [numberFlat-1];System.out.println(" эррэй 2-й фор");
    //    for (int i=0; i<numberFlat; i++) System.out.println(flat[i]);
      //       if (tempFlat[i]!=null) flat[i]=tempFlat[i];
      //      else flat[i]=new Flat62();
     //   }

     //   for (int i=0; i<QUANTITY; i++) {
      //      flat[i]=tempFlat[i];
     //   }System.out.println(" эррэй 3-й фор");

    //    for (int i=0; i<numberFlat; i++){
     //       System.out.println("Квартира № "+(i+1));
     //       System.out.println("холодильник: "+flat[i].getFridge()+" мощность: "+flat[i].getPowerFridge());
     //       System.out.println ("микроволновка: "+flat[i].getMicrowave()+" мощность: "+flat[i].getPowerMicrowave());
     //       System.out.println ("тостер: "+flat[i].getToaster()+" мощность: "+flat[i].getPowerToaster());
     //   }



     //   QUANTITY = numberFlat;
     //   System.out.println(QUANTITY);
   // }
}
