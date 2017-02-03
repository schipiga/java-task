package com.ubs.opsit.interviews;

import org.apache.commons.lang.StringUtils;

import java.time.LocalTime;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by user on 03.02.17.
 */
public class Mengenlehreuhr implements TimeConverter {

    private static final String O = "O";
    private static final String R = "R";
    private static final String Y = "Y";

    private static final String tmplSecond = new String(new char[4]).replace("\0", O);
    private static final String tmplThird = tmplSecond;
    private static final String tmplFourth = new String(new char[11]).replace("\0", O);
    private static final String tmplFifth = tmplSecond;

    private static final int[] replaceIndexes = new int[]{2, 5, 8};
    private static final String sep = "\\n";

    @Override
    public String convertTime(String aTime) {
        // In readme it requires to have passed test for value `24:00:00`.
        // `24` is invalid hours value, that's why it's not possible to use
        // `LocalTime` to parse string into time format.
        // And this custom method was implemented.
        String[] items = aTime.split(":");
        int hours = Integer.parseInt(items[0]);
        int minutes = Integer.parseInt(items[1]);
        int seconds = Integer.parseInt(items[2]);

        assertThat(hours).as("Invalid hours value").isLessThanOrEqualTo(24);
        assertThat(minutes).as("Invalid minutes value").isLessThan(60);
        assertThat(seconds).as("Invalid seconds value").isLessThan(60);

        return convertTime(hours, minutes, seconds);
    }

    public String convertTime(LocalTime time) {
        return convertTime(time.getHour(), time.getMinute(), time.getSecond());
    }

    private String convertTime(int hours, int minutes, int seconds) {
        String first, second, third, fourth, fifth;
        char[] fourthChars;

        first = (seconds % 2) == 0 ? Y : O;

        second = StringUtils.replace(tmplSecond, O, R, hours / 5);
        third = StringUtils.replace(tmplThird, O, R, hours % 5);
        fourth = StringUtils.replace(tmplFourth, O, Y, minutes / 5);
        fifth = StringUtils.replace(tmplFifth, O, Y, minutes % 5);

        fourthChars = fourth.toCharArray();
        for (int idx: replaceIndexes) {
            if (fourthChars[idx] == Y.charAt(0)) {
                fourthChars[idx] = R.charAt(0);
            }
        }
        fourth = String.valueOf(fourthChars);

        return first + sep + second + sep + third + sep + fourth + sep + fifth;
    }
}
