package com.company;

public class Director extends person
{
    int experience;
    Director (String name, int age, int experience)
    {
        super (name, age);
        this.experience = experience;
    }
    int Corruption_control (int start_money, int final_money)
    {
        if (start_money > final_money)
        {
            System.out.println("Director checked the financial report. This accountant is corrupt official. We must lay him off!");
            return 1;
        }
        else
        {
            System.out.println("Director checked the financial report. It is OK.");
            return 0;
        }
    }
    void Wood_amount_controll(int amount)
    {
        if (amount < 100)
        {
            System.out.println("Sawmill need new supply of wood");
        }
    }


}
