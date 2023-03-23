package io.mishka.notes.service

import io.mishka.notes.entities.Friend
import io.mishka.notes.entities.Group
import io.mishka.notes.entities.News
import io.mishka.notes.entities.toGender
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service

@Service
class MessageService(val db: JdbcTemplate) {
    /**
     * Users
     */
    fun getFriends(): List<Friend> = db.query("select * from friends") { response, _ ->
        Friend(
                name = response.getString("name"),
                surname = response.getString("surname"),
                age = response.getInt("age"),
                county = response.getString("county"),
                city = response.getString("city"),
                gender = response.getString("gender").toGender(),
        )
    }

    fun saveFriend(friend: Friend) {
        db.update("insert into friends values ( ?, ?, ?, ?, ?, ?)",
                friend.name, friend.surname, friend.age,
                friend.county, friend.city, friend.gender.toString()
        )
    }

    /**
     * News
     */
    fun getNews(): List<News> = db.query("select * from news") { response, _ ->
        News(
                imgUrl = response.getString("imgUrl"),
                title = response.getString("title"),
                description = response.getString("description"),
                date = response.getString("date"),
        )
    }

    fun saveNews(news: News) {
        db.update("insert into news values ( ?, ?, ?, ?)",
                news.imgUrl, news.title, news.description, news.date
        )
    }

    /**
     * Groups
     */
    fun getGroups(): List<Group> = db.query("select * from groups") { response, _ ->
        Group(
                id = response.getString("id"),
                imgUrl = response.getString("imgUrl"),
                groupName = response.getString("groupName"),
                city = response.getString("city"),
                theme = response.getString("theme"),
                followers = response.getString("followers"),
        )
    }
}