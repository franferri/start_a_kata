**How to run the tests from console**

Jump to the parent folder of the project (not the tests one) and run the following command

    $ cd tothisprojectfolder
    $ python3 -m unittest discover
    
Needs to be run in the parent folder, not inside the tests folder, so it will succeed importing the referenced files

**How to run the tests from the PyCharm**

    * Right click on the tests folders
    * Run 'Unittests in tests' (will fail)
    * Edit run configurations -> Working directory -> Remove the ending /tests
    * Right click on the tests folders
    * Run 'Unittests in tests' (will succeed)

https://docs.python.org/3/library/unittest.html#command-line-interface
