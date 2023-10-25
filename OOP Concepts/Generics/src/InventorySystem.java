import java.util.ArrayList;
import java.util.List;

// Generic class for an inventory item
class InventoryItem<T> {
    private T item;
    private int quantity;

    public InventoryItem(T item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public T getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int amount) {
        quantity += amount;
    }

    @Override
    public String toString() {
        return "Item: " + item + " | Quantity: " + quantity;
    }
}

public class InventorySystem {
    public static void main(String[] args) {
        // Create a list to store various inventory items
        List<InventoryItem<?>> inventory = new ArrayList<>();

        // Add items to the inventory
        InventoryItem<String> item1 = new InventoryItem<>("Apples", 50);
        InventoryItem<Integer> item2 = new InventoryItem<>(1001, 10);
        InventoryItem<Double> item3 = new InventoryItem<>(2.99, 25);

        inventory.add(item1);
        inventory.add(item2);
        inventory.add(item3);

        // Display the inventory
        System.out.println("Inventory Items:");
        for (InventoryItem<?> inventoryItem : inventory) {
            System.out.println(inventoryItem);
        }

        // Adding more apples
        addItemQuantity(inventory, "Apples", 20);

        // Updated inventory
        System.out.println("\nUpdated Inventory Items:");
        for (InventoryItem<?> inventoryItem : inventory) {
            System.out.println(inventoryItem);
        }
    }

    // Generic method to add quantity of a specific item
    public static <T> void addItemQuantity(List<InventoryItem<?>> inventory, T item, int amount) {
        for (InventoryItem<?> inventoryItem : inventory) {
            if (inventoryItem.getItem().equals(item)) {
                // Due to type erasure, we need to use type casting here
                ((InventoryItem<T>) inventoryItem).addQuantity(amount);
            }
        }
    }

}
