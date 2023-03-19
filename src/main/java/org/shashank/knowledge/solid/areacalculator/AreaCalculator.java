package org.shashank.knowledge.solid.areacalculator;

import org.shashank.knowledge.solid.shapes.TwoDimensionalShape;
import java.util.List;

public class AreaCalculator implements IAreaCalculator {
    /*
        S -> we should not add methods to convert sum to csv, json
        in this class.

        O -> If we add more shape eg. Cube, we will have to modify areaCalculator
        instead we can create Shape interface with area method

        L -> Imagine below -
        public class NoShape implements Shape{
            public double ares(){ throw new IllegalSTateException("Can't calculate area);}
        }
        Above is not satisfying parent's contract.

        I -> If we add method volume() in Shape interface, Circle and Rectangle cannot implement
        it. We should alternatively create a ThreeDShape interface.

        D -> If we add AreCalculator field in ShapesPrinter class as -
        AreaCalculator areaCalculator = new AreaCalculator();
        Above depends on concrete implementation of AreaCalculator.
        Instead -
        private IAreaCalculator areaCalculator; and @AllArgsConstructor


     */
//    public int sum(List<Object> shapes){
//        int sum = 0;
//        for(Object shape: shapes){
//            if(shape instanceof Circle)
//                sum += Math.PI * Math.pow(((Circle) shape).getRadius(), 2);
//            if(shape instanceof Square)
//                sum += Math.pow(((Square)shape).getLength(), 2);
//        }
//        return sum;
//    }

    @Override
    public double sum(List<TwoDimensionalShape> twoDimensionalShapes){
        return twoDimensionalShapes.stream().map(TwoDimensionalShape::area).mapToDouble(a -> a).sum();
    }
}
