package by.epam.javatraining.lukashuk.model.logic.comparator;

import by.epam.javatraining.lukashuk.model.entity.Candy;

import java.util.Comparator;

public class ComparatorCandyByCalorie implements Comparator<Candy> {


    @Override
    public int compare(Candy o1, Candy o2) {
        if (o1.getCalorie() == o2.getCalorie())
           return 0;
        if (o1.getCalorie() > o2.getCalorie())
            return 1;
         return -1;

    }
}
