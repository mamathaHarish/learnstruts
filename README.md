# Struts to Spring Boot Practice

A progressive hands-on project for migrating familiar Struts patterns to Spring Boot.

## Session 1 — Action to REST Controller

Implement `POST /api/employees`.

Requirements:

- Accept JSON containing `name` and `email`.
- Keep HTTP handling in `EmployeeController`.
- Put creation logic in `EmployeeService`.
- Use constructor injection.
- Return the created employee with HTTP `201 Created`.

Look for the `TODO` markers in the source code.

## Run

```bash
./mvnw spring-boot:run
```

If the Maven wrapper is not yet present, run:

```bash
mvn spring-boot:run
```

Then test your endpoint:

```bash
curl -i -X POST http://localhost:8080/api/employees \
  -H "Content-Type: application/json" \
  -d '{"name":"Alice","email":"alice@example.com"}'
```
