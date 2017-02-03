Story: The Berlin Clock

Narrative:
    As a clock enthusiast
    I want to tell the time using the Berlin Clock
    So that I can increase the number of ways that I can read the time

//TODO - write at least a few acceptance tests - instructions in README.md

Given Berlin Mengenlehreuhr
When My watches show a [time]
Then Mengenlehreuhr shows the [picture]

Examples:
|time|picture|
|00:00:00|Y\nOOOO\nOOOO\nOOOOOOOOOOO\nOOOO|
|13:17:01|O\nRROO\nRRRO\nYYROOOOOOOO\nYYOO|
|23:59:59|O\nRRRR\nRRRO\nYYRYYRYYRYY\nYYYY|
|24:00:00|Y\nRRRR\nRRRR\nOOOOOOOOOOO\nOOOO|
