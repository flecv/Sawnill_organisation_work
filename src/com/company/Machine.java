package com.company;

public class Machine
{
    final int sawing_speed;
    Machine (int sawing_speed)
    {
        this.sawing_speed = sawing_speed;
    }

    void Sawing(int amount, int sawing_speed) throws InterruptedException
    {
        System.out.println("Machine is sawing wood customer request`s. Wait please...");
        Thread.sleep(amount/sawing_speed * 300);
        System.out.println("Machine ends sawing. Joiner can start his work.\n");
    }
}
