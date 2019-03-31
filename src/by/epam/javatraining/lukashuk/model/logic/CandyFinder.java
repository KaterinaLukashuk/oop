package by.epam.javatraining.lukashuk.model.logic;

import by.epam.javatraining.lukashuk.model.entity.Candy;
import by.epam.javatraining.lukashuk.model.entity.Present;
import org.apache.log4j.Logger;

public class CandyFinder {

    private static final Logger LOGGER;
    static {
        LOGGER = Logger.getRootLogger();
    }

    public static Candy searchCandyByCalorieSugar(Present present, double calorie, double sugarAmount)
    {
        LOGGER.debug("search candy by calories and sugar amount");
        for (Candy candy: present.getCandies())
        {
            if (candy.getCalorie() == calorie && candy.getSugarAmount() == sugarAmount)
            {
                return candy;
            }
        }
        return null;
    }
}
