## Post the Entity-Relationship Diagram here and explain it
erDiagram
    
    Product{
        int productID PK
        string productName 
        string description
        long price 
        boolean available
    }
    Customer{
        int customerID PK 
        string firstName 
        string lastName 
        string zipCode
        string address 
        string state 
        string email
        string password
        string username
        string country
    }
    ShippingTypes{
        int shippingTypeID
        string shippingName
        long price
        string description
    }
    Order{
        int orderID PK 
        int customerID FK
        string orderDate 
        int shippingTypeID FK
    }
    Payment{
        string paymentID PK
        string paymentDate 
        long amount
        string paymentMethod
    }
    ShoppingCart{
        int shoppingCartID PK
        int productID FK
        long subtotal

    }
    Customer ||--o{ Payment : contains
    Customer ||--o{ Order: Places
    Order ||--o{ Product: Has
    Order ||--o{ ShippingTypes : has
    Customer ||--o{ ShoppingCart: has
