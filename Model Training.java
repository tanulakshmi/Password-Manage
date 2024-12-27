import weka.classifiers.Classifier;
import weka.classifiers.functions.Logistic;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Attribute;
import weka.core.FastVector;

import java.io.File;
import java.io.FileReader;

public class PhishingDetector {
    private Classifier classifier;
    private Instances data;

    public PhishingDetector() throws Exception {
        // Load dataset
        data = new Instances(new FileReader("path/to/your/dataset.arff"));
        data.setClassIndex(data.numAttributes() - 1); // Set the last attribute as class

        // Train the model
        classifier = new Logistic();
        classifier.buildClassifier(data);
    }

    public String classify(String url) throws Exception {
        double[] features = URLFeatureExtractor.extractFeatures(url);
        Instance instance = new DenseInstance(1.0, features);
        instance.setDataset(data); // Set the dataset for the instance
        double result = classifier.classifyInstance(instance);
        return data.classAttribute().value((int) result);
    }

    public static void main(String[] args) {
        try {
            PhishingDetector detector = new PhishingDetector();
            String urlToTest = "http://example.com";
            String result = detector.classify(urlToTest);
            System.out.println("The URL is classified as: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
