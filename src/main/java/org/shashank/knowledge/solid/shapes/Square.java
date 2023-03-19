package org.shashank.knowledge.solid.shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@AllArgsConstructor @Getter
public class Square implements TwoDimensionalShape {
    @NonNull
    int length;

    @Override
    public double area() {
        return Math.pow(length, 2);
    }
}
