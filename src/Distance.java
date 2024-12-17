public class Distance {
    private int feet;
    private double inches;

    // Constructor
    public Distance(int feet, double inches) {
        this.feet = feet;
        this.inches = inches;
        normalize();
    }

    // Normalize the distance such that inches is less than 12
    private void normalize() {
        if (this.inches >= 12) {
            this.feet += (int) (this.inches / 12);
            this.inches %= 12;
        }
    }

    // Method to add two Distance objects
    public Distance add(Distance other) {
        int totalFeet = this.feet + other.feet;
        double totalInches = this.inches + other.inches;
        return new Distance(totalFeet, totalInches);
    }

    // Method to compare two Distance objects
    public int compareTo(Distance other) {
        double thisTotalInches = this.feet * 12 + this.inches;
        double otherTotalInches = other.feet * 12 + other.inches;

        if (thisTotalInches < otherTotalInches) {
            return -1;
        } else if (thisTotalInches > otherTotalInches) {
            return 1;
        } else {
            return 0;
        }
    }

    // Override toString() for string representation
    @Override
    public String toString() {
        return this.feet + " feet " + String.format("%.2f", this.inches) + " inches";
    }

    // Example Usage
    public static void main(String[] args) {
        Distance d1 = new Distance(5, 9.5);
        Distance d2 = new Distance(3, 4.8);

        // Adding distances
        Distance result = d1.add(d2);
        System.out.println("Sum of distances: " + result);

        // Comparing distances
        int comparison = d1.compareTo(d2);
        if (comparison == -1) {
            System.out.println("d1 is less than d2");
        } else if (comparison == 1) {
            System.out.println("d1 is greater than d2");
        } else {
            System.out.println("d1 is equal to d2");
        }
    }
}
