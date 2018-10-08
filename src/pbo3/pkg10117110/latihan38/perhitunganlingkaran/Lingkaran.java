
package pbo3.pkg10117110.latihan38.perhitunganlingkaran;

import java.util.Scanner;


public class Lingkaran {
    public int diameter;
    public double jari2,luas,keliling;
    Scanner scan = new Scanner(System.in);
    
    public void input(){
        System.out.println("------Perhitungan Lingkaran------");
        System.out.print("Masukan Nilai Diameter Lingkaran : ");
 


    }
    
    public void hitungLingkaran(){
       diameter = scan.nextInt();
               //proses
        jari2 = (double) (diameter * 0.5);
        keliling = (double) (diameter * 3.14);
        luas = (double) ((jari2*jari2)*3.14);

        
        System.out.println("------Hasil Perhitungan------");
        System.out.println("Jari-jari Lingkaran = " +jari2);
        System.out.println("Luas Lingkaran = " +luas);
        System.out.println("Keliling Lingkaran = " +keliling);
    }
        
    }    
 
    

