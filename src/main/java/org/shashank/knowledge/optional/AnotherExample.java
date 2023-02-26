package org.shashank.knowledge.optional;

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

    public static boolean priceIsInRange1(Modem modem) {

        return modem != null && modem.getPrice() != null
                && (modem.getPrice() >= 10
                && modem.getPrice() <= 15);
    }

    public static boolean priceIsInRange2(Modem modem) {
        return Optional.ofNullable(modem)
                .map(Modem::getPrice)
                .filter(p -> p >= 10)
                .filter(p-> p <= 15)
                .isPresent();
    }

    public static void main(String[] args) {
        Modem m1 = new Modem(null);
        System.out.println(AnotherExample.priceIsInRange2(m1));
    }

}
