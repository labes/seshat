package dev.deadc0de.seshat.multilayer.perceptron;

import java.util.stream.Stream;

public interface SupervisedLearningExamplesLoader {

    Stream<SupervisedLearningExample> load();
}
