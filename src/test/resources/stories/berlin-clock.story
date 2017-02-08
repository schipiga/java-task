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
|23:59:59|O\nRRRR\nRRRO\nYYRYYRYYRYY\nYYYY|
|23:59:60|Y\nRRRR\nRRRO\nYYRYYRYYRYY\nYYYY|
|05:00:00|Y\nROOO\nOOOO\nOOOOOOOOOOO\nOOOO|
|20:00:00|Y\nRRRR\nOOOO\nOOOOOOOOOOO\nOOOO|
|03:00:00|Y\nOOOO\nRRRO\nOOOOOOOOOOO\nOOOO|
|04:00:00|Y\nOOOO\nRRRR\nOOOOOOOOOOO\nOOOO|
|00:30:00|Y\nOOOO\nOOOO\nYYRYYROOOOO\nOOOO|
|23:55:01|O\nRRRR\nRRRO\nYYRYYRYYRYY\nOOOO|
|00:01:00|Y\nOOOO\nOOOO\nOOOOOOOOOOO\nYOOO|

