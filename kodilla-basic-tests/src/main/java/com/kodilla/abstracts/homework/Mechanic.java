package com.kodilla.abstracts.homework;

public class Mechanic extends Job {
    public Mechanic() {
        super(4000, "mechanic");
    }

    @Override
    public void giveResp() {
        System.out.println("Mechanic fixes equipment");
    }
}
