package org.shashank.knowledge.solid.shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@AllArgsConstructor @Getter
public class Cube implements TwoDimensionalShape, ThreeDimensionalShape {
    @NonNull
    int side;
    @Override
    public double area() {
        return Math.pow(side,3);
    }

    @Override
    public double volume() {
        return 0;
    }
}
