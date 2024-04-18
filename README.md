**Product Catalogue Application**
Overview

The Product Catalogue Application is a Spring Boot project aimed at managing product information. It allows users to perform various operations such as adding, updating, deleting, and searching for products.
**
Features**
Add Product: Users can add new products along with their attributes and categories.
Update Product: Users can update existing product information.
Delete Product: Users can delete products from the catalogue.
Search Product: Users can search for products based on their name, categories, and attributes.
**Technologies Used**

**Setup Instructions**
Clone the Repository:
bash
Copy code
git clone https://github.com/your_username/product-catalogue.git
Database Configuration:
Open the application.properties file located in src/main/resources.
Update the database URL, username, and password according to your MySQL configuration.
Run the Application:
bash
Copy code
mvn spring-boot:run
Access the Application:
Once the application is running, you can access it at http://localhost:8080.
**API Endpoints**
Add Product: POST /products
Update Product: PUT /products/{id}
Delete Product: DELETE /products/{id}
Search Product: GET /products/search?name={name}&categories={categories}&attributes={attributes}
For detailed information on how to use each endpoint, refer to the API documentation.

