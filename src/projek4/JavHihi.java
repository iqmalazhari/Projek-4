/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek4;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class JavHihi {
    public static void main(String[]args){
        Scanner Anis=new Scanner(System.in);
        //variable
        int bm,bi,sej;
        int purata;
        //input
        System.out.print("Masukkan markah bagi matapelajaran Bahasa Melayu: ");
        bm=Anis.nextInt();
        System.out.print("Masukkan markah bagi matapelajaran Bahasa Inggeris: ");
        bi=Anis.nextInt();
        System.out.print("Masukkan markah bagi matapelajaran Sejarah: ");
        sej=Anis.nextInt();
        //proses
        purata=(bm+bi+sej)/3;
        //output
        System.out.println("===============================");
        if (purata>=89){
            System.out.println("Gred markah anda adalah: A = "+purata);
        }
        else if (purata>=79){
            System.out.println("Gred markah anda adalah: A- = "+purata);
        }
        else if (purata>=69){
            System.out.println("Gred markah anda adalah: B+ = "+purata);
        }
        else if (purata>=59){
            System.out.println("Gred markah anda adalah: B = "+purata);
        }
        else if (purata>=49){
            System.out.println("Gred markah anda adalah: B- = "+purata);
        }
        else if (purata>=39){
            System.out.println("Gred markah anda adalah: C = "+purata);
        }
        else if (purata>=29){
            System.out.println("Gred markah anda adalah: D = "+purata);
        }
        else if (purata>=19){
            System.out.println("Gred markah anda adalah: E = "+purata);
        }
        else {
            System.out.println("Gred markah anda adalah: G = "+purata);
        }
        System.out.println("===============================");
    }
}
//habis