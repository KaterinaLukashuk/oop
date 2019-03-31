package by.epam.javatraining.lukashuk.model.entity;

import java.util.Objects;

public class MarmaladeCandy extends Candy {
    private double gelatinAmount;

    public MarmaladeCandy() {
    }

    public MarmaladeCandy(double calorie, double price, double weight, double sugarAmount, double gelatinAmount) {
        super(calorie, price, weight, sugarAmount);
        this.gelatinAmount = gelatinAmount;
    }

    public double getGelatinAmount() {
        return gelatinAmount;
    }

    public void setGelatinAmount(double gelatinAmount) {
        this.gelatinAmount = gelatinAmount;
    }

    @Override
    public String toString() {
        return super.toString() + ", gelatinAmount=" + gelatinAmount;
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
        MarmaladeCandy that = (MarmaladeCandy) o;
        return Double.compare(that.gelatinAmount, gelatinAmount) == 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        return  (int) (prime * super.hashCode() + gelatinAmount);
    }
}
