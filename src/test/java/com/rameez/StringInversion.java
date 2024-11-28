package com.rameez;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// https://www.interviewbit.com/problems/string-inversion/

public class StringInversion {


    public String solve(String A) {

        StringBuilder sb = new StringBuilder("");

        for (int i=0; i<A.length(); i++){
            Character c = A.charAt(i);

            String s="";

            if (c>='a' && c<='z'){
                s=c.toString().toUpperCase();
            }else if (c>='A' && c<='Z'){
                s=c.toString().toLowerCase();
            }

            sb.append(s);
        }

        return sb.toString();
    }

    @Test
    public void main() {
        assertEquals("sCALER", solve("Scaler"));

    }
}