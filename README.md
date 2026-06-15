# E-Commerce Inventory Management System

A Spring Boot REST API for managing product inventories in a retail environment.

## Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Thunder Client / Postman

## Features

- Add Product
- Get All Products
- Get Product By ID
- Update Product
- Delete Product

## API Endpoints

### Add Product

POST /api/products

```json
{
  "productName": "Laptop",
  "category": "Electronics",
  "price": 65000,
  "quantity": 10,
  "supplier": "HP"
}

