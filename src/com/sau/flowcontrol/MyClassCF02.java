package com.sau.flowcontrol;

public class MyClassCF02 {
    public static void main(String[] args) {
        //พิสูจน์หลายครั้ง : if-else-if, switch-case
        int score =75;
        if(score > 80){
            System.out.println("Grade A");
        }else if(score >70){
            System.out.println("Grade B");
        }else if(score >60){
            System.out.println("Grade C");
        }else if(score >50){
            System.out.println("Grade D");
        }else{ //ไม่จำเป็นต้องมี if
            System.out.println("Grade F");
        }
        System.out.println("----------------------");
        //switch-case ใช้ได้เฉพาะพิสูจน์เท่ากันหรือไม่เท่านั้น และใช้ไม่ได้กับทศนิยม
        int busNumber = 84;
        switch(busNumber){
            case 80 :
                System.out.println("Go to PATA");
                break;
            case 81 :
                System.out.println("Go to Siriraj");
                break;
            case 84 :
                System.out.println("Go wo Wat rai king");
                break;
            case 123 :
                System.out.println("Ho wo Central Pinklo");
                break;
            default:
                System.out.println("DO not have Data T-T");
        }


      }
}
