# Explore with me


## Это репозиторий проекта "Explore with me"
#### Это приложение — афиша. В этой афише можно предложить какое-либо событие от выставки до похода в кино и собрать компанию для участия в нём.

Учебный проект Яндекс.Практикум

<!-- Проект многомодульный:
- Основной сервис:
	- Основной сервисстостоит из трех частей:
		- публичная будет доступна без регистрации любому пользователю сети;
		- закрытая будет доступна только авторизованным пользователям;
		- административная — для администраторов сервиса.
К каждой из частей есть свои требования. Рассмотрим их.
Требования к публичному API
Публичный API должен предоставлять возможности поиска и фильтрации событий. Учтите следующие моменты:
сортировка списка событий должна быть организована либо по количеству просмотров, которое будет запрашиваться в сервисе статистики, либо по датам событий;
при просмотре списка событий должна возвращаться только краткая информация о мероприятиях;
просмотр подробной информации о конкретном событии нужно настроить отдельно (через отдельный эндпоинт);
каждое событие должно относиться к какой-то из закреплённых в приложении категорий;
должна быть настроена возможность получения всех имеющихся категорий и подборок событий (такие подборки будут составлять администраторы ресурса);
каждый публичный запрос для получения списка событий или полной информации о мероприятии должен фиксироваться сервисом статистики.
Подсказка: как узнать IP-адрес клиента, который отправил запрос
Требования к API для авторизованных пользователей
Закрытая часть API должна реализовать возможности зарегистрированных пользователей продукта. Вот что нужно учесть:
авторизованные пользователи должны иметь возможность добавлять в приложение новые мероприятия, редактировать их и просматривать после добавления;
должна быть настроена подача заявок на участие в интересующих мероприятиях;
создатель мероприятия должен иметь возможность подтверждать заявки, которые отправили другие пользователи сервиса.
Требования к API для администратора
Административная часть API должна предоставлять возможности настройки и поддержки работы сервиса. Обратите внимание на эти пункты:
нужно настроить добавление, изменение и удаление категорий для событий;
должна появиться возможность добавлять, удалять и закреплять на главной странице подборки мероприятий;
требуется наладить модерацию событий, размещённых пользователями, — публикация или отклонение;
также должно быть настроено управление пользователями — добавление, активация, просмотр и удаление. 

Сервис статистики
Второй сервис — сервис статистики. Он будет собирать информацию. Во-первых, о количестве обращений пользователей к спискам событий и, во-вторых, о количестве запросов к подробной информации о событии. На основе этой информации должна формироваться статистика о работе приложения.
Функционал сервиса статистики должен содержать:
запись информации о том, что был обработан запрос к эндпоинту API;
предоставление статистики за выбранные даты по выбранному эндпоинту.
Чтобы можно было использовать сервис статистики, нужно разработать HTTP-клиент. Он будет отправлять запросы и обрабатывать ответы. Можно использовать HTTP-клиент, который входит в состав JDK, или RestTemplate, входящий в состав Spring Framework.
-->

Приложение написано на Java при помощи Spring и сопутствующих библиотек. Пример кода:

```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StatServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(StatServiceApp.class, args);
    }
}
```

<!-- ### Базы данных:
- warehouse - база-список всех товаров с категориями, включает в себя таблицы мест, куда складывает товары при покупке и статистики покупок. Подключается к MARKET-DB, для получения цен
- MARKET-DB - база товаров интернет-магазина. Товары, категории, цены.

#### ER-диаграмма базы данных для приложения:

![This is ER-diagramme](warehouse.png)
 -->
<!-- #### Примеры запросов к базе данных:

Получаем наименование жанров по названиям фильмов:
```
SELECT f.name,
	   g.name
FROM film AS f
JOIN genre AS g ON g.genre_id=f.genre_id 
```
Получаем названия фильмов с рейтингом:
```
SELECT f.name,
	   r.name
FROM film AS f
JOIN rate AS r ON r.rate_id=f.rate_id
```
Получаем количество лайков у фильмов:
```
SELECT f.name,
	   COUNT(l.user_id)
FROM film AS f
JOIN like AS l ON l.film_id=f.film_id
GROUP BY f.name
```
Получаем фильмы, которые нравятся Васе:
```
SELECT u.name,
	   f.name
FROM film AS f
JOIN like AS l ON l.film_id=f.film_id 
JOIN user AS u ON l.user_id=u.user_id
WHERE u.name = 'Vasya'
GROUP BY user_name
```
Получаем пользователей, которым нравится фильм Дюна:
```
SELECT u.name
FROM user AS u
JOIN like AS l ON l.user_id=f.user_id 
JOIN film AS f ON f.film_id=l.film_id
WHERE f.name = 'Dune'
```
Получаем друзей Васи:
```
SELECT f.name
FROM user AS u
JOIN friendly_status AS fs u.user_id=fs.user_id
JOIN friend AS f ON fs.user_id=f.friend_id
WHERE user_name='Vasya'
``` -->
