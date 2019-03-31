package by.epam.javatraining.lukashuk.model.entity;

import java.util.Objects;

public class Candy {
    private double calorie;
    private double price;
    private double weight;
    private double sugarAmount;



    public Candy() {
    }

    public Candy(double calorie, double price, double weight, double sugarAmount) {
        this.calorie = calorie;
        this.price = price;
        this.weight = weight;
        this.sugarAmount = sugarAmount;
    }


    public double getCalorie() {
        return calorie;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public double getSugarAmount() {
        return sugarAmount;
    }

    public void setCalorie(double calorie) {
        this.calorie = calorie;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSugarAmount(double sugarAmount) {
        this.sugarAmount = sugarAmount;
    }

    @Override
    public String toString() {
        return
                "calorie=" + calorie +
                        ", price=" + price +
                        ", weight=" + weight +
                        ", sugarAmount=" + sugarAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Candy candy = (Candy) o;
        return Double.compare(candy.calorie, calorie) == 0 &&
                Double.compare(candy.price, price) == 0 &&
                Double.compare(candy.weight, weight) == 0 &&
                Double.compare(candy.sugarAmount, sugarAmount) == 0;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = (int) (prime * result + calorie);
        result = (int) (prime * result + price);
        result = (int) (prime * result + weight);
        result = (int) (prime * result + sugarAmount);
        return result;
    }
}
