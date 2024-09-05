// src/main/java/Q1WeirdFunction.java

public class Q1WeirdFunction {

    public static int fRecursive(int n) {
        if(n < 3)return n;
        else return fRecursive(n-1) + 2* fRecursive(n-2) + 3* fRecursive(n-3); 
    }

    public static int fIterative(int n) {
        // TODO: Implement the iterative function
        return 0;
    }
}
