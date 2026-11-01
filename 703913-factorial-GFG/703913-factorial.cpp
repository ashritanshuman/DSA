class Solution {
  public:
    int factorial(int n) {
        int m=1;
        for(int i=1; i<=n; i++){
            m=m*i;
        }
        
        return m;
    }
    
    
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna