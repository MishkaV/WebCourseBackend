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
        val imgUrl: String
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
        User("John Doe", 25, "USA", "New York", Gender.male, "https://startuphighway.com/wp-content/uploads/2014/12/5.jpg"),
        User("Mary Smith", 32, "Canada", "Toronto", Gender.female, "https://i1.sndcdn.com/avatars-000124452487-vztyfx-t500x500.jpg"),
        User("Bob Johnson", 40, "USA", "Los Angeles", Gender.male, "https://demo.gecdesigns.com/demo/webs/multipurpose-one-page-website-template/img/team/team-01.jpg"),
        User("Emma Wilson", 28, "UK", "London", Gender.female, "https://essemge.com/wp-content/uploads/2020/01/Torus-stud-earrings-mini-shiny-worn-500x500.jpg"),
        User("David Lee", 22, "USA", "Chicago", Gender.male, "https://yumorov.ru/wp-content/uploads/2019/10/86c19d4bced177fabca4762b282d5186.jpg"),
        User("Alex Jones", 29, "USA", "San Francisco", Gender.male, "https://i1.sndcdn.com/artworks-000013566881-jurpcc-t500x500.jpg"),
        User("Sarah Garcia", 35, "Mexico", "Mexico City", Gender.female,"https://i1.sndcdn.com/artworks-000201549521-hbm0qv-t500x500.jpg"),
        User("Mike Brown", 31, "USA", "Boston", Gender.male, "https://demo.datingscript.com/uploads/8/4/2/9/B4gkm409uVAJijXanlmN_p.jpg"),
        User("Isabella Lopez", 27, "Spain", "Madrid", Gender.female, "https://i1.sndcdn.com/artworks-000447479151-gd1i6b-t500x500.jpg"),
        User("Kevin Nguyen", 24, "Vietnam", "Ho Chi Minh City", Gender.male, "https://i.pinimg.com/736x/4b/d3/04/4bd304c14c7e47b601d0482b235a89d2--hemsworth-brothers-chris-hemsworth.jpg"),
        User("Olivia Davis", 23, "USA", "San Diego", Gender.female, "https://static.tildacdn.com/tild3165-3537-4938-b066-376236306436/noroot.png"),
        User("Jack Wilson", 30, "USA", "Seattle", Gender.male, "https://i1.sndcdn.com/artworks-QfSRI9OzcyB4vXmF-xBuPVA-t500x500.jpg"),
        User("Sophia Martinez", 26, "Mexico", "Guadalajara", Gender.female, "https://i1.sndcdn.com/avatars-000173594049-xh7yqx-t500x500.jpg"),
        User("Ryan Lee", 28, "USA", "San Antonio", Gender.male, "https://c1.35photo.pro/photos_temp/sizes/333/1666481_500n.jpg"),
        User("Avery Gonzalez", 21, "USA", "Austin", Gender.other, "https://efcreativestudios.com/wp-content/uploads/2016/06/Angelina-Jolie-Makeup-1-e1466339910825.jpg"),
        User("Emily Rodriguez", 33, "USA", "Houston", Gender.female, "https://ae01.alicdn.com/kf/HTB1MPMpXAvoK1RjSZFNq6AxMVXay/Bluelans-Women-Fashion-Elegant-Shiny-Waterdrop-Rhinestone-Claw-Dangle-Earrings-Jewelry.jpg"),
        User("Ethan Garcia", 27, "USA", "Philadelphia", Gender.male, "https://sun6-21.userapi.com/s/v1/ig2/OMWa6dhUD16ez2Ot0SWIcdlUzMRTaMO9hURBKKFI8Dc3aHQFO44nBg5Ukbictzn9iRqWnfoRT8Me3V0jIPmNQbIi.jpg?size=500x500&quality=95&crop=580,0,500,500&ava=1"),
        User("Luna Nguyen", 29, "Vietnam", "Hanoi", Gender.female, "https://i1.sndcdn.com/artworks-000142724478-r3i1hi-t500x500.jpg"),
        User("Caleb Lopez", 24, "Mexico", "Monterrey", Gender.male, "https://i1.sndcdn.com/avatars-000050021469-ib40wd-t500x500.jpg"),
        User("Evelyn Taylor", 31, "USA", "Atlanta", Gender.female, "https://i1.sndcdn.com/avatars-000173658606-c1hn1r-t500x500.jpg"),
        User("Nathan Smith", 25, "USA", "Denver", Gender.male, "https://www.plasticsurgeryservices.com/wp-content/uploads/2017/09/shutterstock_150195428.jpg"),
        User("Mia Kim", 22, "South Korea", "Seoul", Gender.female, "https://bgjenite.com/data/uploads/2013/10/belleza-500x500_c.jpg"),
        User("Liam Chen", 29, "China", "Beijing", Gender.male, "https://news.sjthemes.com/nw/images/500x500/28381.jpg"),
        User("Ava Wang", 27, "China", "Shanghai", Gender.female, "https://thumb-p8.xhcdn.com/a/kDRzr1hMO_2CSC5N9A42IQ/000/061/900/518_1000.jpg"),
        User("Logan Garcia", 30, "USA", "Chicago", Gender.male, "https://nataschka.ru/content/cache/1/TtHrcX6rPDRmlgOZSBufgkGnoO3rl9g7.jpg/973b910676cd652c47170acaf48c7891.jpg"),
        User("Chloe Perez", 28, "Mexico", "Tijuana", Gender.female, "https://www.polsov.com/upload/1/5156_0_s.jpg"),
        User("Owen Rivera", 32, "USA", "Miami", Gender.male, "https://img1.liveinternet.ru/images/attach/c/0/117/895/117895653_shutterstock_129557474.jpg"),
        User("Madison Reyes", 20, "USA", "New York", Gender.female, "https://live.staticflickr.com/1569/26527865905_1c68a7b2dd.jpg"),
        User("Lucas Sanchez", 26, "Spain", "Barcelona", Gender.male, "https://yumorov.ru/wp-content/uploads/2019/10/76461a75c23ae4387cd8ce1daba6b888.jpg"),
        User("Harper Gomez", 23, "USA", "Los Angeles", Gender.other, "https://c1.35photo.pro/photos_temp/sizes/123/616718_500n.jpg")
)