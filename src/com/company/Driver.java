package com.company;

public final class Driver extends person
{
    final int experience;
    final String machine_type;

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

    int way_price (int way_time, int fuel_cost)
    {
        return way_time*fuel_cost;
    }
}
