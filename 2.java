package delirium;

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        // Call your backtracking helper here
        backtrack(result, /* params */);
        return result;
    }

    private void backtrack(List<String> result, /* params */) {
        // Base case condition here:
        if (/* ... */) {
            result.add(/* ... */);
            return;
        }

        // Condition for adding '('
        if (/* ... */) {
            // Modify parameters for '('
            backtrack(result, /* updated params */);
            // Undo modifications if needed (e.g., for mutable data)
        }

        // Condition for adding ')'
        if (/* ... */) {
            // Modify parameters for ')'
            backtrack(result, /* updated params */);
            // Undo modifications if needed
        }
    }
}
