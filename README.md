# product-catalogue-service

### Run Project

$ mvn spring-boot:run

#### Get all Products

- HTTP Method GET

- http://localhost:8888/product 

#### Get all Product By Type

- HTTP Method GET

- http://localhost:8888/product/{productType}

#### Save Product

- HTTP Method POST

- http://localhost:8888/product 

- Body 
```
{ 
    "productName": "new Product",
    "productType": "Mobile",
    "price": 50000
}
``` 
   
#### Remove Product 

- HTTP Method DELETE

- http://localhost:8888/product/{id}
        
  
