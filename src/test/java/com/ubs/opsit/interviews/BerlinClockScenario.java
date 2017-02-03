package com.ubs.opsit.interviews;

import org.junit.Test;

import static com.ubs.opsit.interviews.support.BehaviouralTestEmbedder.aBehaviouralTestRunner;

/**
 * Acceptance test class that uses the JBehave (Gherkin) syntax for writing stories.  You need to
 * edit this class to complete the exercise.
 */
public class BerlinClockScenario {

    @Test
    public void berlinClockAcceptanceTests() throws Exception {
        aBehaviouralTestRunner()
                .usingStepsFrom(this)
                .withStory("berlin-clock.story")
                .run();
    }

    //TODO - instructions in README.md
}
