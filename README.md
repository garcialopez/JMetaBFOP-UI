# JMetaBFOP-UI
 
 
 **JMetaBFOP** was coded in Apache NetBeans IDE 13 using the OpenJDK version 17. A user interface (UI) was also designed. To evaluate a CNOP, the JMetaBFOP UI has modules to perform executions configuration. 
 
 ![mainUI](https://user-images.githubusercontent.com/52833089/235048462-45892bcd-be89-4e10-9ea4-d98587958fc1.png)

- Panel 1: The end user can start or stop the execution of the algorithm, reset values, and view results.
- Panel 2: The progress bar shows the advance of the algorithm execution.
- Panel 3: Selection of a CNOP to optimize or enter a new one. It includes the number of executions.
- Panel 4: TS-MBFOA parameter settings. The end user can keep the default value parameters or enter new values.
- Panel 5: Text area to display quick results resume.
- Panel 6: The end user can visualize the details of the CNOP to optimize.

The interface to visualize the results.

![results](https://user-images.githubusercontent.com/52833089/235048838-ce48df08-83f7-4d1c-9bea-cae1bee69c6f.png)

- Displays the number of independent runs of the algorithm and the execution time in seconds.
- Panel 2: Shows basic statistics of all independent executions: best value, mean, median, standard deviation, worst value, feasibility rate, success rate, and successful performance.
- Panel 3: Indicates the best and worst results underlined in the result table.
- Panel 4: Displays the values used by the algorithm parameters.
- Panel 5: Shows result graphs and allows to export results. It opens a new UI displaying three graphs. The first one is the convergence graph of the median of all independent executions, the second one is the scatter plot of the best values found, and the third graphic is a box plot of the best solution found.

![Graphics](https://user-images.githubusercontent.com/52833089/235049019-1acfd870-95f0-4082-a949-54943b52e479.png)

- Panel 6: Shows a table with the best results of each independent run.
The first columns show the result for each CNOP design variable. The penultimate column shows the value for the objective function. Finally, the last column shows the sum of the constraint violations.
