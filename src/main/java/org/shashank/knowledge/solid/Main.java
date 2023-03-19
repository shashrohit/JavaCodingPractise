package org.shashank.knowledge.solid;

import org.shashank.knowledge.solid.areacalculator.AreaCalculator;
import org.shashank.knowledge.solid.areacalculator.IAreaCalculator;
import org.shashank.knowledge.solid.shapes.Circle;
import org.shashank.knowledge.solid.shapes.TwoDimensionalShape;
import org.shashank.knowledge.solid.shapes.Square;

import java.util.List;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        Square square1 = new Square(20);
        List<TwoDimensionalShape> twoDimensionalShapes = Arrays.asList(square1,circle1);

        IAreaCalculator areaCalculator = new AreaCalculator();
        ShapesPrinter shapesPrinter = new ShapesPrinter(areaCalculator);
        System.out.println(shapesPrinter.toJson(twoDimensionalShapes));
        System.out.println(shapesPrinter.toCsv(twoDimensionalShapes));
    }
}
