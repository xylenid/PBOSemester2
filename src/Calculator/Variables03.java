package Calculator;

import java.util.Scanner;
public class Variables03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int var1, var2, choice, result = 0;
        System.out.println("===============================");
        System.out.println("Program Calculator Simple");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Pembagian");
        System.out.println("4. Perkalian");
        System.out.println("===============================");

        System.out.println("Masukan Variabel Pertama : ");
        var1 = input.nextInt();
        System.out.println("Masukan Variabel Kedua : ");
        var2 = input.nextInt();

        System.out.println("Masukan Operasi : ");
        choice = input.nextInt();

        switch (choice){
            case 1 : result = var1 + var2;
                break;
            case 2 : result = var1 - var2;
                break;
            case 3 : result = var1 / var2;
                break;
            case 4 : result = var1 * var2;
                break;
            default: System.out.println("Operasi yang anda masukan Salah!");
        }
        System.out.println("Hasil : " + result);
    }
}
