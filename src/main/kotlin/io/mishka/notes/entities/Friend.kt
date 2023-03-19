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

data class Friend(
        val name: String,
        val surname: String,
        val age: Int = Random.nextInt() % 90,
        val county: String,
        val city: String,
        val gender: Gender
)

val friends: MutableList<Friend> = mutableListOf(
        Friend("John", "Doe", 25, "USA", "New York", Gender.male),
        Friend("Mary", "Smith", 32, "Canada", "Toronto", Gender.female),
        Friend("Bob", "Johnson", 40, "USA", "Los Angeles", Gender.male),
        Friend("Emma", "Wilson", 28, "UK", "London", Gender.female),
        Friend("David", "Lee", 22, "USA", "Chicago", Gender.male),
        Friend("Alex", "Jones", 29, "USA", "San Francisco", Gender.male),
        Friend("Sarah", "Garcia", 35, "Mexico", "Mexico City", Gender.female),
        Friend("Mike", "Brown", 31, "USA", "Boston", Gender.male),
        Friend("Isabella", "Lopez", 27, "Spain", "Madrid", Gender.female),
        Friend("Kevin", "Nguyen", 24, "Vietnam", "Ho Chi Minh City", Gender.male),
        Friend("Olivia", "Davis", 23, "USA", "San Diego", Gender.female),
        Friend("Jack", "Wilson", 30, "USA", "Seattle", Gender.male),
        Friend("Sophia", "Martinez", 26, "Mexico", "Guadalajara", Gender.female),
        Friend("Ryan", "Lee", 28, "USA", "San Antonio", Gender.male),
        Friend("Avery", "Gonzalez", 21, "USA", "Austin", Gender.other),
        Friend("Emily", "Rodriguez", 33, "USA", "Houston", Gender.female),
        Friend("Ethan", "Garcia", 27, "USA", "Philadelphia", Gender.male),
        Friend("Luna", "Nguyen", 29, "Vietnam", "Hanoi", Gender.female),
        Friend("Caleb", "Lopez", 24, "Mexico", "Monterrey", Gender.male),
        Friend("Evelyn", "Taylor", 31, "USA", "Atlanta", Gender.female),
        Friend("Nathan", "Smith", 25, "USA", "Denver", Gender.male),
        Friend("Mia", "Kim", 22, "South Korea", "Seoul", Gender.female),
        Friend("Liam", "Chen", 29, "China", "Beijing", Gender.male),
        Friend("Ava", "Wang", 27, "China", "Shanghai", Gender.female),
        Friend("Logan", "Garcia", 30, "USA", "Chicago", Gender.male),
        Friend("Chloe", "Perez", 28, "Mexico", "Tijuana", Gender.female),
        Friend("Owen", "Rivera", 32, "USA", "Miami", Gender.male),
        Friend("Madison", "Reyes", 20, "USA", "New York", Gender.female),
        Friend("Lucas", "Sanchez", 26, "Spain", "Barcelona", Gender.male),
        Friend("Harper", "Gomez", 23, "USA", "Los Angeles", Gender.other)
)