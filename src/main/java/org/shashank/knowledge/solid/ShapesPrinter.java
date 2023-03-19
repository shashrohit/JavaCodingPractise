package org.shashank.knowledge.solid;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.shashank.knowledge.solid.areacalculator.IAreaCalculator;
import org.shashank.knowledge.solid.shapes.TwoDimensionalShape;

import java.util.List;

@AllArgsConstructor
public class ShapesPrinter {

    @NonNull
    private IAreaCalculator areaCalculator;

//    public String toJson(double sum){
//        return String.format("{sum: %s}", sum);
//    }
//
//    public String toCsv(double sum){
//        return String.format("sum, %s", sum);
//    }

    public String toJson(List<TwoDimensionalShape> shapes){
        return String.format("{sum: %s}", areaCalculator.sum(shapes));
    }

    public String toCsv(List<TwoDimensionalShape> shapes){
        return String.format("sum, %s", areaCalculator.sum(shapes));
    }

}
