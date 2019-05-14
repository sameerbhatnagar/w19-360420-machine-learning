Report
Computer Science - section 0003
Dahomee Forgues and Julie-Maude Viel

## Distributions of Model Accuracy

 1. We get a different accuracy each time we run the classification model, because in DataSet.java, the lines 148 to 150 refer to the class method "shuffle" from the Collection class. This class takes elements randomly from a given String. Each time we run the code, the data set is cut randomly because we do not work with the full data set and this section of 
data which affects the accuracy.


  2.Performance can be expected to vary a little bit on unseen data each time we run the classification model. Given that the standard deviation is so low, the performance can be said to be not bad.

Mean: 0.9668204790156008
Standard Deviation: 0.00016245688023539516


 3. If the majority of the data says that the breast cancer is benign and we run the classification model assuming that all of the data indicates that the breast cancer is benign, then we will get a maximum accuracy that is equal to the actual number of benign breast cancer. In DataSet.java, line 200 this means that if the frequency of benign is 80%, then we can conclude that we are 80% accurate when we assume that all the data is benign breast cancer.

## Analysis of Different Error Types


  4.False Positive: Receivng a test result which indicates that a particular condition is present when in reality, it is not.
In this case, a False Positive would be receiving the result that the breast cancer is malignant when it is benign.
  False Negative: Receiving a test result that indicates a person does not have a particular condition when the person actually does have it. In this case, a False Negatice would be receiving the result that the breast cancer is benign when it is malignant.


  5.Recall is the fraction of true positives over the total number of positives which is a sum of the false negatives and true positives.   Mean Recall: 0.94437502610804028

  Precision is the fraction of true positives over the number of predicted positives which is a sum of the true positives and false positives.
  Mean Precision: 0.9457183922143265
	
  Recall and Precision are different measures, because they calculate different portions of the data. In general, the ratio of these two measures are usually similar, because the total number of positives is approximately equal to the number of predicted posisitves.
	

 6. The sensible baseline for the precision would be 1. The close the number is to 1 the more precise it is because if the ratio of the baseline and the precision gives a number close to 1, it will mean that it's well predicted. In the case of the recall, the baseline is also 1 because the recall and the precision have similar ratios.	


  7. The hyperparameter k indicates the number of closest neighbors that are used to determine the class of an element. The bigger the k is, the harder it is to figure out the class of the element, because the program will have to consider way more neighbors' classes before making a prediction. This means that the boundaries between the classes will be less evident. k should be odd to avoid tied.


