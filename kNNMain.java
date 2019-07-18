import java.util.List;
import java.io.FileNotFoundException;
import java.util.Arrays;



public class kNNMain{

  public static void main(String... args) throws FileNotFoundException{

    // TASK 1: Use command line arguments to point DataSet.readDataSet method to
    // the desired file. Choose a given DataPoint, and print its features and label

	String pathToData = args[0];
	List<DataPoint> data = DataSet.readDataSet(pathToData);
	
	int firstChoice = (int) (Math.random() * 150);
	int secondChoice = (int) (Math.random() * 150);
	
	DataPoint point1 = data.get(firstChoice);
	DataPoint point2 = data.get(secondChoice);
	
	String printableX1 = Arrays.toString(point1.getX());
	String printableX2 = Arrays.toString(point2.getX());
	
	System.out.println("Data point " + firstChoice);
	System.out.println(point1.getLabel());
	System.out.println(printableX1);
	
	System.out.println(" ");
	
	System.out.println("Data point " + secondChoice);
	System.out.println(point2.getLabel());
	System.out.println(printableX2);

	
	

    // TASK 2:Use the DataSet class to split the fullDataSet into Training and Held Out Test Dataset
	
	List<DataPoint> trainData = DataSet.getTrainingSet(data, 0.8);
	List<DataPoint> testData = DataSet.getTestSet(data, 0.2);
	


    // TASK 3: Use the DataSet class methods to plot the 2D data (binary and multi-class)



    // TASK 4: write a new method in DataSet.java which takes as arguments to DataPoint objects,
    // and returns the Euclidean distance between those two points (as a double)
	
	double distance = DataSet.distanceEuclid(point1, point2);
	System.out.println(" ");
	System.out.println("Distance between " + firstChoice + " and " + secondChoice + ": " + distance);


    // TASK 5: Use the KNNClassifier class to determine the k nearest neighbors to a given DataPoint,
    // and make a print a predicted target label
	
	DataPoint[] nearestNeighbors = new DataPoint[3];
	
	KNNClassifier neighbors = new KNNClassifier(3);
	
	nearestNeighbors = neighbors.getNearestNeighbors(data, point1);
	

	
	String kNNPrintable1 = Arrays.toString(nearestNeighbors[0].getX());
	String kNNPrintable2 = Arrays.toString(nearestNeighbors[1].getX());
	String kNNPrintable3 = Arrays.toString(nearestNeighbors[2].getX());
	
	System.out.println(" ");
	System.out.println("Nearest neighbors of point " + firstChoice + ": " + nearestNeighbors[0].getLabel() + ", " + nearestNeighbors[1].getLabel() + ", " + nearestNeighbors[2].getLabel());


    // TASK 6: loop over the datapoints in the held out test set, and make predictions for Each
    // point based on nearest neighbors in training set. Calculate accuracy of model.
	
	/*for (int i = 0; i < 150; i++)
	{
		
	} 
	*/

  }

  public static double mean(double[] arr){
    /*
    Method that takes as an argument an array of doubles
    Returns: average of the elements of array, as a double
    */
    double sum = 0.0;

    for (double a : arr){
      sum += a;
    }
    return (double)sum/arr.length;
  }

  public static double standardDeviation(double[] arr){
    /*
    Method that takes as an argument an array of doubles
    Returns: standard deviation of the elements of array, as a double
    Dependencies: requires the *mean* method written above
    */
    double avg = mean(arr);
    double sum = 0.0;
    for (double a : arr){
      sum += Math.pow(a-avg,2);
    }
    return (double)sum/arr.length;
  }

}
