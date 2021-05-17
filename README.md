# Дипломная работа по курсу «Java-разработчик c нуля» от Skillbox

В рамках дипломного проекта необходимо реализовать блоговый движок на базе Spring Boot.

Требования к окружению и компонентам дипломного проекта:

|                         |         Ограничение         |
|------------------------:|:---------------------------:|
|              Версия JDK |             11              |
| Система контроля версий |             Git             |
|      Версия Spring Boot |            2.2.3            |
|             База данных |       MariaDB 10.3.13       |
|         Сборщик проекта |            Maven            |

## Запуск приложения

Подготовить окружение: 

```bash
$ cp .env_example .env
```

Задать необходимые значения переменным `JDBC_DATABASE_*`. в файле `.env`.

Запустить приложение с нужными переменными окружения: 

```bash
$ set -a; . ./.env; java -jar target/BlogApp.jar; set +a
```

Или в IntelliJ IDEA: `Edit Configuration / EnvFile / Enable EnvFile / + .env`.
