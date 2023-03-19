package io.mishka.notes.service

import io.mishka.notes.entities.Friend
import io.mishka.notes.entities.toGender
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service

@Service
class MessageService(val db: JdbcTemplate) {
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
}