## Post the Entity-Relationship Diagram here and explain it
erDiagram
  ![image](https://github.com/DiegoFraR/swe3313Project/assets/136942042/a0fd2024-d8a2-4199-89bd-a454b8b92873)

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
