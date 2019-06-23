### If is your your first time in a Coding Dojo read here

When you attend a Coding Dojo is good to prepare your IDE or prefered environment for writing and running tests.

Let's try to run a simple test in your prefered language before the event.

**If you don't know how to start no worries, I got your back.**

**Language**

Make sure you have your prefered language installed, for this examples I'm covering Java/Kotlin and Python3. Run:
* java -version
* python3 --version, or python --version

**IDE**

Free IDEs for Java
* Eclipse IDE for Java Developers or Eclipse IDE for Enterprise Java Developers: https://www.eclipse.org/downloads/packages/
* IntelliJ Community: https://www.jetbrains.com/idea/download/

Free IDEs for Python
* PyCharm Community: https://www.jetbrains.com/pycharm/download/

**Simple Examples**

Clone or download this very repo, it contains project examples in different languages, ready to enable you to start with a simple example class and unit test.

* Using Git: git clone https://github.com/franferri/your-codingdojos-katas.git
* Direct download: https://github.com/franferri/your-codingdojos-katas/archive/master.zip

**Open the code in your IDE**

If you are using an IDE load the project folder located inside "your-codingdojos-katas" that you just cloned/downloaded.

Java
* In Eclipse use File->Import->Existent Maven Project, then select the folder "your-kata-project-using-java" for example

Java and/or Kotlin
* In IntelliJ, just open the folder: "your-kata-project-using-java" or "your-kata-project-using-kotlin-and-java"

Python
* In PyCharm, just open the folder: "your-kata-project-using-python"

**Run the example tests**
Go to the tests folders of the projects and select run.

### Using a bit the console too

The Java and Kotlin example projects use maven, and maven is build in them, you don't need any maven installed in your computer. You can run the tests with the following commands

    $ cd your-kata-project-using-java
    $ ./mvnw clean test

The Python project is Python 3, to run the tests from the console you just need to:

	$ cd your-kata-project-using-python
	$ python3 

### Creating your first test

![Test in 5 steps](https://github.com/franferri/your-codingdojos-katas/blob/master/images/test_in_5_steps.jpg)

Suggested reading: https://codurance.com/2014/12/13/naming-test-classes-and-methods/

### Follow the rules, use TDD
* You must write a failing test before you write any production code.
* You must not write more of a test than is sufficient to fail, or fail to compile.
* You must not write more production code than is sufficient to make the currently failing test pass.
* You should follow the circle Red - Green - Refactoring:
  * Red - Create a failing test
  * Green - Write enough code to make the test pass
  * Refactor - Clean up your code and your tests (don't forget that your tests are code too)

![Red Green Refactor](https://github.com/franferri/your-codingdojos-katas/blob/master/images/red_green_refactor.jpg)

Suggested reading: http://blog.cleancoder.com/uncle-bob/2014/12/17/TheCyclesOfTDD.html

### And remember, the most important part is to Enjoy!

### If you are trying to organize a Coding Dojo in your company

[Example request for your company](https://github.com/franferri/your-codingdojos-katas/blob/master/Example%20request%20for%20your%20company.md)
