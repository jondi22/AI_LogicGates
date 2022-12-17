package ai_control;

import activation_functions.ActivationFunctionInterface;

import java.util.ArrayList;

public class Perceptron {
    private int noOfInputs;
    private ArrayList<Double> weights = new ArrayList<>();
    private short threshold;
    private double thresholdWeight;
    private ActivationFunctionInterface activationFunction;
    private int noOfEpochsInLastTrain;

    public Perceptron(ActivationFunctionInterface activationFunction, int noOfInputs, int threshold){
        this.activationFunction = activationFunction;
        if(noOfInputs <= 0) throw new IllegalArgumentException();
        this.threshold = (short)threshold;
        this.noOfInputs = noOfInputs;

        for(int i = 0; i < noOfInputs; i++){
            weights.add(Math.random() - 0.5);
        }
        this.thresholdWeight = Math.random() - 0.5;
    }


    public double getOutput(double ...inputs){
        if(inputs.length != noOfInputs) throw new IllegalArgumentException();
        double bigX = 0;
        for (int i = 0; i < noOfInputs; i++){
            bigX += (inputs[i] * weights.get(i));
        }
        bigX -= (threshold * thresholdWeight);
        return activationFunction.activationFunctionValue(bigX);
    }
    public void train(ArrayList<Double[]> dataSet, double learningRate){
        if(dataSet.size() <= 0) throw new IllegalArgumentException("dataset is empty");
        else if(dataSet.get(0).length != noOfInputs + 1)
            throw new IllegalArgumentException("data doesn't suite the perceptron");

        this.noOfEpochsInLastTrain = 0;
        double [] tempForTrain = new double[noOfInputs];
        double [] tempModifications = new double[noOfInputs];
        while(true && this.noOfEpochsInLastTrain <= 200){
            double SSE = 0;
            System.out.println("Epoch No. " + (this.noOfEpochsInLastTrain + 1));
            for(int i = 0; i < dataSet.size(); i++){
                String stToPrint  = "Initial values are ";
                Double [] dataRow = dataSet.get(i);
                for(int j = 0; j < noOfInputs ; j++){
                    tempForTrain[j] = dataRow[j];
                    stToPrint += tempForTrain[j] + "  ";
                }
                double out = getOutput(tempForTrain);
                System.out.println("output is " + out);
                double error = dataRow[noOfInputs] - out;
                stToPrint += "weights are ";
                for (int j = 0; j < noOfInputs; j++) {
                    stToPrint += weights.get(j) + "  ";
                }
                if(error != 0){
                    stToPrint += "mod in weights are ";
                    for(int j = 0; j < noOfInputs; j++){
                        double modification = learningRate * tempForTrain[j] * error;
                        tempModifications[j] = modification;
                        stToPrint += modification + "  ";
                    }
                    updateValues(tempModifications);
                    thresholdWeight += threshold * learningRate * error;
                    SSE += Math.pow(error, 2);
                }
                System.out.println(stToPrint);
                System.out.println("thres weight " + thresholdWeight);
            }
            this.noOfEpochsInLastTrain++;
            System.out.println(SSE);
            if((SSE / dataSet.size()) <= 0.1) break;
        }


    }
    private void updateValues(double ...modifications){
        if(modifications.length != noOfInputs)
            throw new IllegalArgumentException("Can't suite!!");
        ArrayList<Double> newWeights = new ArrayList<>();
        for(int i = 0; i < noOfInputs; i++){
            double d = weights.get(i);
            d += modifications[i];
            newWeights.add(d);
        }
        this.weights = newWeights;
    }


}
