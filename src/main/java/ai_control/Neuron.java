package ai_control;

import ai_control.activation_functions.ActivationFunctionInterface;
import ai_control.activation_functions.MultiLayerActivationFunctionInterface;
import java.util.ArrayList;

public class Neuron {
    private ActivationFunctionInterface activationFunction;
    private ArrayList<Double> weights = new ArrayList<>();
    private int noOfInputs;
    private double threshold;
    private double thresholdWeight;

    public ArrayList<Double> getWeights() {
        return weights;
    }

    public int getNoOfInputs() {
        return noOfInputs;
    }

    public double getThreshold() {
        return threshold;
    }

    public double getThresholdWeight() {
        return thresholdWeight;
    }

    public Neuron(ActivationFunctionInterface activationFunction, int noOfInputs, double threshold){
        if(noOfInputs <= 0) throw new IllegalArgumentException("inputs mustn't be zero or less");
        this.noOfInputs = noOfInputs;
        this.activationFunction  = activationFunction;
        this.threshold = threshold;
        double range = 2.4 / noOfInputs;
        for(int i = 0; i < noOfInputs; i++){
            weights.add(Math.random() * (2 * range) - range);
        }
        thresholdWeight = Math.random() * (2 * range) - range;
    }
    protected void updateValues(double thresholdModification, double ...weightsModifications){
        if(weightsModifications.length != noOfInputs) throw new IllegalArgumentException();
        ArrayList<Double> newWeights  = new ArrayList<>();
        for(int i = 0; i < noOfInputs; i++){
            double v = weights.get(i);
            v += weightsModifications[i];
            newWeights.add(v);
        }
        this.weights = newWeights;

    }
    public double calculateBigX(double ...inputs){
        if(inputs.length != noOfInputs) throw new IllegalArgumentException();
        double bigX = 0;
        for(int i = 0; i < noOfInputs; i++){
            bigX += inputs[i] * weights.get(i);
        }
        bigX += (threshold * thresholdWeight);
        return bigX;
    }
    public double getOutput(double ...inputs){
        double bigX = calculateBigX(inputs);
        return activationFunction.activationFunctionValue(bigX);
    }
    public double getDerivedOutput(double ...inputs){
        double bigX = calculateBigX(inputs);
        return ((MultiLayerActivationFunctionInterface)activationFunction).activationFunctionDerivativeValue(bigX);
    }

}
