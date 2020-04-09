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

Using annotation (cucumber.api.java.en.*) in the shouty.ShoutSteps file

#### And how does Cucumber decide which scenarios to run?

All scenarios in the .feature file


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