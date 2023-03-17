package com.kodilla.abstracts.homework;

public class Doctor extends Job {
    public Doctor() {
        super(8000, "doctor");
    }

    @Override
    public void giveResp() {
        System.out.println("Doctor treats people");
    }
}
