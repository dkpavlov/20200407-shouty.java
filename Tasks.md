Day 3

## Page 1

Your App
shouty.Coordinate
shouty.Shouty

Steps definition:
shouty.ShoutSteps

Feature:
hear_shout.feature

Programer tests:
shouty.CoordinateTest

#### Are there any files whose reason for existing is not clear? Which ones:

cucumber.xml
shouty.ShoutyTypes


#### The feature file contains scenarios made up of steps. Each step causes Cucumber to look for a Java step definition to run. How does Cucumber decide which step definition to run for each step?

Using annotation (cucumber.api.java.en.*) in the shouty.ShoutSteps file; based on the text (name) of the step

#### And how does Cucumber decide which scenarios to run?

All scenarios in the .feature file; Based on the scenario key word


## Page 2

### The name of a passing scenario is:
- Hear Shout.In range shout is heard

### The name of a failing scenario is:
- Hear Shout.Out of range shout is not heard

### The name of a passing programmer test is:
- it_calculates_the_distance_from_itself

### The name of a failing programmer test is:
- it_calculates_the_distance_from_another_coordinate_along_x_axis

### How would you explain to your product owner what is wrong with Shouty, from what you see in the test results?
- Shouty distance/range is not calculated correctly 

##Page 3

#### Does the code you have just uncommented look like a complete solution?
No, it calculates only x coordinate.

#### Which programmer test(s) are failing? Which scenario(s) are failing?
Programmer tests were both passing, Scenario Hear Shout.Out of range shout is not heard was failing.

#### Where are we now? What do we need to do next?
The programmer changes just enough code to make the test pass. We need to Refactor and clean up code.

##Page 4
