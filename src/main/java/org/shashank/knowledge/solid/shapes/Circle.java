package org.shashank.knowledge.solid.shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@AllArgsConstructor @Getter
public class Circle implements TwoDimensionalShape {
    @NonNull
    int radius;

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
