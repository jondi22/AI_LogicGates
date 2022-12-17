package ai_control.activation_functions;

public class TanhFunction implements MultiLayerActivationFunctionInterface{
    @Override
    public double activationFunctionValue(double x) {
        return (2 / (1 + Math.pow(Math.E, -2 * x))) - 1;
    }

    @Override
    public double activationFunctionDerivativeValue(double x) {
        return 1 - Math.pow(activationFunctionValue(x), 2);
    }
}
