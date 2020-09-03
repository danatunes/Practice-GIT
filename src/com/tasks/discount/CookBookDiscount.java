package com.tasks.discount;

public class CookBookDiscount implements Discount{


    @Override
    public String getDisc() {
       String discount;
        return discount="30% between Dec 1 and 24";
    }
}
