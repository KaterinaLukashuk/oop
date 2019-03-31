package by.epam.javatraining.lukashuk.model.logic;

import by.epam.javatraining.lukashuk.model.entity.Haribo;
import by.epam.javatraining.lukashuk.model.entity.MilkyWay;
import by.epam.javatraining.lukashuk.model.entity.Present;
import by.epam.javatraining.lukashuk.model.entity.Snickers;
import org.junit.Test;

import static org.junit.Assert.*;

public class CandySorterTest {

    Present present;
    Present sortedPresent;

    {
        present = new Present();
        present.add(new Snickers(4,1,1,1,1,1));
        present.add(new Snickers(2,2,2,2,2,2));
        present.add(new MilkyWay(1,3,3,3,3,3));
        present.add(new Haribo(3,4,4,4,4,"bears"));
        sortedPresent = new Present();
        sortedPresent.add(new MilkyWay(1,3,3,3,3,3));
        sortedPresent.add(new Snickers(2,2,2,2,2,2));
        sortedPresent.add(new Haribo(3,4,4,4,4,"bears"));
        sortedPresent.add(new Snickers(4,1,1,1,1,1));
    }

    @Test
    public void sortPresent() {
       assertArrayEquals(sortedPresent.getCandies().toArray(),
               CandySorter.sortPresentByCalorie(present).getCandies().toArray());
    }
}