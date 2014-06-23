package dev.deadc0de.seshat.multilayer.perceptron;

public class Neuron {

    public final ActivationFunction activationFunction;
    public final double[] synapsesWeights;
    public final double biasWeight;

    public Neuron(ActivationFunction activationFunction, double[] synapsesWeights, double biasWeight) {
        this.activationFunction = activationFunction;
        this.synapsesWeights = synapsesWeights;
        this.biasWeight = biasWeight;
    }
}
