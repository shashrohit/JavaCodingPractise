package org.shashank.optional;

import java.util.Optional;

class Modem {
    public Double getPrice() {
        return price;
    }

    private Double price;

    public Modem(Double price) {
        this.price = price;
    }
}
public class AnotherExample {

    public boolean priceIsInRange1(Modem modem) {

        return modem != null && modem.getPrice() != null
                && (modem.getPrice() >= 10
                && modem.getPrice() <= 15);
    }

    public boolean priceIsInRange2(Modem modem) {
        return Optional.ofNullable(modem)
                .map(Modem::getPrice)
                .filter(p -> p >= 10)
                .filter(p-> p <= 15)
                .isPresent();
    }

    public static void main(String[] args) {


    }


}
