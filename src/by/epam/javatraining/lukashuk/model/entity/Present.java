package by.epam.javatraining.lukashuk.model.entity;

import by.epam.javatraining.lukashuk.model.entity.Candy;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Present {
    private static final Logger LOGGER;
    static {
        LOGGER = Logger.getRootLogger();
    }

    List<Candy> candies;

    public Present() {
        candies = new ArrayList<>();
    }

    public List<Candy> getCandies() {
        return candies;
    }

    public void add(Candy candy)
    {
        LOGGER.debug("candy added");
        candies.add(candy);
    }

    public void setCandies(List<Candy> candies) {
        this.candies = candies;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Candy candy: candies)
        {
            builder.append(candy).append('\n');
        }
        return builder.toString();
    }

}
