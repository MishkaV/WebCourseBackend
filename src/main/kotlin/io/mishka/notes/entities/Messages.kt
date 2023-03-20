package io.mishka.notes.entities

data class Messages(
        val fullName: String,
        val shortText: String,
        val sentTime: String,
        val imgUrl: String
)

val messages = mutableListOf(
        Messages("John Doe", "How are today...", "23:11", "https://cdn.forbes.ru/files/1082x725/photo_galleries/gettyimages-867650476.jpg__1617616717__36660.webp"),
        Messages("Mary Smith", "So, do you think..", "11:15", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQL9udEhtw7oGvr8Wrn8bZhNDrc-aE3OO7Y7g&usqp=CAU"),
        Messages("Bob Johnson", "Wow, really nice..", "12:00", "https://s0.rbk.ru/v6_top_pics/media/img/1/28/755743646058281.jpeg"),
        Messages("Emma Wilson","Hmm, interesting", "08:11",  "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS3wyWByqubP28prK5mdkCYDKYZ2O5-6CQZ1-ZcdrtbX8gEfYvz-CawIYxR-6yKmrNu9jk&usqp=CAU"),
        Messages("David Lee", "Are you sure about...", "14:37",  "https://klike.net/uploads/posts/2020-08/1597994286_2.jpg"),
        Messages("Alex Jones", "Yes, I know...", "17:59",  "https://wl-adme.cf.tsp.li/resize/728x/jpg/800/b64/981717537aa15c68eb1a12aaeb.jpg"),
        Messages("Sarah Garcia", "LOL, is it real?", "15:01", "https://cameralabs.org/media/k2/items/cache/3cb06e4cb464be7a87ae9907c7d62b4b_L.jpg"),
        Messages("Mike Brown", "I need some new...", "13:13",  "https://cdn.maximonline.ru/ec/5b/70/ec5b701b6dc90d27cbde89b6e19a0d07/600x600_1_453c1a5e9b8239272a5b34d9d1f5b52b@1024x1024_0xac120002_17992516771550233711.jpg"),
        Messages("Isabella Lopez", "I like...", "01:12", "https://st4.depositphotos.com/6903990/24055/i/600/depositphotos_240558030-stock-photo-laughing-blonde-girl-with-long.jpg"),
        Messages("Kevin Nguyen", "Again speak about...", "09:44",  "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQckoIyOZ4Nc6IQAgwA8-rQ4uWfT1rhrpZsOw&usqp=CAU"),
        Messages("Olivia Davis", "Jack said that...", "10:24", "https://www.president.gov.ua/storage/j-image-storage/28/08/73/6f604e04f3fde9f9d7eefd7a0bb77cef_1665130662_extra_large.jpeg"),
        Messages("Jack Wilson", "Very cool film...", "07:11", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSJuzp4lp9vul-dDHJ-ca3WgpW_M9D_uz2KAI4G-wxLMe7HxracqV20FVQ6muQc9XRoxDE&usqp=CAU"),
        Messages("Sophia Martinez", "Let's go to the...", "18:09", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSgMruamdjcUK3E6nXmK0nC9L84FL5RwvHjog&usqp=CAU"),
        Messages("Ryan Lee", "Maybe we will...", "19:02",  "https://moiarussia.ru/wp-content/uploads/2015/05/fa155bbd2751bfcb81222f7910689b5b.jpg"),
        Messages("Avery Gonzalez", "I need to generate..", "20:10", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREjvn4dXEKUjOlI8A6RGn156CRkM6qwEAFxA&usqp=CAU"),
        Messages("Emily Rodriguez", "Avery said that", "09:10",  "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRyV8soM8-rEyhSuiWpwaETAUdlkjrxy-qYfNhOyF-v5fYpVAg64uB5te5TF9uYc44lH6U&usqp=CAU"),
        Messages("Ethan Garcia", "Sorry, but you...", "16:00", "https://n1s1.hsmedia.ru/e9/81/cc/e981ccfbc749f7b9da87d1f516a669c4/690x380_0x0a330c2a_2318864531638273041.jpeg"),
        Messages("Luna Nguyen", "What?? Do you...", "13:45", "https://img2.akspic.ru/previews/6/5/6/9/6/169656/169656-devushka_s_korotkimi_volosami-model-ryzhie_volosy-volosy-krasota-500x.jpg"),
        Messages("Caleb Lopez", "I need to change", "12:09", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSO0DOMZv3dYBD8dPrMZcSWjdpNGNQxipLwyZok17dop8eHZtFRVwGDxuQJA7MePWLx4MM&usqp=CAU"),
        Messages("Evelyn Taylor", "Really cool mes...", "08:04",  "https://avatars.mds.yandex.net/i?id=e14186dbc779202019284d07ffc547ec628a8ba9-8373849-images-thumbs&n=13"),
        Messages("Nathan Smith", "Telegram is w...", "05:11",  "https://odinterface.com/images/2021/02/07/img07.jpg"),
        Messages("Mia Kim", "Some cool staff a...", "22:23", "https://g1.dcdn.lt/images/pix/800x500/rWnhSSpI9Jg/moteris-apkalbos-paskalos-72627940.jpg"),
        Messages("Liam Chen", "Asad Rocky cool...", "21:11",  "https://w0.peakpx.com/wallpaper/979/681/HD-wallpaper-jake-gyllenhaal-gyllenhaal-male-jake-actor.jpg"),
        Messages("Ava Wang", "Mia doesn't like...", "20:45",  "https://www.odontobi.it/wp-content/uploads/2020/09/perimplantite.jpg"),
        Messages("Logan Garcia", "WHERE IS MY...", "15:55",  "https://p3.tabor.ru/photos/2019-01-24/15529942/61574327_800x600.jpg"),
        Messages("Chloe Perez", "Creation of item...", "14:13",  "https://moretestov.com/gallery/00/00/00/00/02/252/poster_1600629508.jpg"),
        Messages("Owen Rivera", "Is cool...", "14:15",  "https://hazteverecuador.com/wp-content/uploads/2018/02/tablets.jpg"),
        Messages("Madison Reyes", "Generation of...", "13:15",  "https://www.ceritapelangiqq.com/wp-content/uploads/2020/12/happy-1-00443303bebe274cbafd3a056bf72db9_600x400.jpg"),
        Messages("Lucas Sanchez", "Ilshahat cool boy...", "19:05",  "https://www.tricomllc.com/img/team/1.jpg"),
        Messages("Harper Gomez", "Rock like..", "11:14", "https://www.tatros.info/wp-content/uploads/2018/04/paren-po-dnyam-nedeli-snitsya.jpg")
)