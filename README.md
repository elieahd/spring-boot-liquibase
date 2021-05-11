# Spring Boot - Liquibase

## Liquibase
### Changeset
#### Format
```sql
--liquibase formatted sql
--changeset author:id

CREATE TABLE ...

-- rollback DROP TABLE ...;
```
#### Example
```sql
--liquibase formatted sql
--changeset eliedaher:0001-1

CREATE TABLE test (
    id UUID PRIMARY KEY
)

-- rollback DROP TABLE test;
```

### Goals
| Goal                  | Parameters                | Description                   | 
| --------------------- | ------------------------- | ----------------------------- |
| `liquibase:update`    |                           | Migration database            |
| `liquibase:rollback`  | `liquibase.rollbackDate`  | Rollback to a specific date   |
| `liquibase:rollback`  | `liquibase.rollbackCount` | Rollback by count             |

### Use cases
#### Update database
```
mvn liquibase:update
```
#### Rollback by changeset count
```
mvn liquibase:rollback -Dliquibase.rollbackCount=2
```
#### Rollback to a specific date
```
mvn liquibase:rollback -Dliquibase.rollbackDate=2020-05-30T11:30:00
```
