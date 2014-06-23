package dev.deadc0de.seshat.multilayer.perceptron;

import java.util.function.BinaryOperator;
import java.util.function.ToDoubleBiFunction;

public interface ErrorFunction extends ToDoubleBiFunction<double[], double[]> {

    BinaryOperator<double[]> gradient();
}
