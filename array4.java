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
public class array4 {
   // public static void main(String [] args){
       
    int Nis [] [] = {{210651},{210651},{210652}};
    String Nama [] [] = {{"adam"},{"damar"},{"noe"}};
    
    public void tampil(String n){
    System.out.print("Identitas siswa angkatan 24");
    }
    public void namanis (int n){
        for (int i = 0; i< 1; i++){
       for (int j = 0; j < 1; j++){

           System.out.println (Nama [1] [j] +  ":" + Nis[1] [j]);
       }
    }   
}
    public static void main(String[] args) {
         array4 siswa = new array4();
        siswa.tampil (null);
        siswa.namanis (0) ;
        
    }
       
    }

