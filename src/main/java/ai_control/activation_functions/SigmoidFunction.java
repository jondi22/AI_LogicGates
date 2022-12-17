package ai_control.activation_functions;

public class SigmoidFunction implements MultiLayerActivationFunctionInterface {

    @Override
    public double activationFunctionValue(double x) {
        return 1 / (1 + Math.pow(Math.E, -x));
    }

    @Override
    public double activationFunctionDerivativeValue(double x) {
        double y = activationFunctionValue(x);
        return y * (1 - y);
    }
}
