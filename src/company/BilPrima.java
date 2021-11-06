package company;

import java.util.Scanner;

public class BilPrima {
    public static void main(String[] args) {
        int temp;
        boolean bil_Prima = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Angka /  Bilangan : ");

        //input
        int num = scan.nextInt();
        for (int i=2; i<num/2; i++) {
            temp=num%i;
            if (temp ==0) {
                bil_Prima = false;
                break;
            }
        }

        //Menentukan Bilangan prima atau tidak
        if (bil_Prima)
            System.out.println(num + " adalah bilangan prima");
        else
            System.out.println(num + " bukan bilangan prima");
    }
}
