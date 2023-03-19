package org.shashank.knowledge.solid.areacalculator;

import org.shashank.knowledge.solid.shapes.TwoDimensionalShape;

import java.util.List;

public interface IAreaCalculator {
    double sum(List<TwoDimensionalShape> twoDimensionalShapes);
}
