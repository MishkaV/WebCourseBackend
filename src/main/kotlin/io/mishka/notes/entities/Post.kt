package io.mishka.notes.entities


data class Post(
        var userUrl: String = "",
        val fullName: String,
        val date: String,
        var imgUrl: String = "",
        var id: String = "",
)

val posts = listOf(
        Post(fullName = "John Doe", date = "March 20"),
        Post(fullName = "Mary Smith", date = "March 11"),
        Post(fullName = "Bob Johnson", date = "December 20", imgUrl = "https://w0.peakpx.com/wallpaper/855/627/HD-wallpaper-british-shorthair-close-up-domestic-cat-cats-gray-cat-cute-animals-british-shorthair-cat.jpg"),
        Post(fullName = "Emma Wilson", date = "May 30", imgUrl = "https://cdn.fishki.net/upload/post/2017/09/19/2384535/tn/9-0.jpg"),
        Post(fullName = "David Lee", date = "June 12", imgUrl = "https://stihi.ru/pics/2019/11/19/2655.jpg"),
        Post(fullName = "Alex Jones", date = "August 29", imgUrl = "https://s0.smartresize.com/wallpaper/1/832/HD-wallpaper-corgi-bokeh-pets-welsh-corgi-dogs-lawn-welsh-corgi-dog-pembroke-welsh-corgi.jpg"),
        Post(fullName = "Sarah Garcia", date = "March 11", imgUrl = "https://sib.fm/storage/article/March2021/eh4G8RNBUP5awP8Mxgj9.jpg"),
        Post(fullName = "Mike Brown", date = "September 9", imgUrl = "https://w0.peakpx.com/wallpaper/936/809/HD-wallpaper-dalmatian-dogs-lawn-domestic-dog-cute-animals-dalmatian-pets-dogs.jpg"),
        Post(fullName = "Isabella Lopez", date = "April 1", imgUrl = "https://backoffice3.titanka.com/verticalizzazioni/4897/254/upload/1392977456_cane.jpg"),
        Post(fullName = "Kevin Nguyen", date = "March 18", imgUrl = "https://w0.peakpx.com/wallpaper/539/364/HD-wallpaper-autumn-fall-autumn-nature-lake-fog.jpg"),
).apply {
    forEachIndexed {
        index, post ->
        post.id = "${index + 1}"
        post.imgUrl = postImageUrls[index]
        post.userUrl = userAvatarUrls[index]
    }
}

val postImageUrls = listOf(
        "https://storage.yandexcloud.net/cloud-devices-integration/webcourses/posts/1.jpeg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=YCAJE6l34DUy_YO1deXjjuDUb%2F20230321%2Fru-central1%2Fs3%2Faws4_request&X-Amz-Date=20230321T203949Z&X-Amz-Expires=2592000&X-Amz-Signature=E7A298621953E2571E68CFCBB9EB1D9B77111BD72BD270FF2BB919AB2DE61669&X-Amz-SignedHeaders=host",
        "https://storage.yandexcloud.net/cloud-devices-integration/webcourses/posts/10.jpeg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=YCAJE6l34DUy_YO1deXjjuDUb%2F20230321%2Fru-central1%2Fs3%2Faws4_request&X-Amz-Date=20230321T204057Z&X-Amz-Expires=2592000&X-Amz-Signature=D78D88B9FC8D99D0172006C4E728875D971DAE07E501BE8855DAA6623414D1F7&X-Amz-SignedHeaders=host",
        "https://storage.yandexcloud.net/cloud-devices-integration/webcourses/posts/2.jpeg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=YCAJE6l34DUy_YO1deXjjuDUb%2F20230321%2Fru-central1%2Fs3%2Faws4_request&X-Amz-Date=20230321T204118Z&X-Amz-Expires=2592000&X-Amz-Signature=D940DFF1DB15ED9DFAB533C9352824FB9A30554D5DFCFC1681AE25692DB25B56&X-Amz-SignedHeaders=host",
        "https://storage.yandexcloud.net/cloud-devices-integration/webcourses/posts/3.jpeg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=YCAJE6l34DUy_YO1deXjjuDUb%2F20230321%2Fru-central1%2Fs3%2Faws4_request&X-Amz-Date=20230321T204130Z&X-Amz-Expires=2592000&X-Amz-Signature=2ACE080BBC77B70E85D41660B36804222341E2A75BF9FF67253FD9B3CD21DF0A&X-Amz-SignedHeaders=host",
        "https://storage.yandexcloud.net/cloud-devices-integration/webcourses/posts/4.jpeg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=YCAJE6l34DUy_YO1deXjjuDUb%2F20230321%2Fru-central1%2Fs3%2Faws4_request&X-Amz-Date=20230321T204140Z&X-Amz-Expires=2592000&X-Amz-Signature=AFB1302C1D62CEF3B75E07360E0DFA9B45D81DC06D8944CD55D948C4AB6B3B6B&X-Amz-SignedHeaders=host",
        "https://storage.yandexcloud.net/cloud-devices-integration/webcourses/posts/5.jpeg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=YCAJE6l34DUy_YO1deXjjuDUb%2F20230321%2Fru-central1%2Fs3%2Faws4_request&X-Amz-Date=20230321T204153Z&X-Amz-Expires=2592000&X-Amz-Signature=7B9B7445509663D0852F2141B167C5925C81A08CB088EBF39828FC5734F19143&X-Amz-SignedHeaders=host",
        "https://storage.yandexcloud.net/cloud-devices-integration/webcourses/posts/6.jpeg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=YCAJE6l34DUy_YO1deXjjuDUb%2F20230321%2Fru-central1%2Fs3%2Faws4_request&X-Amz-Date=20230321T204206Z&X-Amz-Expires=2592000&X-Amz-Signature=BA8539B7D0EE51DA57F1F2351E80219CDAEFCB7AAEC724F8438EBFB379934CE2&X-Amz-SignedHeaders=host",
        "https://storage.yandexcloud.net/cloud-devices-integration/webcourses/posts/7.jpeg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=YCAJE6l34DUy_YO1deXjjuDUb%2F20230321%2Fru-central1%2Fs3%2Faws4_request&X-Amz-Date=20230321T204219Z&X-Amz-Expires=2592000&X-Amz-Signature=A4566AE0AC0488D657DFE984A6A84EC36110693C35C16A56383DBE00C78EC44F&X-Amz-SignedHeaders=host",
        "https://storage.yandexcloud.net/cloud-devices-integration/webcourses/posts/8.jpeg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=YCAJE6l34DUy_YO1deXjjuDUb%2F20230321%2Fru-central1%2Fs3%2Faws4_request&X-Amz-Date=20230321T204231Z&X-Amz-Expires=2592000&X-Amz-Signature=DADC1DBA300216D1880F68542D8AE201FA6A298CA9FA8009D49761D73CD4E26C&X-Amz-SignedHeaders=host",
        "https://storage.yandexcloud.net/cloud-devices-integration/webcourses/posts/9.jpeg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=YCAJE6l34DUy_YO1deXjjuDUb%2F20230321%2Fru-central1%2Fs3%2Faws4_request&X-Amz-Date=20230321T204243Z&X-Amz-Expires=2592000&X-Amz-Signature=921F8D6EFAB1485E9720913345A6C746A8CB407F8313E0A94EB1DFF26D1B85EF&X-Amz-SignedHeaders=host"
)