// // 1.) Letter Combinations of a Phone Number

// import java.util.*;

// class backtrack {
//     public static ArrayList<String> letterCombinations(String digits) {
//         int n = digits.length();
//         ArrayList<String> result = new ArrayList<>();
//         if (n == 0)
//             return result;
//         result.add("");
//         String[] mapping = { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

//         for (int i = 0; i < n; i++) {
//             ArrayList<String> temp = new ArrayList<>();
//             String chars = mapping[digits.charAt(i) - '0'];
//             for (int j = 0; j < chars.length(); j++) {
//                 for (int k = 0; k < result.size(); k++) {
//                     temp.add(result.get(k) + chars.charAt(j));
//                 }
//             }
//             result = temp;
//         }
//         return result;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String digits = sc.next();
//         ArrayList<String> res = letterCombinations(digits);
//         System.out.println(res);

//     }
// }


// // 2.) Generate Parentheses

// import java.util.*;

// class backtrack {
//     public static ArrayList<String> generateParenthesis(int n) {
//         ArrayList<String> res = new ArrayList<>();
//         if (n == 0)
//             return res;
//         generateParenthesisUtil(n, n, "", res);
//         return res;
//     }

//     public static void generateParenthesisUtil(int open, int close, String s, ArrayList<String> res) {
//         if (open == 0 && close == 0) {
//             res.add(s);
//             return;
//         }
//         if (open > 0) {
//             generateParenthesisUtil(open - 1, close, s + "(", res);
//         }
//         if (close > open) {
//             generateParenthesisUtil(open, close - 1, s + ")", res);
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         ArrayList<String> res = generateParenthesis(n);
//         System.out.println(res);

//     }
// }


// 3.)  Sudoku Solver

import java.util.*;
import java.io.*;
import java.util.Arrays;

class backtrack {
    public static void solveSudoku(char[][] board) {
        solveSudokuUtil(board, 0, 0);
    }

    public static boolean solveSudokuUtil(char[][] board, int row, int col) {
        if (row == 9) {
            return true;
        }
        if (col == 9) {
            return solveSudokuUtil(board, row + 1, 0);
        }
        if (board[row][col] != '.') {
            return solveSudokuUtil(board, row, col + 1);
        }
        for (char c = '1'; c <= '9'; c++) {
            if (isValid(board, row, col, c)) {
                board[row][col] = c;
                if (solveSudokuUtil(board, row, col + 1)) {
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }

    public static boolean isValid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == c)
                return false;
            if (board[i][col] == c)
                return false;
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[9][9];
        for (int i = 0; i < 9; i++) {
            String s = sc.next();
            for (int j = 0; j < 9; j++) {
                board[i][j] = s.charAt(j);
            }
        }
        solveSudoku(board);
        for (int i = 0; i < 9; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
    }
}

