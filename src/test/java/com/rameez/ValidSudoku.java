package com.rameez;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/valid-sudoku/

class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        if (allRowsAreValid(board) && allColumnsAreValid(board) && allBoxesAreValid(board)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean allRowsAreValid(char[][] board) {
        boolean answer = true;
        for (int i = 0; i < board.length; i++) {
            char[] row = board[i];
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < row.length; j++) {
                char c = row[j];
                if (c >= '0' && c <= '9') {
                    if (set.contains(c)) {
                        answer = false;
                        break;
                    } else {
                        set.add(c);
                    }
                }
            }
        }
        return answer;
    }

    public boolean allColumnsAreValid(char[][] board) {
        boolean answer = true;
        for (int col = 0; col < 9; col++) {
            Set<Character> set = new HashSet<>();
            for (int row = 0; row < 9; row++) {
                char c = board[row][col];
                if (c >= '0' && c <= '9') {
                    if (set.contains(c)) {
                        answer = false;
                        break;
                    } else {
                        set.add(c);
                    }
                }
            }
        }
        return answer;
    }

    public boolean allBoxesAreValid(char[][] board) {
        boolean answer = true;
        for (int rowBase = 0; rowBase <= 6; rowBase += 3) {
            for (int colBase = 0; colBase <= 6; colBase += 3) {
                Set<Character> set = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char c = board[i + rowBase][j + colBase];
                        if (c >= '0' && c <= '9') {
                            if (set.contains(c)) {
                                return false;
                            } else {
                                set.add(c);
                            }
                        }
                    }
                }
            }
        }

        return answer;
    }

    @Test
    void test() {

    }
}
