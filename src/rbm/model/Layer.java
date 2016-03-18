package rbm.model;

import rbm.neuron.Neuron;

/**
 * Created by Ahmed Hani Ibrahim on 3/18/2016.
 */
public class Layer {
    private LAYER_TYPE layerType;
    private int numberOfNeurons;
    private Neuron[] neurons;
    private double[][] weights;

    public Layer(LAYER_TYPE layerType, int numberOfNeurons) {
        this.layerType = layerType;
        this.numberOfNeurons = numberOfNeurons;
        this.neurons = new Neuron[numberOfNeurons];
    }

    private LAYER_TYPE checkLayerType(LAYER_TYPE layerType) {
        if (layerType.equals(LAYER_TYPE.VISIBLE)) {
            return LAYER_TYPE.VISIBLE;
        } else {
            return LAYER_TYPE.HIDDEN;
        }
    }

    public LAYER_TYPE getLayerType() {
        return layerType;
    }

    public void setLayerType(LAYER_TYPE layerType) {
        this.layerType = layerType;
    }

    public int getNumberOfNeurons() {
        return numberOfNeurons;
    }

    public void setNumberOfNeurons(int numberOfNeurons) {
        this.numberOfNeurons = numberOfNeurons;
    }

    public Neuron[] getNeurons() {
        return neurons;
    }

    public void setNeurons(Neuron[] neurons) {
        this.neurons = neurons;
    }

    public double[][] getWeights() {
        return weights;
    }

    public void setWeights(double[][] weights) {
        this.weights = weights;
    }
}
