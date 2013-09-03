// After you ﬁnished studying late last night, you fell into a ﬁtful sleep and dreamt the following code. Unfortunately, you wrote four buggy lines. Fix them, so that all three methods work correctly. Each ﬁx should involve changing just part of a line of code. The fact that everything is public does not count as a bug.

public class Quantity {
    public String thing; // The thing being measured.
    public double amount; // Its numerical quantity.

    // Constructor.
    public Quantity(String thingString, double amount) {
        thing = thingString;
        amount = amount;
    }
    // Constructor for thing with quantity 100. Calls the other constructor.
    public Quantity(String thingString) {
        Quantity(thingString, 100.0);
    }

    public static void main(String[] args) {
        Quantity q = Quantity("I love Java this much: ");
        System.out.println(this.thing + this.amount);
    }
}
