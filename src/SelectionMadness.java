public class SelectionMadness {
    // No instance variables //

    // no-parameter constructor with "empty" body since no instance variables
    public SelectionMadness() {
    }

    public boolean flipCoin() {
        return (Math.random() >= 0.5);
    }

    public int largest(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if
        (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public boolean rightTriangle(int side1, int side2, int side3) {
        if (largest(side1, side2, side3) == side1) {
            return ((Math.pow(side2, 2) + Math.pow(side3, 2)) == Math.pow(side1, 2));
        }
        if (largest(side1, side2, side3) == side2) {
            return ((Math.pow(side1, 2) + Math.pow(side3, 2)) == Math.pow(side2, 2));
        }
        if (largest(side1, side2, side3) == side3) {
            return ((Math.pow(side1, 2) + Math.pow(side2, 2)) == Math.pow(side3, 2));
        } else {
            return false;
        }
    }
}
