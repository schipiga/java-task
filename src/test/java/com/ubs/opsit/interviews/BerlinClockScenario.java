package com.ubs.opsit.interviews;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Test;

import java.time.LocalTime;

import static com.ubs.opsit.interviews.support.BehaviouralTestEmbedder.aBehaviouralTestRunner;
import static org.assertj.core.api.Assertions.*;

/**
 * Acceptance test class that uses the JBehave (Gherkin) syntax for writing stories.  You need to
 * edit this class to complete the exercise.
 */
public class BerlinClockScenario {

    private Mengenlehreuhr uhr;
    private LocalTime time;
    private String sTime;

    @Test
    public void berlinClockAcceptanceTests() throws Exception {
        aBehaviouralTestRunner()
                .usingStepsFrom(this)
                .withStory("berlin-clock.story")
                .run();
    }

    //TODO - instructions in README.md
    @Given("Berlin Mengenlehreuhr")
    public void givenBerlinMengenlehreuhr() {
        uhr = new Mengenlehreuhr();
    }

    @When("My watches show a [time]")
    public void whenMyWatchesShowAtime(@Named("time") String time) {
        //this.time = LocalTime.parse(time);
        sTime = time;
    }

    @Then("Mengenlehreuhr shows the [picture]")
    public void thenMengenlehreuhrShowsThepicture(@Named("picture") String picture) {
        assertThat(uhr.convertTime(sTime)).isEqualTo(picture);
    }
}
