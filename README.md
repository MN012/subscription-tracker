# Subscription Tracker

A full stack web app to track your subscriptions, built with Spring Boot and vanilla JavaScript.

## Features
- Add and delete subscriptions
- View monthly total spend
- Highlights subscriptions renewing within 7 days

## Tech Stack
- Java + Spring Boot
- H2 in-memory database
- JPA / Hibernate
- HTML + CSS + JavaScript

## How to Run
1. Clone the repo
2. Open in IntelliJ IDEA
3. Run `SubscriptionTrackerApplication.java`
4. Go to `http://localhost:8080`

## API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /subscriptions | Get all subscriptions |
| POST | /subscriptions | Add a subscription |
| DELETE | /subscriptions/{id} | Delete a subscription |
