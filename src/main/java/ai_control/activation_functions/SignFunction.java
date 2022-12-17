package ai_control.activation_functions;

public class SignFunction implements ActivationFunctionInterface{
    @Override
    public double activationFunctionValue(double x) {
        if(x >= 0) return 1;
        else return -1;
    }
}
