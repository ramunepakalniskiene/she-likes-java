package com.sda.she_likes_java.static_modifier;

public class WashMachineFactory {
    public static void main(String[] args) {
        System.out.println("Current number of produced machines is: " + WashMachine.getNumberOfCreatedMachines());

        System.out.println("=======================================================");
        WashMachine samsung= new WashMachine("Samsung", "1x2");
        System.out.println("Samsung info: " + samsung);
        System.out.println("Current quantity of made washmachines is:" + WashMachine.getNumberOfCreatedMachines());
        System.out.println("Samsung serial number is: " + samsung.getSerialNumber());
//        samsung.setSerialNumber(5);
        System.out.println("Samsung serial number is: " + samsung.getSerialNumber());
        //Do not use instance reference to access static members(fields/methods);
        samsung.setNumberOfCreatedMachines(1000);
        //samsung=new WashMachine("Samsung2", "SS");
        //System.out.println("Samsung2 serial number is: " + samsung.getSerialNumber());
        System.out.println("=========================================================");

        WashMachine miele =new WashMachine("Miele", "ML023");
        System.out.println("Miele info: " + miele);
        System.out.println("Current quantity of made washmachines is:" + WashMachine.getNumberOfCreatedMachines());
        System.out.println("Miele serial number is: " + miele.getSerialNumber());
//        miele.setSerialNumber(4);
        System.out.println("Miele serial number is: " + miele.getSerialNumber());
        System.out.println("=========================================================");

        WashMachine lg =new WashMachine("LG", "00000");
        System.out.println("LG info: " + lg);
        System.out.println("Current quantity of made washmachines is:" + WashMachine.getNumberOfCreatedMachines());
        System.out.println("Miele serial number is: " + lg.getSerialNumber());
        System.out.println("=========================================================");


        for(int i=0;i<10; i++){
        makeSomeWashMachines();
        }
        System.out.println("Hey, we have totally produced: " + WashMachine.getNumberOfCreatedMachines());
        // some generic way to obtain number of produced machines


    }
    public static void makeSomeWashMachines(){
        new WashMachine("LG", "1111000");
        new WashMachine("LG", "1111111");
        new WashMachine("LG", "1111222");
        new WashMachine("LG", "1111333");
        new WashMachine("LG", "1111444");
        new WashMachine("LG", "1111555");


    }


}
