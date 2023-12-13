package application.chapter1.sesi3;

import java.util.ArrayList;
import java.util.List;

public class KelasKalkulator {
    static String variabelinstan;

    public static void main(String[] args) {
//        angka1
//        angka2
        /*
        komentar
         */

        variabelinstan = "akses nama variabel";
        System.out.println("Hello Word");
        char status = '1';
        String nama = "jefri";
        int angka1 = 2;
        Integer integerBesar = null;
        System.out.println(integerBesar);


        long angka2 = 345678911;

        float float1;

        double doublE = 3;
        Double doubBesar = null;
        System.out.println(doubBesar);
        System.out.println(doubBesar);

        boolean statusActive = false;

//        var bilanganVar  = "String";
//        var bilanganVarAngka  = 1;
//        var doubleAngka  = 1.0;
        final int finalVariabel = 12;
//        finalVariabel =3;

//        call calls global : static
        List<Integer> dataDiri = new ArrayList<>();
        dataDiri.add(1);
        System.out.println(dataDiri.get(0));
        System.out.println(Kelas2.angka2);
        nama();
        namaSaya("jefri");
        angkaLahir(1);
        d();
    }

    static void d() {
        Thread.dumpStack();
    }

    public static void nama() {
        /*
        isi kode program
        void  tidak return nilai
         */
        System.out.println("ini method nama");
    }

    public static void nama(String nama) {
        /*
        void  tidak return nilai
         */
        System.out.println("ini method nama dengan parameter string");
    }

    public static String namaSaya() {
        /*
         return nilai
         */
        System.out.println("ini method return nama dengan tampar parameter ");
        return "jefri";
    }

    public static String namaSaya(String nama) {
        /*
         return nilai
         */
        System.out.println("ini method return nama dengan  parameter string= " + nama);
        return nama;
    }

    public static int angkaLahir(Integer nama) {
        /*
         return nilai
         */
        System.out.println("ini method return nama dengan  parameter string= " + nama);
        return nama;

        /*
        logging : nyimpna log,
        catch exeption : mengethui erornya di method apa, description eror apa?
         */
    }

}
