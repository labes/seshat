package dev.deadc0de.seshat.multilayer.perceptron;

import java.util.function.DoubleUnaryOperator;

public interface ActivationFunction extends DoubleUnaryOperator {

    DoubleUnaryOperator gradient();
}
