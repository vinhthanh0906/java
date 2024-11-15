public class Interger {
    private int value;

    // Constructor
    public Interger(int value) {
        this.value = value;
    }

    // Getter for value
    public int getValue() {
        return value;
    }

    // Overriding the equals() method to compare two Interger objects
    @Override
    public boolean equals(Object obj) {
        // Check if the current object is being compared with itself
        if (this == obj) {
            return true;
        }

        // Check if the obj is an instance of Interger
        if (obj instanceof Interger) {
            Interger other = (Interger) obj;
            // Compare the values of the two objects
            return this.value == other.value;
        }

        // If the objects are not of the same type, they are not equal
        return false;
    }

    public static void main(String[] args) {
        // Creating two Interger objects
        Interger obj1 = new Interger(10);
        Interger obj2 = new Interger(11);

        // Comparing the two objects using equals() method
        if (obj1.equals(obj2)) {
            System.out.println("Both objects are equal.");
        } else {
            System.out.println("Objects are not equal.");
        }
    }
}
