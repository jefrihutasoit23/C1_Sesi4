package application.chapter1.sesi4.latihan;

public class Latihan4 {
    public static void main(String[] args) {
        loopFor();
        System.out.println("=======");
        numberPattern();
        System.out.println("================");
        angka();
        System.out.println("=============");
        urutkanAbjad();
    }
    public static  void loopFor(){
        int n = 2;
        for (int i = 1; i <= 6; i++) {
            System.out.print(n + " ");
            n *= 2;
        }
    }
    public  static  void numberPattern(){
        int n = 2;
        for (int i = 1; i <= 5; i++) {
            if (i == 5) {
                System.out.print(n * n * n);
            } else {
                System.out.print(n + " ");
                n *= 2;
            }
        }
    }

//   urutkanANgka besar ke Kecil
    public  static  void angka(){
        int[] numbers = {6, 6, 5, 9, 2};

        // Mengurutkan angka dari besar ke kecil dengan loop for
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        // Menampilkan angka yang sudah diurutkan
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public  static  void urutkanAbjad(){
        String letters = "MAKAN NASI";

        // Mengubah string ke array karakter
        char[] charArray = letters.toCharArray();

        // Mengurutkan huruf dari awal ke akhir dengan loop for
        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] > charArray[j]) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }

        // Menampilkan huruf yang sudah diurutkan
        for (char letter : charArray) {
            System.out.print(letter + " ");
        }
    }
}
