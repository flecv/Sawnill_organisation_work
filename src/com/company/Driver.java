package com.company;

public class Driver extends person
{
    int experience;
    String machine_type;
    Driver (String name, int age, int experience, String machine_type)
    {
        super (name, age);
        this.experience = experience;
        this.machine_type = machine_type;
    }
    float way_time (float distance, float speed)
    {

        return distance/speed;
    }
}
