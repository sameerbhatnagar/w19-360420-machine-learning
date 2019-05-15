# Error Analysis in Machine Learning
## Introduction to Computer Programming - Section 3
## David Koranteng & Gasser Khaled

## Distributions of Model Accuracy

## Analysis of different error types

Why do we get a different accuracy each time we run the classification model?

The method is DataSet.java that determines the test set and the training set uses a shuffle method. This results in different data points being chosen as a part of the test and training sets. Each time the program is run, new data points are used in the training sets, and these different data points will cause a variation in accuracy between iterations of the program simply because different points are being used.

How much does performance vary on unseen data?

This variation is relatively insignificant and results in a low standard deviation.
The standard deviation received was 0.00017.

What is a sensible baseline against which we should compare our model's performance?

An effective baseline to compare our model's performance to would be the performance of random selection. If our program is less effective at determining the target class than one would be randomly guessing this target classs, then our program is completely ineffective. 

What is a false positive?

A false positive is a positive, affirming claim that is incorrect. In the breast cancer data set, a false positive would be diagnosing a patient with breast cancer when there, in truth, is no tumour present, or the tumour is benign rather than malignant.

What is a false negative?

A false negative is when there is a claim made about the absense of a certain attribute when in fact the attribute is present. It is a claim that misses the presence of something, whereas a false positive incorrectly claims the presence of something.

What makes the measures of Recall and Precision different?

Recall measures the accuracy of data, simply looking at the relevant data set. It measures the true positives detected as a fraction of the actual amount of true positives. Precision measures the success of the model in terms of true positives versus false positives. This shows the model's success by comparing its successful predicitons as a fraction of all its predicitons, both successful and failed. The average recall observed was 0.956, and the average precision was 0.957. These results are close, showing that the model is effective in both measures. 
