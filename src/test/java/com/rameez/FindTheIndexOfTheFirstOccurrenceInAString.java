package com.rameez;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

public class FindTheIndexOfTheFirstOccurrenceInAString {

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    @Test
    public void main() {
    }
}