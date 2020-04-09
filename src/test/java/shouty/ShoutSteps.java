package shouty;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static java.util.Collections.emptyMap;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class ShoutSteps {
    private static final String ARBITRARY_MESSAGE = "Hello, world";
    private final Shouty shouty = new Shouty();

    @Given("{word} is at {int}, {int}")
    public void actor_is_at(String actor, int xCoord, int yCoord) {
        shouty.setLocation(actor, new Coordinate(xCoord, yCoord));
    }

    @When("{word} shouts")
    public void sean_shouts(String actor) {
        shouty.shout(actor, ARBITRARY_MESSAGE);
    }

    @Then("Lucy should hear Sean")
    public void lucy_should_hear_sean() {
        assertEquals(1, shouty.getShoutsHeardBy("Lucy").size());
    }

    @Then("{word} should hear nothing")
    public void lucy_should_hear_nothing(String actor) {
        assertEquals(emptyMap(), shouty.getShoutsHeardBy(actor));
    }

    @Then("{word} should not hear {word}")
    public void lucyShouldNotHearOscar(String shouter, String listener) {
        assertFalse(shouty.getShoutsHeardBy(listener).containsKey(shouter));
    }
}
