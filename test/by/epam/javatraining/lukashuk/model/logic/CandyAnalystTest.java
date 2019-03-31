package by.epam.javatraining.lukashuk.model.logic;

import by.epam.javatraining.lukashuk.model.entity.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class CandyAnalystTest {

    Present present;

    {
        present = new Present();
        present.add(new Snickers(1,1,1,1,1,1));
        present.add(new Snickers(2,2,2,2,2,2));
        present.add(new MilkyWay(3,3,3,3,3,3));
        present.add(new Haribo(4,4,4,4,4,"bears"));
    }


    @Test
    public void calculateTotalPrice() {
        double  expected = 10;
        assertEquals(expected, CandyAnalyst.calculateTotalPrice(present) ,0.01);
    }

    @Test
    public void calculateTotalWeight() {
        double  expected = 10;
        assertEquals(expected, CandyAnalyst.calculateTotalWeight(present) ,0.01);
    }

    @Test
    public void getMostExpensive() {
        Candy expected = new Haribo(4,4,4,4,4,"bears");
        assertEquals(expected, CandyAnalyst.getMostExpensive(present) );
    }
}