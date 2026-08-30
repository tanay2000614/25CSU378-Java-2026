public class Product 
{
    private String code;
    private String name;
    private double unitPrice;
    private int quantity;
    private static int productCount = 0;

    Product(String code, String name, double unitPrice)
    {
        this(code, name, unitPrice, 0);
    }

    Product(String code, String name, double unitPrice, int quantity)
    {
        System.out.println("constructor called: object created!");
        this.code = code;
        this.name = name;

        if(unitPrice <= 0)
        {
            System.out.println("Invalid price! Must be positive.");
            this.unitPrice = 1.0;
        }
        else
            this.unitPrice = unitPrice;

        if(quantity < 0)
        {
            System.out.println("Invalid quantity! Cannot be negative.");
            this.quantity = 0;
        }
        else
            this.quantity = quantity;

        productCount++;
    }

    boolean restock(int amount)
    {
        if(amount <= 0)
        {
            System.out.println("Invalid restock amount");
            return false;
        }
        quantity += amount;
        return true;
    }

    boolean sell(int amount)
    {
        if(amount <= 0)
        {
            System.out.println("Invalid sell amount");
            return false;
        }
        if(amount > quantity)
        {
            System.out.println("Not enough stock; cannot sell");
            return false;
        }
        quantity -= amount;
        return true;
    }

    double getInventoryValue()
    {
        return unitPrice * quantity;
    }

    String getCode()
    {
        return code;
    }

    String getName()
    {
        return name;
    }

    double getUnitPrice()
    {
        return unitPrice;
    }

    int getQuantity()
    {
        return quantity;
    }

    static int getProductCount()
    {
        return productCount;
    }

    @Override
    public String toString()
    { 
        return "Product[code=" + code + ", name=" + name + ", price=" + unitPrice + ", quantity=" + quantity + ", value=" + getInventoryValue() + "]";
               
    }
}
