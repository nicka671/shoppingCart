package model;

import static model.constants.Discount.*;

public class Meat extends Food
{
    public Meat (int amount, double price)
    {
        super(amount,price,false);
    }

    @Override
    public double getDiscount()
    {return DISCOUNT_0;}
}
