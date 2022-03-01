package com.company;

public class AttendeeManager {
    public Attendee createByID(String idNumber) throws InvalidIDNumberException {


        if (idNumber.length() == 8)
            return new Attendee(idNumber);
        else
            throw new InvalidIDNumberException("Invalid ID number.");



    }
}
