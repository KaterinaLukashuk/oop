package by.epam.javatraining.lukashuk.controller;

import by.epam.javatraining.lukashuk.model.entity.*;
import by.epam.javatraining.lukashuk.model.logic.CandyAnalyst;
import by.epam.javatraining.lukashuk.model.logic.CandySorter;
import by.epam.javatraining.lukashuk.view.Output;

import org.apache.log4j.Logger;
public class Main {
    private static final Logger LOGGER;
    static {
      LOGGER = Logger.getRootLogger();
    }

    public static void main (String [] args)
    {
        LOGGER.debug("start");
        Snickers snickers = new Snickers(1,2,3,4,5,6);
        MilkyWay milkyWay = new MilkyWay(3,4,3,3,3,3);
        Haribo hariboBears = new Haribo(2,3,4,4,4,"bears");
        Haribo hariboSnakes = new Haribo(4,1,4,4,4,"snakes");
        Present present = new Present();
        present.add(snickers);
        present.add(milkyWay);
        present.add(hariboBears);
        present.add(hariboSnakes);
        Output output = new Output();

        CandyAnalyst candyPicker = new CandyAnalyst();
        output.print(present.toString() + " "
                + candyPicker.calculateTotalPrice(present) + " "
                + candyPicker.calculateTotalWeight(present) );
        output.print(candyPicker.getMostExpensive(present).toString());

        output.print(CandySorter.sortPresentByCalorie(present).toString());
    }
}
