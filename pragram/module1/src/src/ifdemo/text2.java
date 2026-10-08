package src.ifdemo;

import java.util.Scanner;

public class text2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int ticket=sc.nextInt();
        if(ticket%2==0){
            System.out.println("右边");
        }else{
            System.out.println("左边");
        }
    }

}
