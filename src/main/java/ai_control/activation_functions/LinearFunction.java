package ai_control.activation_functions;

public class LinearFunction implements MultiLayerActivationFunctionInterface{
    @Override
    public double activationFunctionValue(double x) {
        return x;
    }

    @Override
    public double activationFunctionDerivativeValue(double x) {
        return 1;
    }
}
