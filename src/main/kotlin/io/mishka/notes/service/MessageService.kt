package io.mishka.notes.service

import io.mishka.notes.entities.Friend
import org.springframework.stereotype.Service

//@Service
//class MessageService(val db: JdbcTemplate) {
//    fun getFriends(): List<Friend> = db.query("select * from friends") { response, _ ->
//        Friend(
//                name = response.getString("name"),
//                surname = response.getString("surname"),
//                age = response.getInt("age"),
//        )
//    }
//
//    fun saveFriend(friend: Friend) {
//        db.update("insert into friends values ( ?, ? , ?)",
//                friend.name, friend.surname, friend.age
//        )
//    }
//}