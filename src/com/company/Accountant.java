package com.company;

public class Accountant extends person
{
    int experience;
    int math_lvl;
    Accountant (String name, int age, int experience, int math_lvl)
    {
        super (name, age);
        this.experience = experience;
        this.math_lvl = math_lvl;
    }
    int money_count(int wood_amount, int cost)
    {
        return wood_amount * cost;
    }
    float corruption(int money_amount, float piece)
    {
        return money_amount*=piece;
    }
}
