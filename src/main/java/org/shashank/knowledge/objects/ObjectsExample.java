package org.shashank.knowledge.objects;

import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
class ABC{

    public int x;

    @Override
    public String toString() {
        return String.valueOf(x);
    }
}
public class ObjectsExample {

    public static void main(String[] args) {
        ABC abc1 = new ABC(10);
        ABC abc2 = new ABC(20);
        System.out.println(Objects.isNull(abc1));
        System.out.println(Objects.nonNull(abc2));

        ABC abc3 = Objects.requireNonNull(abc1);

        System.out.println(Objects.toString(abc3));
        System.out.println(Objects.equals(abc1, abc2));
    }
}
