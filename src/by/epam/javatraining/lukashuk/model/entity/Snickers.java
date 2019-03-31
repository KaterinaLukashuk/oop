package by.epam.javatraining.lukashuk.model.entity;

import java.util.Objects;

public class Snickers extends СhocolateСandy {
    private double nutsAmount;

    public Snickers() {
    }

    public Snickers(double calorie, double price, double weight, double sugarAmount, double cocoaAmount, double nutsAmount) {
        super(calorie, price, weight, sugarAmount, cocoaAmount);
        this.nutsAmount = nutsAmount;
    }

    public double getNutsAmount() {
        return nutsAmount;
    }

    public void setNutsAmount(double nutsAmount) {
        this.nutsAmount = nutsAmount;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", nutsAmount=" + nutsAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Snickers snickers = (Snickers) o;
        return Double.compare(snickers.nutsAmount, nutsAmount) == 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        return  (int) (prime * super.hashCode() + nutsAmount);
    }
}
