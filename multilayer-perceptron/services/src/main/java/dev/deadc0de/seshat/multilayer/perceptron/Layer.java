package dev.deadc0de.seshat.multilayer.perceptron;

import java.util.List;

public class Layer {

    public final int sources;
    public final List<Neuron> neurons;

    public Layer(int sources, List<Neuron> neurons) {
        this.sources = sources;
        this.neurons = neurons;
    }
}
