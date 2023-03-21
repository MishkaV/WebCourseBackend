package io.mishka.notes.entities

import kotlin.math.abs
import kotlin.random.Random

enum class GroupTheme {
    FASHION,
    SPORT,
    NEWS
}

data class Group(
        var id: String = "",
        var imgUrl: String = "",
        val groupName: String,
        val city: String,
        val theme: String = GroupTheme.values()[abs(Random.nextInt()) % GroupTheme.values().size].toString(),
        val followers: String = "${abs(Random.nextInt()) % 1000}"
)

val groups = listOf(
        Group(groupName = "Celebrating R. Kelly", city = "London"),
        Group(groupName = "Cash Frenzy Online", city = "Moscow"),
        Group(groupName = "ZUMBA DANCE", city = "Limassol"),
        Group(groupName = "Hawaii Vacation Planning - Plan a Trip to Hawaii", city = "Hawai"),
        Group(groupName = "Destination Japan", city = "Tokyo"),
        Group(groupName = "Sacramento Wedding Planning", city = "Paris"),
        Group(groupName = "PLANOS, IDEAS Y DISEÑOS PARA CONSTRUIR, REMODELAR MI CASA", city = "Rome"),
        Group(groupName = "Decor Home Ideas", city = "Perm"),
        Group(groupName = "Linux Fans Group", city = "New York"),
        Group(groupName = "The Meow Universe", city = "Sidney"),
        Group(groupName = "Nature Heaven Group", city = "Cairo"),
        Group(groupName = "Pokemon GO Bay Area", city = "Beijing"),
        Group(groupName = "Sacramento Real Estate", city = "Los Angles"),
        Group(groupName = "TANGO EVENTS & INFO FOR THE SAN FRANCISCO BAY AREA", city = "Saint-Petersburg"),
        Group(groupName = "Gardening Ideas & More", city = "Bangkok"),
).apply {
    forEachIndexed { index, group ->
        group.id = "${index + 1}"
        group.imgUrl = groupsImages[index]
    }
}

val groupsImages = listOf(
        "https://storage.yandexcloud.net/cloud-devices-integration/webcourses/groups/1.jpeg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=YCAJE6l34DUy_YO1deXjjuDUb%2F20230321%2Fru-central1%2Fs3%2Faws4_request&X-Amz-Date=20230321T205718Z&X-Amz-Expires=2592000&X-Amz-Signature=4EB85E14ECCD749FFBC5EFE9F67985A5067CA40DD1AFB78D06CF4B23AF7D914C&X-Amz-SignedHeaders=host",
        "https://storage.yandexcloud.net/cloud-devices-integration/webcourses/groups/2.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=YCAJE6l34DUy_YO1deXjjuDUb%2F20230321%2Fru-central1%2Fs3%2Faws4_request&X-Amz-Date=20230321T205757Z&X-Amz-Expires=2592000&X-Amz-Signature=4AC91B921489EC3A58CADFBB845DB31FD6F6E9F8E686A88FBDB92459EE475F48&X-Amz-SignedHeaders=host",
        "https://storage.yandexcloud.net/cloud-devices-integration/webcourses/groups/3.jpeg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=YCAJE6l34DUy_YO1deXjjuDUb%2F20230321%2Fru-central1%2Fs3%2Faws4_request&X-Amz-Date=20230321T205813Z&X-Amz-Expires=2592000&X-Amz-Signature=5BFBA4AB641B669FC63270546B5CCA9C1A7FB7EF7032AD0857852ED2FE8631A1&X-Amz-SignedHeaders=host",
        "https://storage.yandexcloud.net/cloud-devices-integration/webcourses/groups/4.jpeg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=YCAJE6l34DUy_YO1deXjjuDUb%2F20230321%2Fru-central1%2Fs3%2Faws4_request&X-Amz-Date=20230321T205825Z&X-Amz-Expires=2592000&X-Amz-Signature=1BA67793E70BC9EAF755B205CB1E1CE9466A0199E3DA313622033DA8B8222EA7&X-Amz-SignedHeaders=host",
        "https://storage.yandexcloud.net/cloud-devices-integration/webcourses/groups/5.jpeg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=YCAJE6l34DUy_YO1deXjjuDUb%2F20230321%2Fru-central1%2Fs3%2Faws4_request&X-Amz-Date=20230321T205835Z&X-Amz-Expires=2592000&X-Amz-Signature=D06484C2235A5930C05FED9EF1DCB741CF0C03671DCAABC389DAF4EF2BC9CE42&X-Amz-SignedHeaders=host",
        "https://storage.yandexcloud.net/cloud-devices-integration/webcourses/groups/6.jpeg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=YCAJE6l34DUy_YO1deXjjuDUb%2F20230321%2Fru-central1%2Fs3%2Faws4_request&X-Amz-Date=20230321T205847Z&X-Amz-Expires=2592000&X-Amz-Signature=AFAF94E0793E27ED1F7262A42EDB69D1BBA455E47A18669A4B24036ACBE82D1F&X-Amz-SignedHeaders=host",
        "https://storage.yandexcloud.net/cloud-devices-integration/webcourses/groups/7.jpeg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=YCAJE6l34DUy_YO1deXjjuDUb%2F20230321%2Fru-central1%2Fs3%2Faws4_request&X-Amz-Date=20230321T205857Z&X-Amz-Expires=2592000&X-Amz-Signature=99B3744AC31E951A09445513EB20D15AB7AB32F2A6B119E00D4AB43487A61868&X-Amz-SignedHeaders=host",
        "https://storage.yandexcloud.net/cloud-devices-integration/webcourses/groups/8.jpeg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=YCAJE6l34DUy_YO1deXjjuDUb%2F20230321%2Fru-central1%2Fs3%2Faws4_request&X-Amz-Date=20230321T205908Z&X-Amz-Expires=2592000&X-Amz-Signature=A3538BD6A809430751A1A6596BD871079BD283878EE45C4C0E4349D0788086A0&X-Amz-SignedHeaders=host",
        "https://storage.yandexcloud.net/cloud-devices-integration/webcourses/groups/9.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=YCAJE6l34DUy_YO1deXjjuDUb%2F20230321%2Fru-central1%2Fs3%2Faws4_request&X-Amz-Date=20230321T205920Z&X-Amz-Expires=2592000&X-Amz-Signature=A92DB9FC7534920895979A110F4DA0A9A465776B3CBB0B1DDA7395AE9E0E7240&X-Amz-SignedHeaders=host",
        "https://storage.yandexcloud.net/cloud-devices-integration/webcourses/groups/10.jpeg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=YCAJE6l34DUy_YO1deXjjuDUb%2F20230321%2Fru-central1%2Fs3%2Faws4_request&X-Amz-Date=20230321T205932Z&X-Amz-Expires=2592000&X-Amz-Signature=853DA109C86DAB0FC16CCD992DFCC14B56FE85B0BEC3DB487F41B48FA9277EA2&X-Amz-SignedHeaders=host",
        "https://storage.yandexcloud.net/cloud-devices-integration/webcourses/groups/11.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=YCAJE6l34DUy_YO1deXjjuDUb%2F20230321%2Fru-central1%2Fs3%2Faws4_request&X-Amz-Date=20230321T205944Z&X-Amz-Expires=2592000&X-Amz-Signature=24ACBF4978027ACA03D2EAEBBE6BEA63BDDF7741B062897477E4D5E29C602DA2&X-Amz-SignedHeaders=host",
        "https://storage.yandexcloud.net/cloud-devices-integration/webcourses/groups/12.jpeg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=YCAJE6l34DUy_YO1deXjjuDUb%2F20230321%2Fru-central1%2Fs3%2Faws4_request&X-Amz-Date=20230321T205955Z&X-Amz-Expires=2592000&X-Amz-Signature=3C2AA6DA25DAFC03051741D723D4A9B671995D1E31EC650AB6807FA84ADF30A9&X-Amz-SignedHeaders=host",
        "https://storage.yandexcloud.net/cloud-devices-integration/webcourses/groups/13.jpeg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=YCAJE6l34DUy_YO1deXjjuDUb%2F20230321%2Fru-central1%2Fs3%2Faws4_request&X-Amz-Date=20230321T210005Z&X-Amz-Expires=2592000&X-Amz-Signature=B160354B1D51F1337D14F4E6272B1BEAC7478A97EB90236620039930203FED45&X-Amz-SignedHeaders=host",
        "https://storage.yandexcloud.net/cloud-devices-integration/webcourses/groups/14.jpeg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=YCAJE6l34DUy_YO1deXjjuDUb%2F20230321%2Fru-central1%2Fs3%2Faws4_request&X-Amz-Date=20230321T210015Z&X-Amz-Expires=2592000&X-Amz-Signature=6E2662FA5261CA757A826123AE96AECAB07830C38560076230F86F3D11676398&X-Amz-SignedHeaders=host",
        "https://storage.yandexcloud.net/cloud-devices-integration/webcourses/groups/15.jpeg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=YCAJE6l34DUy_YO1deXjjuDUb%2F20230321%2Fru-central1%2Fs3%2Faws4_request&X-Amz-Date=20230321T210024Z&X-Amz-Expires=2592000&X-Amz-Signature=E4C1A3C51624BBAE955786D212260D426468C0D138CAC42B7A9B4AA98AD5D460&X-Amz-SignedHeaders=host"
)