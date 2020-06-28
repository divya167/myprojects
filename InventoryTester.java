public class InventoryTester {
public static void main(String[] args)
{ ProductInventory inventory = new ProductInventory();
inventory.addProduct("Apple iphone 7 plus 32gb rose gold", "box256", 10, 699.80f);
inventory.addProduct("Apple iphone 7 plus 32gb rose gold", "shelf4", 4, 699.80f);
inventory.addProduct("Apple macbook pro", "box15", 2, 1500.87f);
inventory.addProduct("Dell monitor", "shelf10", 12, 221.54f);
inventory.showInventory();
inventory.sortInventory();
inventory.showInventory();

System.out.println(inventory.countProduct("Apple iphone 7 plus 32gb rose gold"));
System.out.println(inventory.countNeededQuantity("Dell Monitor",15));

inventory.removeMaximum();
inventory.removeProduct("Apple iphone 7 plus 32gb rose gold", "shelf4");

System.out.println(inventory.getTotalQuantity());}

}

