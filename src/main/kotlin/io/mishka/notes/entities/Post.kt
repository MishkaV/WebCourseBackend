package io.mishka.notes.entities


data class Post(
        val imgUrl: String,
        var userUrl: String = "",
        val fullName: String,
        val date: String
)

val posts = listOf(
        Post(fullName = "John Doe", date = "March 20", imgUrl = "https://wiki.mininuniver.ru/images/thumb/6/68/%D0%9A%D1%82.jpeg/800px-%D0%9A%D1%82.jpeg"),
        Post(fullName = "Mary Smith", date = "March 11", imgUrl = "https://w0.peakpx.com/wallpaper/610/992/HD-wallpaper-lovely-view-rocks-beautiful-clouds-stones-splendor-green-beauty-blue-lovely-view-colors-sky-trees-lake-tree-water-mountains-jenny-lake-peaceful-nature-landscape.jpg"),
        Post(fullName = "Bob Johnson", date = "December 20", imgUrl = "https://w0.peakpx.com/wallpaper/855/627/HD-wallpaper-british-shorthair-close-up-domestic-cat-cats-gray-cat-cute-animals-british-shorthair-cat.jpg"),
        Post(fullName = "Emma Wilson", date = "May 30", imgUrl = "https://cdn.fishki.net/upload/post/2017/09/19/2384535/tn/9-0.jpg"),
        Post(fullName = "David Lee", date = "June 12", imgUrl = "https://stihi.ru/pics/2019/11/19/2655.jpg"),
        Post(fullName = "Alex Jones", date = "August 29", imgUrl = "https://s0.smartresize.com/wallpaper/1/832/HD-wallpaper-corgi-bokeh-pets-welsh-corgi-dogs-lawn-welsh-corgi-dog-pembroke-welsh-corgi.jpg"),
        Post(fullName = "Sarah Garcia", date = "March 11", imgUrl = "https://sib.fm/storage/article/March2021/eh4G8RNBUP5awP8Mxgj9.jpg"),
        Post(fullName = "Mike Brown", date = "September 9", imgUrl = "https://w0.peakpx.com/wallpaper/936/809/HD-wallpaper-dalmatian-dogs-lawn-domestic-dog-cute-animals-dalmatian-pets-dogs.jpg"),
        Post(fullName = "Isabella Lopez", date = "April 1", imgUrl = "https://backoffice3.titanka.com/verticalizzazioni/4897/254/upload/1392977456_cane.jpg"),
        Post(fullName = "Kevin Nguyen", date = "March 18", imgUrl = "https://w0.peakpx.com/wallpaper/539/364/HD-wallpaper-autumn-fall-autumn-nature-lake-fog.jpg"),
).apply { forEachIndexed { index, post -> post.userUrl = userAvatarUrls[index] } }