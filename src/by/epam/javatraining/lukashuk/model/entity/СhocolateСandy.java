package by.epam.javatraining.lukashuk.model.entity;

import java.util.Objects;

public class СhocolateСandy extends Candy {
    private double cocoaAmount;

    public СhocolateСandy() {
    }

    public СhocolateСandy(double calorie, double price, double weight, double sugarAmount, double cocoaAmount) {
        super(calorie, price, weight, sugarAmount);
        this.cocoaAmount = cocoaAmount;
    }

    public double getCocoaAmount() {
        return cocoaAmount;
    }

    public void setCocoaAmount(double cocoaAmount) {
        this.cocoaAmount = cocoaAmount;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", cocoaAmount=" + cocoaAmount;
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
        СhocolateСandy that = (СhocolateСandy) o;
        return Double.compare(that.cocoaAmount, cocoaAmount) == 0;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        return  (int) (prime * super.hashCode() + cocoaAmount);
    }
}
