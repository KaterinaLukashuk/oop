package by.epam.javatraining.lukashuk.model.logic;

import by.epam.javatraining.lukashuk.model.entity.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class CandyFinderTest {

    Present present;

    {
        present = new Present();
        present.add(new Snickers(1,1,1,1,1,1));
        present.add(new Snickers(2,2,2,2,2,2));
        present.add(new MilkyWay(3,3,3,3,3,3));
        present.add(new Haribo(4,4,4,4,4,"bears"));
    }

    @Test
    public void searchCandyByCalorieSugar() {
        Candy expected = new Haribo(4,4,4,4,4,"bears");
        assertEquals(expected, CandyFinder.searchCandyByCalorieSugar(present,4,4) );
    }
}