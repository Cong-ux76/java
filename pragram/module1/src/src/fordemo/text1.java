package src.fordemo;

import java.util.Scanner;

public class text1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i= sc.nextInt();
        int j=sc.nextInt();
        for(;i<=j;i++){
            if(i%3==0&&i%5==0){
                System.out.println(i);
            }
        }


    }
}
