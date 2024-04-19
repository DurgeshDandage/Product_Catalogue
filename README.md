# Product Catalogue API

## Overview

This project is a RESTful API for managing a product catalogue. It provides endpoints to perform CRUD operations on products and includes advanced features like pagination, sorting, and rating.

## Technologies Used

- Spring Boot
- Spring Data JPA
- MySQL![pd](https://github.com/DurgeshDandage/Product_Catalogue/assets/144985947/dbda38ac-3f1c-419b-8f22-ac6cef102276)

- Maven

### Installation

1. Clone this repository to your local machine.
2. Create a MySQL database named `product_catalogue`.
3. Update the database configuration in `application.properties` file located in `src/main/resources`.
4. Build the project using Maven: `mvn clean package`.
5. Run the project: `java -jar target/Product-Catalogue-0.0.1-SNAPSHOT.jar`.

### API Documentation
#### 1. Get All Products

**Endpoint:** `GET /products`

**Request Format:** 
- No request parameters required for fetching all products.

**Response Format:** 
- Status Code: 200 OK
- Content Type: application/json

```json
{
  "content": [
    {
      "id": 1,
      "name": "Product 1",
      // other product attributes
    },
    {
      "id": 2,
      "name": "Product 2",
      // other product attributes
    },
    // more products
  ],
  "totalElements": 100,  // total number of products
  "totalPages": 10,       // total number of pages
  "size": 10,             // page size
  "number": 0,            // current page number
  "numberOfElements": 10  // number of products on the current page
}
2. Get Product by ID
Endpoint: GET /products/{id}

Request Format:

Path Variable: {id} - The ID of the product to retrieve.
Response Format:

Status Code: 200 OK
Content Type: application/json
json

{
  "id": 1,
  "name": "Product 1",
  // other product attributes
}
3. Add Product
Endpoint: POST /products

Request Format:

Content Type: application/json
Request Body: JSON object representing the new product.
json

{
  "name": "New Product",
  // other product attributes
}
Response Format:

Status Code: 200 OK
Content Type: application/json
json

{
  "id": 101,
  "name": "New Product",
  // other product attributes
}
4. Update Product
Endpoint: PUT /products/{id}

Request Format:

Path Variable: {id} - The ID of the product to update.
Content Type: application/json
Request Body: JSON object representing the updated product.
json

{
  "name": "Updated Product",
  // other updated product attributes
}
Response Format:

Status Code: 200 OK
Content Type: application/json
json
Copy code
{
  "id": 101,
  "name": "Updated Product",
  // other updated product attributes
}
5. Delete Product
Endpoint: DELETE /products/{id}

Request Format:

Path Variable: {id} - The ID of the product to delete.
Response Format:

Status Code: 204 No Content
Data Model
Product Entity
Here's a sample JSON representing the structure of the Product entity:

json

{
  "id": 1,
  "name": "Sample Product",
  "description": "This is a sample product",
  "price": 50.00,
  "categories": ["Electronics", "Gadgets"],
  "attributes": {
    "color": "Black",
    "size": "Large"
  }
}
Database Integration
This project uses MySQL as the database. To integrate MySQL, update the database configuration in the application.properties file with your MySQL credentials.

![pd](https://github.com/DurgeshDandage/Product_Catalogue/assets/144985947/c9962986-2333-438a-ac39-c54fa4818aab)
