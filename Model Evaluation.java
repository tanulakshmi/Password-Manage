import weka.classifiers.Evaluation;

public void evaluateModel() throws Exception {
    Evaluation eval = new Evaluation(data);
    eval.crossValidateModel(classifier, data, 10, new Random(1)); // 10-fold cross-validation
    System.out.println(eval.toSummaryString());
}
