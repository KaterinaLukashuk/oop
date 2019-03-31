package by.epam.javatraining.lukashuk.model.logic;

import by.epam.javatraining.lukashuk.model.entity.Candy;
import by.epam.javatraining.lukashuk.model.entity.Present;
import org.apache.log4j.Logger;


public class CandyAnalyst {

    private static final Logger LOGGER;
    static {
        LOGGER = Logger.getRootLogger();
    }


    public static double calculateTotalPrice(Present present)
    {
        LOGGER.debug("calculate presents total price");

        double totalPrice = 0;

        for (Candy candy: present.getCandies())
        {
            totalPrice += candy.getPrice();
        }

        return totalPrice;
    }

    public static double calculateTotalWeight(Present present)
    {
        LOGGER.debug("calculate presents total weight");
        double totalPrice = 0;

        for (Candy candy: present.getCandies())
        {
            totalPrice += candy.getWeight();
        }

        return totalPrice;
    }

    public static Candy getMostExpensive(Present present)
    {
        LOGGER.debug("get the most expensive candy");
        Candy expensiveCandy = present.getCandies().get(0);
        for (Candy candy: present.getCandies())
        {
           if (expensiveCandy.getPrice() < candy.getPrice())
           {
               expensiveCandy = candy;
           }
        }
        return expensiveCandy;
    }

}
