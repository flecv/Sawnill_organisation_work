package com.company;

public final class Customer extends person
{
    Customer (String name, int age)
    {
        super (name, age);
    }

    int request(int amount)
    {
        return amount;
    }

}
