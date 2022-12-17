package ai_control.activation_functions;

public class StepFunction implements ActivationFunctionInterface{
    @Override
    public double activationFunctionValue(double x) {
        if(x >= 0) return 1;
        else return 0;
    }
}
