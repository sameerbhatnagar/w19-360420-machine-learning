# Title
## Course - Section
## Authors
# Machine Learning Report: Error Analysis
## Introduction to Computer Programming in Engineering and Science 360-420-DW - 00003
## Jordana Marciano

## Distributions of Model Accuracy

## Analysis of different error types

-the amount of confidence we can put in our model

Each time you run the classification model, you should be getting a different accuracy. Why? (hint: lines 148-150 in DataSet.java)
Each time we run the classification model, we should be getting a different accuracy because on lines 148-150 in DataSet.java,  Collections.shuffle(fullDataSet) is shuffling the elements in the list of data points which randomizes the data. Therefore, the full data set used is no longer the same and the exact accuracy that is printed will also no longer be the same.

After the entire classification process is run 1000 times the mean accuracy is 96.52% and the standardDeviation is 1.06 which allows us to calculate how much performance can be expected to vary on unseen data.

What is a sensible baseline against which we should compare our model's performance? (hint: line 200 in DataSet.java)
A sensible baseline against which we should compare our model's performance is 65% since we assumed that everything started as benign and the actual data distribution is 65% benign and 35% malignant.

-the types of errors that our classifier makes

What is a

False Positive?
A false positive is when you receive a test result that is positive (malignant) but in reality the result is negative (benign).

False Negative?
A false negative is when you receive a test result that is negative but in reality the result is positive.

Extend your analysis in the previous step (with the 1000 runs) to keep track of Recall and Precision as well.

What makes these two measures different?
The difference between the Recall measure and the Precision measure is that Recall is a measure of completeness or quantity where an algorithm returns most of the relevant results. It is the number of true positives divided by the value of total actual positive data points (true positives and false negatives). However, Precision is a measure of exactness or quality where an algorithm returns more relevant results rather than irrelevant results. It is the the number of true positives divided by the total number of predicted positive values (true positives and false positives). Therefore, Recall and Precision differ because Recall is the measure of all the results that are correctly classified whereas Precision is a measure of the results which are relevant.

What are sensible baseline for each of these measures?
A sensible baseline for each of these measures would be to maximize the Recall so to assume that every tumor is malignant which would make the Precision 35% and the Recall 100% while assuming all tumors to be benign which makes both of the values 0 which is not ideal.

How do the above results change with the hyperparameter k?
The above results change with the hyper parameter k because k is the number of closest neighbors that are used to determine the class of a data point. Therefore, the larger the k value the harder it is to find the nearest class since the computer has to search through more neighbors until it can make a label prediction. In addition, the hyperparameter k should not be an even number in order to avoid ties for the closest neighbor.
