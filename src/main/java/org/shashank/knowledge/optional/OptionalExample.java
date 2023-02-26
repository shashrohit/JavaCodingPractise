package org.shashank.knowledge.optional;

import java.util.Date;
import java.util.Optional;

/*
public final class Optional<T>
Optional is used to handle null pointer exception. This way client will also know what
variables are mandatory and what are not.

Construction -
Returns an empty Optional instance. No value is present for this Optional.
Optional.empty()

Returns an Optional with the specified present non-null value.
Optional.of(value)

Returns an Optional that could be empty or non-null.
Optional.ofNullable(value)

Methods -
T get()
boolean isPresent()
Optional<T> filter(Predicate<? super T> predicate)
Optional<U> map(Function<? super T, ? extends U> mapper)
Optional<U> flatMap(Function<? super T, Optional<U>> mapper)
T orElse(T other)
T orElseGet(Supplier<? extends T> other)
<X extends Throwable> T orElseThrow(Supplier<? extends X> exceptionSupplier)
 */
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
