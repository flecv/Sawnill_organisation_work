package com.company;

public class Cleaner extends person
{
    int experience;
    Cleaner (String name, int age, int experience)
    {
        super (name, age);
        this.experience = experience;
    }
    void cleaning() throws InterruptedException {
        System.out.println("Cleaner is working, wait please...");
        Thread.sleep(5000);
        System.out.println("Place have cleaned. Thank you for waiting.");
    }
}
