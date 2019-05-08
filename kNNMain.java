import java.util.List;
import java.io.FileNotFoundException;
import java.util.Arrays;



public class kNNMain{

  public static void main(String[] argv) throws FileNotFoundException{

    // TASK 1: Use command line arguments to point DataSet.readDataSet method to
    // the desired file. Choose a given DataPoint, and print its features and label
    String path = argv[0];

    //TASK 2:Use the DataSet class to split the fullDataSet into Training and Held Out Test Dataset
    List<DataPoint> dataset = DataSet.readDataSet(path);
    double fractionTest = 0.2;

    List<DataPoint> testset = Dataset.getTestSet(dataset, fractionTest);
    List<DataPoint> trainset = Dataset.getTrainSet(dataset, 1-fractionTest);

    // TASK 3: Use the DataSet class methods to plot the 2D data (binary and multi-class)
    


    // TASK 4: write a new method in DataSet.java which takes as arguments to DataPoint objects,
    // and returns the Euclidean distance between those two points (as a double)



    // TASK 5: Use the KNNClassifier class to determine the k nearest neighbors to a given DataPoint,
    // and make a print a predicted target label



    // TASK 6: loop over the datapoints in the held out test set, and make predictions for Each
    // point based on nearest neighbors in training set. Calculate accuracy of model.


  }

}
