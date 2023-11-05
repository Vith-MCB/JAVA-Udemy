/* Static Nested Classes:
*  Use: Static nested classes are used when a class needs to be associated with its outer class but doesn't need
*  access to the instance-specific members of the outer class. They encapsulate functionality related to the outer class.
*
* Benefits: Encapsulation, organization, and modularity.
* It can prevent polluting the outer class's namespace with additional classes.
*/

public class OuterStaticNestedClass {
    private static int outerStaticField = 42;

    // Static nested class
    static class StaticNested {
        void printStaticField() {
            System.out.println("Static field from Outer class: " + outerStaticField);
        }
    }
}

/* Instance (Inner) Classes:
* Use: Instance classes are used when you want a class that's intimately tied to the outer class and needs
* access to its instance-specific members. They are often used for implementing certain design patterns,
* such as the Iterator pattern.
*
* Benefits: Improved encapsulation, code organization, and better separation of concerns when the inner class
* logically belongs to the outer class.
*/

public class ShoppingCart {
    private int totalAmount = 0;

    // Inner class representing a line item
    class LineItem {
        private String product;
        private int quantity;

        LineItem(String product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }

        void calculateLineTotal() {
            int lineTotal = quantity * getPriceForProduct(product);
            totalAmount += lineTotal;
        }
    }

    private int getPriceForProduct(String product) {
        // Simulated method to get the price for a product
        return 10; // Assume $10 per product
    }
}

/* Local Classes:
* Use: Local classes are defined within a method and are used for encapsulating code that is relevant only
* to that method. They are especially helpful when you need a class to capture the behavior and state required
* for a specific method's functionality.
*
* Benefits: Better organization of code, reducing code duplication, and encapsulating the logic within the method where it's used.
*/

public class MathOperations {
    public int multiplyByTwo(int num) {
        // Local class to perform a one-off transformation
        class Transformer {
            int transform() {
                return num * 2;
            }
        }

        Transformer transformer = new Transformer();
        return transformer.transform();
    }
}

/* Anonymous Classes:
* Use: Anonymous classes are often used to implement a small, one-off piece of functionality that
* may not warrant the creation of a separate class. They are frequently used with interfaces to create ad-hoc implementations.
*
* Benefits: Conciseness and in-place implementation of interfaces or abstract classes, reducing the need to define a separate class for minor tasks.
*/

public class ButtonClickHandler {
    public void addButtonClickListener() {
        // Anonymous class for implementing the click listener
        Button button = new Button();
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("Button clicked!");
            }
        });
    }
}


/* Code example */
// Outer class
class Outer {
    private static String outerStaticField = "I am a static field in the outer class";
    private String outerInstanceField = "I am an instance field in the outer class";

    // Static nested class
    static class StaticNested {
        void printMessage() {
            System.out.println(outerStaticField);
        }
    }

    // Instance (inner) class
    class Inner {
        void printMessage() {
            System.out.println(outerInstanceField);
        }
    }

    // Method with a local class
    void printLocalClassMessage() {
        // Local class defined inside a method
        class LocalClass {
            void printMessage() {
                System.out.println("I am a local class.");
            }
        }

        // Create an instance of the local class and call its method
        LocalClass local = new LocalClass();
        local.printMessage();
    }

    // Method with an anonymous class
    void printAnonymousClassMessage() {
        // Anonymous class defined on the fly
        Runnable anonymous = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am an anonymous class.");
            }
        };

        // Call the run method of the anonymous class
        anonymous.run();
    }
}

public class InnerClassesExample {
    public static void main(String[] args) {
        // Static nested class
        Outer.StaticNested staticNested = new Outer.StaticNested();
        staticNested.printMessage();

        // Instance (inner) class
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.printMessage();

        // Local class
        outer.printLocalClassMessage();

        // Anonymous class
        outer.printAnonymousClassMessage();
    }
}
