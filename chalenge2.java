/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraygaynn;

/**
 *
 * @author In your dream
 */
public class chalenge2 {
    public static void main(String [] args){
        
                int nilai [] = new int [5];
         nilai [0] = 78;
         nilai [1] = 89;
         nilai [2] = 90;
         nilai [3] = 100;
         nilai [4] = 85;
         double ratarata = 0.0;
         for (int i = 0 ; i<nilai.length; i++)ratarata +=nilai [i];
         ratarata/=nilai.length;
         System.out.println(">>>>>>> PROGRAM NILAI SLURRR <<<<<<");
         System.out.println("");
         
         System.out.println("Rata rata <75 : SEMAANGAT LAH GAYNNN BIAR PINTER");
         System.out.println("Rata rata 75 - 80 : Rata rata lumayan");
         System.out.println("Rata rata 81-90 : Rata rata mantap");
         System.out.println("Rata rata 91-100 : Ini pakai cheat ngerjakanya pak :v");
         System.out.println("");
         System.out.println("");
         
         if (ratarata< 75){
             System.out.print("=====Rata Rata kamu kurang bagoes gaynn :D=====");
         }else if (ratarata  > 75){
             System.out.println("====Rata Rata kamu sangat bagoesss====");
         }
         
         System.out.println("Nilai rata rata = " + ratarata);
    }
    
    
    
}
