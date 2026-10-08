package src.ifdemo;

import java.util.Scanner;

public class text3 {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("请输入一个数子表示成绩");
          int score=sc.nextInt();
          if(score<=80){
               System.out.println("被打");
          }else if(score>80||score<90){
               System.out.println("变形金刚");
          }else if(score>=90||score<95){
               System.out.println("自行车");
          }else if(score>=95||score<101){
               System.out.println("游玩一天");
          }
     }



}