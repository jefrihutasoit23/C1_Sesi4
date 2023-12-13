package application.chapter1.sesi3;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angka1, angka2;
        char operator;

        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextDouble();

        System.out.print("Pilih operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextDouble();

        double hasil = hitung(angka1, angka2, operator);
        System.out.println("Hasil: " + hasil);
    }

    public static double hitung(double angka1, double angka2, char operator) {
        double hasil = 0.0;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diizinkan.");
                    System.exit(1);
                }
                break;
            default:
                System.out.println("Error: Operator tidak valid.");
                System.exit(1);
        }

        return hasil;
    }
}
