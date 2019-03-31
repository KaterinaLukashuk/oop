package by.epam.javatraining.lukashuk.model.logic;

import by.epam.javatraining.lukashuk.model.entity.Candy;
import by.epam.javatraining.lukashuk.model.entity.Present;
import by.epam.javatraining.lukashuk.model.logic.comparator.ComparatorCandyByCalorie;
import org.apache.log4j.Logger;

import java.util.List;

public class CandySorter {
    private static final Logger LOGGER;
    static {
        LOGGER = Logger.getRootLogger();
    }
    public static Present sortPresentByCalorie(Present present)
    {
        LOGGER.debug("sort candy by calories");
        List<Candy> candies = present.getCandies();
        candies.sort(new ComparatorCandyByCalorie());
        present.setCandies(candies);
        return  present;
    }

}
