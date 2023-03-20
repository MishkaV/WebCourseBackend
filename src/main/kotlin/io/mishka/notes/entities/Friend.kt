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
        User("John Doe", 25, "USA", "New York", Gender.male, "https://cdn.forbes.ru/files/1082x725/photo_galleries/gettyimages-867650476.jpg__1617616717__36660.webp"),
        User("Mary Smith", 32, "Canada", "Toronto", Gender.female, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQL9udEhtw7oGvr8Wrn8bZhNDrc-aE3OO7Y7g&usqp=CAU"),
        User("Bob Johnson", 40, "USA", "Los Angeles", Gender.male, "https://s0.rbk.ru/v6_top_pics/media/img/1/28/755743646058281.jpeg"),
        User("Emma Wilson", 28, "UK", "London", Gender.female, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS3wyWByqubP28prK5mdkCYDKYZ2O5-6CQZ1-ZcdrtbX8gEfYvz-CawIYxR-6yKmrNu9jk&usqp=CAU"),
        User("David Lee", 22, "USA", "Chicago", Gender.male, "https://klike.net/uploads/posts/2020-08/1597994286_2.jpg"),
        User("Alex Jones", 29, "USA", "San Francisco", Gender.male, "https://wl-adme.cf.tsp.li/resize/728x/jpg/800/b64/981717537aa15c68eb1a12aaeb.jpg"),
        User("Sarah Garcia", 35, "Mexico", "Mexico City", Gender.female,"https://cameralabs.org/media/k2/items/cache/3cb06e4cb464be7a87ae9907c7d62b4b_L.jpg"),
        User("Mike Brown", 31, "USA", "Boston", Gender.male, "https://cdn.maximonline.ru/ec/5b/70/ec5b701b6dc90d27cbde89b6e19a0d07/600x600_1_453c1a5e9b8239272a5b34d9d1f5b52b@1024x1024_0xac120002_17992516771550233711.jpg"),
        User("Isabella Lopez", 27, "Spain", "Madrid", Gender.female, "https://st4.depositphotos.com/6903990/24055/i/600/depositphotos_240558030-stock-photo-laughing-blonde-girl-with-long.jpg"),
        User("Kevin Nguyen", 24, "Vietnam", "Ho Chi Minh City", Gender.male, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQckoIyOZ4Nc6IQAgwA8-rQ4uWfT1rhrpZsOw&usqp=CAU"),
        User("Olivia Davis", 23, "USA", "San Diego", Gender.female, "https://www.president.gov.ua/storage/j-image-storage/28/08/73/6f604e04f3fde9f9d7eefd7a0bb77cef_1665130662_extra_large.jpeg"),
        User("Jack Wilson", 30, "USA", "Seattle", Gender.male, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSJuzp4lp9vul-dDHJ-ca3WgpW_M9D_uz2KAI4G-wxLMe7HxracqV20FVQ6muQc9XRoxDE&usqp=CAU"),
        User("Sophia Martinez", 26, "Mexico", "Guadalajara", Gender.female, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSgMruamdjcUK3E6nXmK0nC9L84FL5RwvHjog&usqp=CAU"),
        User("Ryan Lee", 28, "USA", "San Antonio", Gender.male, "https://moiarussia.ru/wp-content/uploads/2015/05/fa155bbd2751bfcb81222f7910689b5b.jpg"),
        User("Avery Gonzalez", 21, "USA", "Austin", Gender.other, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREjvn4dXEKUjOlI8A6RGn156CRkM6qwEAFxA&usqp=CAU"),
        User("Emily Rodriguez", 33, "USA", "Houston", Gender.female, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRyV8soM8-rEyhSuiWpwaETAUdlkjrxy-qYfNhOyF-v5fYpVAg64uB5te5TF9uYc44lH6U&usqp=CAU"),
        User("Ethan Garcia", 27, "USA", "Philadelphia", Gender.male, "https://n1s1.hsmedia.ru/e9/81/cc/e981ccfbc749f7b9da87d1f516a669c4/690x380_0x0a330c2a_2318864531638273041.jpeg"),
        User("Luna Nguyen", 29, "Vietnam", "Hanoi", Gender.female, "https://img2.akspic.ru/previews/6/5/6/9/6/169656/169656-devushka_s_korotkimi_volosami-model-ryzhie_volosy-volosy-krasota-500x.jpg"),
        User("Caleb Lopez", 24, "Mexico", "Monterrey", Gender.male, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSO0DOMZv3dYBD8dPrMZcSWjdpNGNQxipLwyZok17dop8eHZtFRVwGDxuQJA7MePWLx4MM&usqp=CAU"),
        User("Evelyn Taylor", 31, "USA", "Atlanta", Gender.female, "https://avatars.mds.yandex.net/i?id=e14186dbc779202019284d07ffc547ec628a8ba9-8373849-images-thumbs&n=13"),
        User("Nathan Smith", 25, "USA", "Denver", Gender.male, "https://odinterface.com/images/2021/02/07/img07.jpg"),
        User("Mia Kim", 22, "South Korea", "Seoul", Gender.female, "https://g1.dcdn.lt/images/pix/800x500/rWnhSSpI9Jg/moteris-apkalbos-paskalos-72627940.jpg"),
        User("Liam Chen", 29, "China", "Beijing", Gender.male, "https://w0.peakpx.com/wallpaper/979/681/HD-wallpaper-jake-gyllenhaal-gyllenhaal-male-jake-actor.jpg"),
        User("Ava Wang", 27, "China", "Shanghai", Gender.female, "https://www.odontobi.it/wp-content/uploads/2020/09/perimplantite.jpg"),
        User("Logan Garcia", 30, "USA", "Chicago", Gender.male, "https://p3.tabor.ru/photos/2019-01-24/15529942/61574327_800x600.jpg"),
        User("Chloe Perez", 28, "Mexico", "Tijuana", Gender.female, "https://moretestov.com/gallery/00/00/00/00/02/252/poster_1600629508.jpg"),
        User("Owen Rivera", 32, "USA", "Miami", Gender.male, "https://hazteverecuador.com/wp-content/uploads/2018/02/tablets.jpg"),
        User("Madison Reyes", 20, "USA", "New York", Gender.female, "https://www.ceritapelangiqq.com/wp-content/uploads/2020/12/happy-1-00443303bebe274cbafd3a056bf72db9_600x400.jpg"),
        User("Lucas Sanchez", 26, "Spain", "Barcelona", Gender.male, "https://www.tricomllc.com/img/team/1.jpg"),
        User("Harper Gomez", 23, "USA", "Los Angeles", Gender.other, "https://www.tatros.info/wp-content/uploads/2018/04/paren-po-dnyam-nedeli-snitsya.jpg")
)