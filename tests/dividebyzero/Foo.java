package dividebyzero;

public class Foo {

    // division is safe
    public void safeDivision() {
        int a = 10;
        int b = 2;       // b is marked as @NonZero
        int c = a / b;   
    }

    // division is unsafe (divide by zero)
    public void unsafeDivision() {
        int a = 10;
        int b = 0;       // b is marked as @Zero
        int c = a / b;   
    }

    // Branch refinement example: condition judgment refine
    public void branchRefinement(int x) {
        int y = x;
        if (y != 0) {    // y is marked as @NonZero
            int z = 10 / y; 
        }
    }

    // compound assignment example: x /= y
    public void compoundAssignment() {
        int x = 20;
        int y = 0;       // @Zero
        x /= y;          
    }
}
