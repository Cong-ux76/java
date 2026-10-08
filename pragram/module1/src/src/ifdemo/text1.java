package src.ifdemo;

import java.util.Scanner;

public class text1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("录入一个数字");
        int money=sc.nextInt();
        if(money>900){
            System.out.println("付款成功");
        }else{
            System.out.println("付款失败");
        }
    }
}

