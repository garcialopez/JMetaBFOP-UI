# **Introducing JMetaBFOP-UI**

JMetaBFOP-UI is a powerful graphical user interface designed to assist users in adjusting parameters and solving Constrained Numerical Optimization Problems (CNOP). With its intuitive interface and advanced functionality, JMetaBFOP-UI provides a convenient way to work with CNOPs and achieve optimal solutions.

# Download and Installation of JMetaBFOP-UI
Follow the steps below to download and install JMetaBFOP-UI on your system:

1. Access the GitHub repository of JMetaBFOP-UI: [JMetaBFOP-UI Repository](https://github.com/garcialopez/JMetaBFOP-UI/releases).
2. In the JMetaBFOP-UI repository, go to the "releases" section and download the latest version of JMetaBFOP-UI in ZIP format.
3. Unzip the downloaded ZIP file to a location of your choice.

## Configuration and Dependencies

Before running JMetaBFOP-UI, make sure you have all the necessary dependencies in place. Inside the extracted folder, you will find a folder called "lib" that contains the required libraries, including "MathParser.org-mXparser.jar" and "JMetaBFOP_v1.0.1.jar".

Additionally, the following dependencies are also required: jcommon-1.0.23.jar, jfreechart-1.5.3.jar, and opencsv-5.7.1.jar.

Furthermore, JMetaBFOP-UI requires Java Runtime Environment (JRE) to run.

## Running JMetaBFOP-UI

Once you have completed the download and configuration, you can execute JMetaBFOP-UI. Here are two options depending on your Java distribution:

- If you have Oracle JRE or Oracle JDK installed, simply double-click the "JMetaBFOP_UI.jar" file located in the extracted folder. The application should start.

- If you have the OpenJDK distribution of Java, you will find a file called "JMetaBFOP_UI.cmd". Double-click that file to run JMetaBFOP-UI on your Windows system.

## Exploring JMetaBFOP-UI

Once JMetaBFOP-UI starts successfully, you can start exploring its functions and features:

1. Use the graphical interface to adjust parameters and solve custom CNOP problems according to the needs of the end user.
2. Explore the available options to visualize graphs, statistics, and tables, which allow you to conveniently analyze the results.
3. Take advantage of the provided help texts to guide users in using the application and gain a better understanding of the concepts and procedures involved in solving CNOP problems. Additionally, you can insert a custom CNOP problem as long as it adheres to the established CNOP model.

Remember, the "JMetaBFOP_v1.0.1.jar" file in the "lib" folder is an essential part of JMetaBFOP-UI and provides the core functionality of the framework. Without this file, JMetaBFOP-UI will not function properly. Make sure you have all the necessary dependencies and the "JMetaBFOP_v1.0.1.jar" file in the correct location to ensure the application works correctly.

### **Obtaining JMetaBFOP Independently (this step is for informational purposes)**
   - To obtain "JMetaBFOP_v1.0.1.jar" independently, you can access the corresponding GitHub repository: [https://github.com/garcialopez/JMetaBFOP](https://github.com/garcialopez/JMetaBFOP)
   - In the JMetaBFOP repository, go to the "releases" section and download version 1.0.1 of "JMetaBFOP.jar". This JAR file is essential for the proper functioning of JMetaBFOP-UI.

# **That's it**

! You have successfully downloaded and installed JMetaBFOP-UI on your system. You can now start using the application to work with CNOP problems and explore all the features it offers.

I hope this information is helpful to you. Enjoy JMetaBFOP-UI and its ability to efficiently solve CNOP problems!

# **Let's get to know JMetaBFOP-UI.**

![MainUI](https://github.com/garcialopez/JMetaBFOP-UI/assets/52833089/82e72c96-f07c-46e0-aab1-bdc66b1b4987)

- The end user can start or stop the execution of the algorithm and view results.
- The progress bar shows the advance of the algorithm execution.
- Selection of a CNOP to optimize or enter a new one. 

![Input](https://github.com/garcialopez/JMetaBFOP-UI/assets/52833089/24cbb1e0-4edd-4b3c-97ba-21631aa86e67)

- It includes the number of executions.
- TS-MBFOA parameter settings. The end user can keep the default value parameters or enter new values.
- Text area to display quick results resume.
- The end user can visualize the details of the CNOP to optimize.

## The interface to visualize the results.

![Result](https://github.com/garcialopez/JMetaBFOP-UI/assets/52833089/26f3e054-1d47-43f4-b02b-8f4a29acf58a)

- Displays the number of independent runs of the algorithm and the execution time in seconds.
- Shows basic statistics of all independent executions: best value, mean, median, standard deviation, worst value, feasibility rate, success rate, and successful performance.
- Indicates the best and worst results underlined in the result table.
- Displays the values used by the algorithm parameters.
- Shows result graphs and allows to export results. It opens a new UI displaying three graphs. The first one is the convergence graph of the median of all independent executions, the second one is the scatter plot of the best values found, and the third graphic is a box plot of the best solution found.

![Graf](https://github.com/garcialopez/JMetaBFOP-UI/assets/52833089/5694b232-fb1c-439d-aa5d-2e3ce4555d25)

- Shows a table with the best results of each independent run.
The first columns show the result for each CNOP design variable. The penultimate column shows the value for the objective function. Finally, the last column shows the sum of the constraint violations.

## **Key Features of JMetaBFOP-UI:**

1. **User-Friendly Interface**: JMetaBFOP-UI offers a user-friendly interface that allows users to easily navigate through the application and perform various tasks.

2. **Parameter Adjustment**: Users can adjust the parameters of their CNOPs using the provided tools and controls. This flexibility enables fine-tuning and optimization of the problem-solving process.

3. **CNOP Resolution**: JMetaBFOP-UI utilizes the powerful JMetaBFOP framework to solve CNOPs. This framework is specifically designed to handle complex optimization problems and deliver accurate results.

4. **Graphical Representation**: JMetaBFOP-UI provides graphical representations of the CNOPs, allowing users to visualize the problem and its solution. This visual feedback enhances the understanding of the optimization process.

5. **Statistical Analysis**: Users can analyze the results of their CNOP resolutions through statistical data presented in graphs, charts, and tables. This analysis aids in interpreting the performance and effectiveness of the optimization process.

With JMetaBFOP-UI, users can tackle CNOPs effectively, explore different optimization scenarios, and achieve optimal solutions tailored to their specific needs.

Let's dive into JMetaBFOP-UI and unlock the potential of Constrained Numerical Optimization!
