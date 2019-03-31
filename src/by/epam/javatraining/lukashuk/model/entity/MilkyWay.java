package by.epam.javatraining.lukashuk.model.entity;

import java.util.Objects;

public class MilkyWay extends СhocolateСandy {
    private double nougatAmount;

    public MilkyWay() {
    }

    public MilkyWay(double calorie, double price, double weight, double sugarAmount, double cocoaAmount, double nougatAmount) {
        super(calorie, price, weight, sugarAmount, cocoaAmount);
        this.nougatAmount = nougatAmount;
    }

    public double getNougatAmount() {
        return nougatAmount;
    }

    public void setNougatAmount(double nougatAmount) {
        this.nougatAmount = nougatAmount;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", nougatAmount=" + nougatAmount;
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
        MilkyWay milkyWay = (MilkyWay) o;
        return Double.compare(milkyWay.nougatAmount, nougatAmount) == 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        return  (int) (prime * super.hashCode() + nougatAmount);
    }
}
