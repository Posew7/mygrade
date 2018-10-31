package mygrade;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MyGrade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dizi[][] = new int[5][5];
        int dizi2[] = new int[25];
        ArrayList<Integer> list = new ArrayList<Integer>();
        int sayi = 0;

        doldur(dizi);
        bastir(dizi);
        topla(dizi);
        arraydeVarmi(dizi, sayi);
        diziDonus(dizi, list, dizi2);

    }

    public static void bastir(int[][] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void topla(int[][] dizi) {
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                toplam += dizi[i][j];
            }
        }
        System.out.println("toplam değer : " + toplam);
    }

    public static void doldur(int[][] dizi) {
        Random rand = new Random();
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = rand.nextInt(400) + 100;
            }
        }
    }

    public static void arraydeVarmi(int[][] dizi, int sayi) {
        Scanner input = new Scanner(System.in);
        System.out.println("sayıyı giriniz");
        sayi = input.nextInt();
        boolean sonuc = false;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (dizi[i][j] == sayi) {
                    System.out.println("girdiğiniz sayı dizi içerisinde bulunmaktadır");
                    sonuc = true;
                    return;
                }
            }
        }
        if (!sonuc) {
            System.err.println("girdiğiniz sayı dizi içerisinde bulunmamaktadır");
        }

    }

    public static void diziDonus(int[][] dizi1, ArrayList<Integer> list, int[] dizi2) {
        for (int i = 0; i < dizi1.length; i++) {
            for (int j = 0; j < dizi1[i].length; j++) {
                list.add(dizi1[i][j]);

            }
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }

    }
}
