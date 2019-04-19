
### If you are trying to organize a Coding Dojo

[Example request for your company](https://github.com/franferri/your-codingdojos-katas/blob/master/Example%20request%20for%20your%20company.md)

### If is your your first time

When you attend a Coding Dojo is good to prepare your IDE or prefered environment for writing and running tests.

Please make sure you can run a simple test in your prefered language before the event.

If you don't know how to start you may want download this repo, it contains 2 java project examples, they are ready to enable you to start with a simple example class and unit test. This 2 projects are the same, but one has maven build in.

#### Clone this repository:
    $ git clone https://github.com/franferri/your-codingdojos-katas.git

If you are using an IDE like IntelliJ or Eclipse load the project "your-codingdojos-katas" in the repo and you are good to go, you can skip to the next section. 

If you like to use a text editor and the console keep reading...

#### Check if you have Java accesible from the cosole running:
    $ java -version

#### If you hava java but don't have maven installed use the example with maven buildin

    $ cd your-kata-project
    $ ./mvnw clean test

Please check that your gear is fine.

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
