package com.company;

public final class Joiner extends person
{
    final int experience;

    Joiner (String name, int age, int experience)
    {
        super (name, age);
        this.experience = experience;
    }

    void processing (int wood_amount, int processing_speed) throws InterruptedException {
        System.out.println("Joiner is working. Wait please...");
        Thread.sleep(wood_amount/processing_speed * 300);
        System.out.println("Joiner has ended his work. Thank you for waiting. Ask the cleaner to clean joiners workplace,please.");
    }

}
