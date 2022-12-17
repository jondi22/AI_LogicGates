package ai_control.activation_functions;

public class ReluFunction implements MultiLayerActivationFunctionInterface{
    @Override
    public double activationFunctionValue(double x) {
        if(x >= 0) return x;
        else return 0;
    }

    @Override
    public double activationFunctionDerivativeValue(double x) {
        if(x >= 0) return 1;
        else return 0;
    }
}
