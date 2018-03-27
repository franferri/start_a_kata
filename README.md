
### If you are trying to organize a Coding Dojo

[Example request for your company](https://github.com/franferri/codingdojos-katas/blob/master/Example%20request%20for%20your%20company.md)

### If is your your first time

When you attend a Coding Dojo is good to prepare your IDE or prefered environment for writing and running tests.

If you don't know how to start you may want download from this repo, it contains a base empty maven java project with an example.
Import it in your IDE or from the console, so you can check your gear before we start.
Do this in advance of the event to save time.

Clone this repository:

    $ git clone https://github.com/franferri/codingdojos-katas.git

#### If you have java and maven - run the example
    $ cd start-kata-project
    $ mvn clean test

#### If you hava java but don't have maven installed use the example with maven buildin

    $ cd start-kata-project-builtin-maven
    $ ./mvnw clean test

**Creating your first test**

![Test in 5 steps](https://github.com/franferri/codingdojos-katas/blob/master/images/test_in_5_steps.jpg)

Suggested reading: https://codurance.com/2014/12/13/naming-test-classes-and-methods/

**Follow the rules, use TDD**
* You must write a failing test before you write any production code.
* You must not write more of a test than is sufficient to fail, or fail to compile.
* You must not write more production code than is sufficient to make the currently failing test pass.
* You should follow the circle Red - Green - Refactoring:
  * Red - Create a failing test
  * Green - Write enough code to make the test pass
  * Refactor - Clean up your code and your tests (don't forget that your tests are code too)

![Red Green Refactor](https://github.com/franferri/codingdojos-katas/blob/master/images/red_green_refactor.jpg)

Suggested reading: http://blog.cleancoder.com/uncle-bob/2014/12/17/TheCyclesOfTDD.html

**Enjoy**
