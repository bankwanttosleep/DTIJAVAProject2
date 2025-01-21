package com.sau.flowcontrol;

public class MyClassCF01 {
    //Control Flow/Control Statement
    //กลุ่มที่ 1 Selecton/Condition (if, if-else, if-else-if, swtich-case)
    public static void main(String[] args) {
        //พิสูจน์ครั้งเดียวจริงทำ เท็จไม่ทำ : if
        int a = 50;
        if( a > 35 ){
            System.out.println("Hello...");
        }
        System.out.println("--------------------");
        //พิสูจน์ครั้งเดียวจริงทำ เท็จก็ทำ : if-else
        String b = "SAU";
        if(b.equals("SAU")){
            System.out.println("Southease Asia University");
        }else{
            System.out.println("No no no!!!");
        }
        System.out.println("--------------------");

    }
}
