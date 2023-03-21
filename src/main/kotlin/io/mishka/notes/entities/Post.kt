package io.mishka.notes.entities


data class Post(
        val imgUrl: String,
        val userUrl: String,
        val fullName: String,
        val date: String
)

val posts = listOf(
        Post(fullName = "John Doe", date = "March 20", imgUrl = "https://wiki.mininuniver.ru/images/thumb/6/68/%D0%9A%D1%82.jpeg/800px-%D0%9A%D1%82.jpeg", userUrl = "https://cdn.forbes.ru/files/1082x725/photo_galleries/gettyimages-867650476.jpg__1617616717__36660.webp"),
        Post(fullName = "Mary Smith", date = "March 11", imgUrl = "https://w0.peakpx.com/wallpaper/610/992/HD-wallpaper-lovely-view-rocks-beautiful-clouds-stones-splendor-green-beauty-blue-lovely-view-colors-sky-trees-lake-tree-water-mountains-jenny-lake-peaceful-nature-landscape.jpg", userUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQL9udEhtw7oGvr8Wrn8bZhNDrc-aE3OO7Y7g&usqp=CAU"),
        Post(fullName = "Bob Johnson", date = "December 20", imgUrl = "https://w0.peakpx.com/wallpaper/855/627/HD-wallpaper-british-shorthair-close-up-domestic-cat-cats-gray-cat-cute-animals-british-shorthair-cat.jpg", userUrl = "https://s0.rbk.ru/v6_top_pics/media/img/1/28/755743646058281.jpeg"),
        Post(fullName = "Emma Wilson", date = "May 30", imgUrl = "https://cdn.fishki.net/upload/post/2017/09/19/2384535/tn/9-0.jpg", userUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS3wyWByqubP28prK5mdkCYDKYZ2O5-6CQZ1-ZcdrtbX8gEfYvz-CawIYxR-6yKmrNu9jk&usqp=CAU"),
        Post(fullName = "David Lee", date = "June 12", imgUrl = "https://stihi.ru/pics/2019/11/19/2655.jpg", userUrl = "https://klike.net/uploads/posts/2020-08/1597994286_2.jpg"),
        Post(fullName = "Alex Jones", date = "August 29", imgUrl = "https://s0.smartresize.com/wallpaper/1/832/HD-wallpaper-corgi-bokeh-pets-welsh-corgi-dogs-lawn-welsh-corgi-dog-pembroke-welsh-corgi.jpg", userUrl = "https://wl-adme.cf.tsp.li/resize/728x/jpg/800/b64/981717537aa15c68eb1a12aaeb.jpg"),
        Post(fullName = "Sarah Garcia", date = "March 11", imgUrl = "https://sib.fm/storage/article/March2021/eh4G8RNBUP5awP8Mxgj9.jpg", userUrl = "https://cameralabs.org/media/k2/items/cache/3cb06e4cb464be7a87ae9907c7d62b4b_L.jpg"),
        Post(fullName = "Mike Brown", date = "September 9", imgUrl = "https://w0.peakpx.com/wallpaper/936/809/HD-wallpaper-dalmatian-dogs-lawn-domestic-dog-cute-animals-dalmatian-pets-dogs.jpg", userUrl = "https://cdn.maximonline.ru/ec/5b/70/ec5b701b6dc90d27cbde89b6e19a0d07/600x600_1_453c1a5e9b8239272a5b34d9d1f5b52b@1024x1024_0xac120002_17992516771550233711.jpg"),
        Post(fullName = "Isabella Lopez", date = "April 1", imgUrl = "https://backoffice3.titanka.com/verticalizzazioni/4897/254/upload/1392977456_cane.jpg", userUrl = "https://st4.depositphotos.com/6903990/24055/i/600/depositphotos_240558030-stock-photo-laughing-blonde-girl-with-long.jpg"),
        Post(fullName = "Kevin Nguyen", date = "March 18", imgUrl = "https://w0.peakpx.com/wallpaper/539/364/HD-wallpaper-autumn-fall-autumn-nature-lake-fog.jpg", userUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQckoIyOZ4Nc6IQAgwA8-rQ4uWfT1rhrpZsOw&usqp=CAU"),
)