package com.company;

public final class Woodnum_control extends person
{
    int experience;

    Woodnum_control (String name, int age, int experience)
    {
        super(name, age);
        this.experience = experience;
    }

    int control (int wood_amount, int order)
    {
        if ((wood_amount - order) < (wood_amount/10))
        {
            System.out.println("We can not sell you this amount of wood");
            return 0;
        }     else
            {
                System.out.println("We can sell you this amount of wood");
                return 1;
            }
    }

}
