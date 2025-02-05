package delirium;

import java.util.ArrayList;
import java.util.List;

class Main {
    public List<String> generateParenthesis(int n) {
        List<String> combinations = new ArrayList<>();
        // Initialize backtracking with empty string and initial counts
        backtrack(combinations, "", 0, 0, n);
        return combinations;
    }

    private void backtrack(List<String> combinations, 
                          String currentStr, // Current working string
                          int openCount,     // Number of '(' used so far
                          int closeCount,    // Number of ')' used so far
                          int n) {
        // Base case condition (when should we add to combinations?)
        if (/* YOUR CONDITION HERE: check if valid complete combination */) {
            combinations.add(currentStr);
            return;
        }

        // Decision 1: Can we add '('? 
        if (/* YOUR CONDITION HERE: when is adding '(' allowed? */) {
            backtrack(combinations, 
                     /* YOUR MODIFICATION: append '(' to currentStr */,
                     /* YOUR MODIFICATION: update openCount */,
                     closeCount, // unchanged
                     n);
        }

        // Decision 2: Can we add ')'? 
        if (/* YOUR CONDITION HERE: when is adding ')' allowed? */) {
            backtrack(combinations,
                     /* YOUR MODIFICATION: append ')' to currentStr */,
                     openCount, // unchanged
                     /* YOUR MODIFICATION: update closeCount */,
                     n);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        Main solution = new Main();
        List<String> result = solution.generateParenthesis(n);
        System.out.println(result); // Should print 5 combinations for n=3
    }
}
