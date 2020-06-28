public class ProductInventory {
ProductNode inventoryHead = new ProductNode();
public void showInventory()
{
if(inventoryHead.next == null)
{
System.out.println("Empty Inventory");
}else
{
System.out.printf("\n%50s%20s%15s%15s","Product Name","Locator","Quantity","Price");
System.out.println("\n---------------------------------------------------------------------------------------------------------");
ProductNode curr = inventoryHead.next;
while(curr != null)
{
System.out.printf("%50s%20s%15d%15.2f\n",curr.name,curr.locator,curr.quantity,curr.price);
curr = curr.next;
}
}}
public int getTotalQuantity()
{
int totalQuantity = 0;
if(inventoryHead.next != null)
{
ProductNode curr = inventoryHead.next;
while(curr != null)
{
totalQuantity += curr.quantity;
curr = curr.next;
}}
return totalQuantity;
}
public ProductNode removeMaximum()
{
ProductNode maxNode = null;
ProductNode prevMaxNode = null;
if(inventoryHead.next != null)
{
ProductNode curr = inventoryHead.next;
ProductNode prev = inventoryHead;
prevMaxNode = prev;
maxNode = curr;
while(curr != null)
{
if(curr.quantity > maxNode.quantity)
{
maxNode = curr;
prevMaxNode = prev;
}
prev = curr;
curr = curr.next;
}
prevMaxNode.next = maxNode.next;
}
return maxNode;
}
public void sortInventory()
{
if(inventoryHead.next != null)
{
ProductInventory sortedInv = new ProductInventory();
while(inventoryHead.next != null)
{ ProductNode maxNode = removeMaximum();
sortedInv.addProduct(maxNode.name,maxNode.locator,maxNode.quantity,maxNode.price);
}
inventoryHead.next = sortedInv.inventoryHead.next;
}}
public void addProduct(String productName, String locator,int quantity, float price)
{
if(inventoryHead.next == null)
{
ProductNode node = new ProductNode(productName,locator,quantity,price);
inventoryHead.next = node; }else
{
ProductNode curr = inventoryHead.next;
ProductNode prev = null;
boolean found = false;
while(curr != null)
{
if(curr.name.equalsIgnoreCase(productName) && curr.locator.equalsIgnoreCase(locator))
{
found = true;
break;
}
prev = curr;
curr = curr.next;
}
try {
if(!found)
{
prev.next = new ProductNode(productName,locator,quantity,price);
}else
{
throw new ProductException("Product with name : "+productName+" and locator : "+locator+" already exists");
}
}catch(ProductException e){
System.out.println(e.getMessage());
}
}
}
public void removeProduct(String productName, String locator)
{
if(inventoryHead.next != null)
{
ProductNode curr = inventoryHead.next;
ProductNode prev = inventoryHead;
while(curr != null)
{
if(curr.name.equalsIgnoreCase(productName) && curr.locator.equalsIgnoreCase(locator))
{
if(prev == inventoryHead)
{
inventoryHead.next = curr.next;
}else
{
prev.next = curr.next;
}
break;
}
prev = curr;
curr = curr.next;
}
}}
public int countProduct(String productName)
{
int totalQuantity = 0;
if(inventoryHead.next != null)
{
ProductNode curr = inventoryHead.next;
while(curr != null)
{
if(curr.name.equalsIgnoreCase(productName))
{
totalQuantity += curr.quantity;
}
curr = curr.next;
}}
return totalQuantity;}
public int countNeededQuantity(String productName, int neededQuantity)
{
int existQuantity = countProduct(productName);
if(existQuantity < neededQuantity)
return(neededQuantity-existQuantity);
return 0;}
class ProductException extends RuntimeException{
public ProductException(String s)
{ super(s); }
}
}