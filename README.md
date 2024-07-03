1. create user with roles **ADMIN / SELLER / CUSTOMER**

  **POST API : localhost:8090/api/user/register**
   
 {
    "userName" : "Dinesh",
    "email": "customer@a.com",
    "password": "password",
    "role": "CUSTOMER"
}

2. Login with email and password to get JWT token

  **POST API : localhost:8090/api/user/login**

   {
     "email": "customer@a.com",
    "password": "password"
    }


 3. Create category using ADMIN user

    **POST API : localhost:8090/category**

    {
     "name": "password",
    "description":"retail"
    }

 4. Create product using **SELLER** role

    **POST API : localhost:8090/product**

    {
    "product_Name": "Jeans",
    "description":"clothing",
    "price": 100,
    "gstPercentage" : 14,
    "tempCategoryId": "2"   
}

5. Add to cart using **CUSTOMER** role

   **POST API : localhost:8090/cart**

   {
    "cart": {

    },
    "cartItem": {
        "tempProductId": 1,
        "quantity": 1
        
    }

  }

  6. Checkout using CUSTOMER Role

     **POST API : localhost:8090/cart/checkout**

  7. Payment using CUSTOMER Role

     **POST API localhost:8090/payment?orderId=2**


     Verify that the order is completed, payment details filled in and cart, cart items are deleted


   
