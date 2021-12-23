import java.util.Scanner;

public class Main {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
    }

    static public void menu(LinkedList head) {
        System.out.println("1. Insert");
        System.out.prinlln("2. Delete");
        System.out.println("3. Search");
        System.out.println("");

        System.out.print("Pilihan: ");
        int pil=Integer.parseInt(input.nextLine());

        switch(pil) {
            case 1:
                break;

            case 2:
                break;

            default:
                System.out.println("Ada kesalahan dalam memilih silahkan coba lagi");
                menu(head);
        }
    }

    static public void menuSearch(LinkedList head) {
        System.out.println("1. Search Nilai PBO Tertinggi");
        System.out.println("2. Search Nilai PBO Rata-Rata");
    }
}
