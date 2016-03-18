package rbm.neuron;

import rbm.activation.Activation;

/**
 * Created by Ahmed Hani Ibrahim on 3/18/2016.
 */
public class Neuron {
    private int neuronId;
    private int layerId;
    private NEURON_TYPE neuronType;
    private double input;

    public Neuron(int neuronId, int layerId, NEURON_TYPE neuronType) {
        this.neuronId = neuronId;
        this.layerId = layerId;
        this.neuronType = neuronType;
    }

    public double getActivation(double input, Activation activation) {
        return activation.function(input);
    }

    public int getNeuronId() {
        return neuronId;
    }

    public void setNeuronId(int neuronId) {
        this.neuronId = neuronId;
    }

    public int getLayerId() {
        return layerId;
    }

    public void setLayerId(int layerId) {
        this.layerId = layerId;
    }

    public NEURON_TYPE getNeuronType() {
        return neuronType;
    }

    public void setNeuronType(NEURON_TYPE neuronType) {
        this.neuronType = neuronType;
    }

    public double getInput() {
        return input;
    }

    public void setInput(double input) {
        this.input = input;
    }
}
