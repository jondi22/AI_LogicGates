package ai_control;

import ai_control.activation_functions.StepFunction;

public class Tester {


    public static void main(String [] args){
        Perceptron perceptron = new Perceptron(new StepFunction(), 2, -1);
        perceptron.train(DataSets.OR_DATA, 0.1);
        System.out.println(perceptron.getOutput(0, 0));
        System.out.println(perceptron.getOutput(0, 1));
        System.out.println(perceptron.getOutput(1, 0));
        System.out.println(perceptron.getOutput(1, 1));
    }
}
