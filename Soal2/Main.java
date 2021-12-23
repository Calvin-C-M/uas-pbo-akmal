/*
 * Nama Project         : Main
 * Nama                 : Calvin Calfi Montolalu
 * NPM                  : 140810200053
 * Kelas                : A
 * Tanggal Buat         : 23/12/2021
 */

import java.util.Scanner;

public class Main {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList head=new LinkedList();
        menu(head);
    }

    static public void menu(LinkedList head) {
        System.out.println("1. Insert");
        System.out.println("2. Delete");
        System.out.println("3. Search");
        System.out.println("4. Print All");
        System.out.println("5. Exit");

        System.out.print("Pilihan: ");
        int pil=Integer.parseInt(input.nextLine());

        switch(pil) {
            case 1:
                head.insertFirst(head.createElement());
                menu(head);
                break;

            case 2:
                head.deleteFirst();
                menu(head);
                break;

            case 3:
                menuSearch(head);
                break;

            case 4:
                head.print();
                break;

            case 5:
                System.exit(0);
                break;

            default:
                System.out.println("Ada kesalahan dalam memilih silahkan coba lagi");
                menu(head);
                break;
        }
    }

    static public void menuSearch(LinkedList head) {
        System.out.println("1. Search Nilai PBO Tertinggi");
        System.out.println("2. Search Nilai PBO Rata-Rata");
        System.out.println("3. Back");
        System.out.print("Pilihan: ");
        int pil=Integer.parseInt(input.nextLine());

        switch(pil) {
            case 1:
                break;

            case 2:
                break;

            case 3: 
                menu(head);
                break;

            default:
                System.out.println("Ada kesalahan dalam memilih silahkan coba lagi");
                menu(head);
                break;
        }
    }
}
