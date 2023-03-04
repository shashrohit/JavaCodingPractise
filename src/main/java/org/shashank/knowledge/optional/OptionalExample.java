package org.shashank.knowledge.optional;

import java.util.Date;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        Optional<String> name = Optional.of("Shashank");
        System.out.println(name.isPresent());
        System.out.println(name.map(String::toUpperCase).get());

        Optional<Integer> age = Optional.empty();
        int newAge = age.orElse(12);
        System.out.println(newAge);

        Optional<Date> doj = Optional.ofNullable(null);
        Date newDoj = doj.orElseGet(() -> new Date());
        Date newDoj1 = doj.orElseGet(Date::new);
        System.out.println(newDoj);
    }
}
