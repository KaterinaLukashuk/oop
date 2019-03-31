package by.epam.javatraining.lukashuk.model.entity;

import java.util.Objects;

public class Haribo extends MarmaladeCandy {
    private String form;

    public Haribo() {
    }

    public Haribo(double calorie, double price, double weight, double sugarAmount, double gelatinAmount, String form) {
        super(calorie, price, weight, sugarAmount, gelatinAmount);
        this.form = form;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", form=" + form;
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
        Haribo haribo = (Haribo) o;
        return Objects.equals(form, haribo.form);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        return  (int) (prime * super.hashCode() + form.hashCode());
    }
}
