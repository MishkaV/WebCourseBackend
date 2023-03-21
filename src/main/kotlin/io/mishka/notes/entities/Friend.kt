package io.mishka.notes.entities

import kotlin.random.Random

enum class Gender {
    female,
    male,
    other
}

fun String.toGender() = when (this) {
    "female" -> Gender.female
    "male" -> Gender.male
    else -> Gender.other
}

data class User(
        val fullName: String,
        val age: Int = Random.nextInt() % 90,
        val county: String,
        val city: String,
        val gender: Gender,
        var imgUrl: String = ""
)

data class Friend(
        val name: String,
        val surname: String,
        val age: Int = Random.nextInt() % 90,
        val county: String,
        val city: String,
        val gender: Gender
)

val users: MutableList<User> = mutableListOf(
        User("John Doe", 25, "USA", "New York", Gender.male),
        User("Mary Smith", 32, "Canada", "Toronto", Gender.female),
        User("Bob Johnson", 40, "USA", "Los Angeles", Gender.male),
        User("Emma Wilson", 28, "UK", "London", Gender.female),
        User("David Lee", 22, "USA", "Chicago", Gender.male),
        User("Alex Jones", 29, "USA", "San Francisco", Gender.male),
        User("Sarah Garcia", 35, "Mexico", "Mexico City", Gender.female),
        User("Mike Brown", 31, "USA", "Boston", Gender.male),
        User("Isabella Lopez", 27, "Spain", "Madrid", Gender.female),
        User("Kevin Nguyen", 24, "Vietnam", "Ho Chi Minh City", Gender.male),
        User("Olivia Davis", 23, "USA", "San Diego", Gender.female),
        User("Jack Wilson", 30, "USA", "Seattle", Gender.male),
        User("Sophia Martinez", 26, "Mexico", "Guadalajara", Gender.female),
        User("Ryan Lee", 28, "USA", "San Antonio", Gender.male),
        User("Avery Gonzalez", 21, "USA", "Austin", Gender.other),
        User("Emily Rodriguez", 33, "USA", "Houston", Gender.female),
        User("Ethan Garcia", 27, "USA", "Philadelphia", Gender.male),
        User("Luna Nguyen", 29, "Vietnam", "Hanoi", Gender.female),
        User("Caleb Lopez", 24, "Mexico", "Monterrey", Gender.male),
        User("Evelyn Taylor", 31, "USA", "Atlanta", Gender.female),
        User("Nathan Smith", 25, "USA", "Denver", Gender.male),
        User("Mia Kim", 22, "South Korea", "Seoul", Gender.female),
        User("Liam Chen", 29, "China", "Beijing", Gender.male),
        User("Ava Wang", 27, "China", "Shanghai", Gender.female),
        User("Logan Garcia", 30, "USA", "Chicago", Gender.male),
        User("Chloe Perez", 28, "Mexico", "Tijuana", Gender.female),
        User("Owen Rivera", 32, "USA", "Miami", Gender.male),
        User("Madison Reyes", 20, "USA", "New York", Gender.female),
        User("Lucas Sanchez", 26, "Spain", "Barcelona", Gender.male),
        User("Harper Gomez", 23, "USA", "Los Angeles", Gender.other)
).apply { forEachIndexed { index, user -> user.imgUrl = userAvatarUrls[index] } }