package application.chapter1.sesi5.latihan;

import java.util.Scanner;

class BilanganPrima {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int i;
        int num;
        String primeNumbers = "";
        System.out.println("Bilangan prima yang akan ditampilkan hingga:");
        int n = scanner.nextInt();
        scanner.close();
        for (i = 1; i <= n; i++) {
            int counter=0;
            for(num =i; num>=1; num--) {
                if(i%num==0) {
                    counter = counter + 1;
                }
            }
            if (counter ==2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Berikut bilangan primanya :");
        System.out.println(primeNumbers);
    }
}
