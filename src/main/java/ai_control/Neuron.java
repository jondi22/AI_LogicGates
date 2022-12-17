package ai_control;

import ai_control.activation_functions.MultiLayerActivationFunctionInterface;

import java.util.ArrayList;

public class Neuron {
    private MultiLayerActivationFunctionInterface activationFunction;
    private ArrayList<Double> weights = new ArrayList<>();
    private int noOfInputs;
    private double threshold; ///////////////////////////////////////

    public Neuron(MultiLayerActivationFunctionInterface activationFunction, int noOfInputs){
        if(noOfInputs <= 0) throw new IllegalArgumentException("inputs mustn't be zero or less");
        this.noOfInputs = noOfInputs;
        this.activationFunction  = activationFunction;
        double range = 2.4 / noOfInputs;
        for(int i = 0; i < noOfInputs; i++){
            weights.add(Math.random() * (2 * range) - range);
        }
    }
    public void updateValues(double thresholdModification, double ...weightsModifications){
        if(weightsModifications.length != noOfInputs) throw new IllegalArgumentException();
        ArrayList<Double> newWeights  = new ArrayList<>();
        for(int i = 0; i <= noOfInputs; i++){
            double v = weights.get(i);
            v += weightsModifications[i];
            newWeights.add(v);
        }
        this.weights = newWeights;

    }
    public double getOutput(double ...inputs){
        if(inputs.length != noOfInputs) throw new IllegalArgumentException();
        double bigX = 0;
        for(int i = 0; i < noOfInputs; i++){
            bigX += inputs[i] * weights.get(i);
        }
        bigX += threshold;///////////////////////////
        return activationFunction.activationFunctionValue(bigX);
    }

}
