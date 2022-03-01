package com.company;

public class AttendeeDemo {

    public static void main(String[] args) {
        // write your code here


//        int[] numArray = {0,1,2,3};
//
//        try {
//            System.out.println("Before exception is generated");
//            numArray[7] = 10;
//        } catch(ArrayIndexOutOfBoundsException ex) {
//            System.out.println("Index out-of-bounds!");
//        }
//        System.out.println("After catch statement is executed");
//    }

    AttendeeManager newAttendee = new AttendeeManager();
    try{
        newAttendee.createByID("7654325");
    }
    catch(InvalidIDNumberException ex){
        ex.printStackTrace();
    }
//    finally{
//        System.out.println(idNumber);

    }
    }
