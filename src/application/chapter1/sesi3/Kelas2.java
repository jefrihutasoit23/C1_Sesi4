package application.chapter1.sesi3;

import java.util.Scanner;

public class Kelas2 {
  static   String nama="jefri";
  static   int angka2;

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double angka1, angka2;
    System.out.println("silahkan masukkan inputan 1:");
    angka1  =  input.nextDouble();

    System.out.println("silahkan masukkan inputan 2:");
    angka2  =  input.nextDouble();

    System.out.println("ini input 1="+angka1);
    System.out.println("ini input 2="+angka2);

    System.out.println("ini perkalian ="+perkalian(angka1,angka2));
  }

  public static   double perkalian (double angka1, double angka2){
    return  angka1 * angka2;
  }
}
