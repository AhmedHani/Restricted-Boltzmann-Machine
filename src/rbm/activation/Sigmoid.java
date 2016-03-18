package rbm.activation;

/**
 * Created by Ahmed Hani Ibrahim on 3/18/2016.
 */
public class Sigmoid extends Activation {

    @Override
    public double function(double input) {
        return (1 / (1 + Math.exp(-input)));
    }
}
