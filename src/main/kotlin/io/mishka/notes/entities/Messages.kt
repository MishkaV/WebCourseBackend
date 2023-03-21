package io.mishka.notes.entities

data class Messages(
        val fullName: String,
        val shortText: String,
        val sentTime: String,
        var imgUrl: String = ""
)

val messages = mutableListOf(
        Messages("John Doe", "How are today...", "23:11"),
        Messages("Mary Smith", "So, do you think..", "11:15"),
        Messages("Bob Johnson", "Wow, really nice..", "12:00"),
        Messages("Emma Wilson", "Hmm, interesting", "08:11"),
        Messages("David Lee", "Are you sure about...", "14:37"),
        Messages("Alex Jones", "Yes, I know...", "17:59"),
        Messages("Sarah Garcia", "LOL, is it real?", "15:01"),
        Messages("Mike Brown", "I need some new...", "13:13"),
        Messages("Isabella Lopez", "I like...", "01:12"),
        Messages("Kevin Nguyen", "Again speak about...", "09:44"),
        Messages("Olivia Davis", "Jack said that...", "10:24"),
        Messages("Jack Wilson", "Very cool film...", "07:11"),
        Messages("Sophia Martinez", "Let's go to the...", "18:09"),
        Messages("Ryan Lee", "Maybe we will...", "19:02"),
        Messages("Avery Gonzalez", "I need to generate..", "20:10"),
        Messages("Emily Rodriguez", "Avery said that", "09:10"),
        Messages("Ethan Garcia", "Sorry, but you...", "16:00"),
        Messages("Luna Nguyen", "What?? Do you...", "13:45"),
        Messages("Caleb Lopez", "I need to change", "12:09"),
        Messages("Evelyn Taylor", "Really cool mes...", "08:04"),
        Messages("Nathan Smith", "Telegram is w...", "05:11"),
        Messages("Mia Kim", "Some cool staff a...", "22:23"),
        Messages("Liam Chen", "Asad Rocky cool...", "21:11"),
        Messages("Ava Wang", "Mia doesn't like...", "20:45"),
        Messages("Logan Garcia", "WHERE IS MY...", "15:55"),
        Messages("Chloe Perez", "Creation of item...", "14:13"),
        Messages("Owen Rivera", "Is cool...", "14:15"),
        Messages("Madison Reyes", "Generation of...", "13:15"),
        Messages("Lucas Sanchez", "Ilshahat cool boy...", "19:05"),
        Messages("Harper Gomez", "Rock like..", "11:14")
).apply { forEachIndexed { index, message -> message.imgUrl = userAvatarUrls[index] } }