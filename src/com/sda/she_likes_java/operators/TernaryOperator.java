package com.sda.she_likes_java.operators;

public class TernaryOperator {
    public static void main(String[] args) {
        System.out.println(getMyName(true));
        System.out.println(getMyName(false));
    }

    public static String getMyName(boolean fullName) {
////      if condition is true, return name and surname, otherwise return name only
        return fullName ? "Ra Pkln" : "Ra";
//        String result=fullName?"Ra Pkln": "Ra";
//        return result;
////        String result2 = null;
//        if(fullName){
//            result2= "long value";
//
//        }else{
//            result2="short";
//        }
        //the same with tenary operator
//        result2 = fullName?: "long  value:"short"

//        if(fullName){
//            return "Ra Pkln";
//        } else{
//            return "Ra";
//        }
    }
}
