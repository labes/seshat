package dev.deadc0de.seshat.multilayer.perceptron;

import java.util.List;

public class MultilayerPerceptron {

    public final int sources;
    public final List<Layer> layers;

    public MultilayerPerceptron(int sources, List<Layer> layers) {
        this.sources = sources;
        this.layers = layers;
    }
}
