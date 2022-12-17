package ai_control;


import ai_control.activation_functions.ActivationFunctionInterface;
import ai_control.activation_functions.MultiLayerActivationFunctionInterface;

import java.util.ArrayList;

public class Network2Input1Hidden {
    private Neuron outputNeuron;
    private Neuron [] hidden = new Neuron[2];
    private int noOfEpochsInLastTrain;

    public Network2Input1Hidden(MultiLayerActivationFunctionInterface hiddenLayerActivFunction,
                                ActivationFunctionInterface outputActivationFunction, int hiddenThresh, int outThresh){
        outputNeuron = new Neuron(outputActivationFunction, 2, outThresh);
        for (int i = 0; i < 2; i++) {
            hidden[i] = new Neuron(hiddenLayerActivFunction, 2, hiddenThresh);
        }
    }
    public void train(ArrayList<Double[]> dataSet, double learningRate){
        if(dataSet.size() <= 0) throw new IllegalArgumentException("dataset is empty");
        else if(dataSet.get(0).length != 3)
            throw new IllegalArgumentException("data doesn't suite the perceptron");

        this.noOfEpochsInLastTrain = 0;
        double [] tempForTrain = new double[2];
        double [] tempModifications = new double[2];
        while(true){
            double SSE = 0;
            System.out.println("Epoch No. " + (this.noOfEpochsInLastTrain + 1));
            for(int i = 0; i < dataSet.size(); i++){
                Double [] dataRow = dataSet.get(i);
                for(int j = 0; j < 2 ; j++){
                    tempForTrain[j] = dataRow[j];
                }
                double [] out = new double[2];
                double [] outDerivative = new double[2];
                for (int j = 0; j < 2; j++) {
                    out[j] = hidden[j].getOutput(tempForTrain);
                    outDerivative[j] = hidden[j].getDerivedOutput(tempForTrain);
                }
                double finalOut = outputNeuron.getOutput(out);
                double error = dataRow[2] - finalOut;
                if(error != 0) {

                    double[] outWeightModifications = new double[2];

                    for (int j = 0; j < 2; j++) {
                        outWeightModifications[j] = learningRate * out[j] * error;
                    }

                    double outThreshUpdate = learningRate * outputNeuron.getThreshold();
                    double[][] nodeModifications = new double[2][2];
                    double[] threshModifications = new double[2];
                    for (int j = 0; j < 2; j++) {
                        for (int k = 0; k < 2; k++) {
                            nodeModifications[j][k] = learningRate * tempForTrain[k] *
                                    (outDerivative[j] * outputNeuron.getWeights().get(j));
                        }
                        threshModifications[j] = learningRate * hidden[j].getThreshold() *
                                (outDerivative[j] * outputNeuron.getWeights().get(j));
                    }
                    for (int j = 0; j < 2; j++) {
                        hidden[i].updateValues(threshModifications[j], nodeModifications[j]);
                    }
                    outputNeuron.updateValues(outThreshUpdate, outWeightModifications);
                }


            }
            this.noOfEpochsInLastTrain++;
            System.out.println(SSE);
            if((SSE / dataSet.size()) <= 0.1) break;
        }


    }

    public double getOutput(double ...inputs){
        if(inputs.length != 2) throw new IllegalArgumentException();
        double [] out = new double[2];
        for (int j = 0; j < 2; j++) {
            out[j] = hidden[j].getOutput(inputs);
        }
        return outputNeuron.getOutput(out);
    }
}
