# Order Service Test Commands
# Generated: 2026-04-01

# === 1. Generate Random Orders (using /orders/generate endpoint) ===
curl -X POST http://localhost:8080/orders/generate


# === 2. Get All Orders (from Kafka Streams) ===
curl http://localhost:8080/orders


# === 3. Get All Orders (from H2 Database) ===
curl http://localhost:8080/orders-db


# === 4. Get All Products (stock-service H2) ===
curl http://localhost:8081/products


# === 5. Get All Customers (payment-service H2) ===
curl http://localhost:8082/customers


# === 6. H2 Console URLs ===
# Stock:    http://localhost:8081/h2-console
# Payment:  http://localhost:8082/h2-console
# Order:    http://localhost:8080/h2-console
# JDBC URL: jdbc:h2:mem:stockdb (or paymentdb, ordersdb)
# Username: sa
# Password: (empty)
