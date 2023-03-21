package io.mishka.notes.entities

import kotlin.random.Random

enum class GroupTheme{
    FASHION,
    SPORT,
    NEWS
}

data class Group(
        var id: String = "",
        val imgUrl: String,
        val groupName: String,
        val city: String,
        val theme: GroupTheme = GroupTheme.values()[Random.nextInt() % GroupTheme.values().size],
        val followers: String = "${Random.nextInt() % 1000}"
)

val groups = listOf(
        Group(imgUrl = "https://scontent.fnic3-1.fna.fbcdn.net/v/t1.6435-9/138576220_10164777378360506_3194569311752435605_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=8631f5&_nc_ohc=jC7UHCbPABcAX8LeyJ6&_nc_ht=scontent.fnic3-1.fna&oh=00_AfDSDZtRtUCOh1bLt85vXnNL7xTtP_N_57W0iMbnF_5JZQ&oe=64403A58", groupName = "Celebrating R. Kelly", city = "London"),
        Group(imgUrl = "https://www.facebook.com/images/groups/groups-default-cover-photo-2x.png", groupName = "Cash Frenzy Online", city = "Moscow"),
        Group(imgUrl = "https://scontent.fnic3-1.fna.fbcdn.net/v/t1.6435-9/119992137_3093385747436948_5260284440592426210_n.jpg?_nc_cat=107&ccb=1-7&_nc_sid=8631f5&_nc_ohc=Id1NLwP1x08AX_fCKjj&_nc_ht=scontent.fnic3-1.fna&oh=00_AfB4w6co4NaFIywo4DIJb9frR9nHd-PmQJ_jRNsVVjQtpg&oe=6440361B", groupName = "ZUMBA DANCE", city = "Limassol"),
        Group(imgUrl = "https://scontent.fnic3-1.fna.fbcdn.net/v/t1.6435-9/104676492_3493544820664401_957076826657699757_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=8631f5&_nc_ohc=wbAW2aIeEqoAX_yX69I&_nc_ht=scontent.fnic3-1.fna&oh=00_AfDHNptpi5m-lRr73gnt_T6sF76sbSLpH83DCeTPV_eLcg&oe=644041BF", groupName = "Hawaii Vacation Planning - Plan a Trip to Hawaii", city = "Hawai"),
        Group(imgUrl = "https://scontent.fnic3-1.fna.fbcdn.net/v/t1.6435-9/66167750_2147261042233667_8619155298919120896_n.jpg?_nc_cat=1&ccb=1-7&_nc_sid=8631f5&_nc_ohc=jhysecS_JLoAX9h0yXr&_nc_ht=scontent.fnic3-1.fna&oh=00_AfD2Jq_ksulDzjt-GMvyX1QpXUGBIH5Py6VPX_xHJcCeKQ&oe=64403CD6", groupName = "Destination Japan", city = "Tokyo"),
        Group(imgUrl = "https://scontent.fnic3-1.fna.fbcdn.net/v/t1.18169-9/21751855_377752725976480_7569270432595139567_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=8631f5&_nc_ohc=9oVojGUJljEAX9v7v-e&_nc_ht=scontent.fnic3-1.fna&oh=00_AfAgPQg2eSvKreMk95FWEoGvwu20XMkObEQ6Nwxrh-FGLA&oe=64400F26", groupName = "Sacramento Wedding Planning", city = "Paris"),
        Group(imgUrl = "https://scontent.fnic3-1.fna.fbcdn.net/v/t1.6435-9/167154970_109995764521858_4564893878236255309_n.jpg?_nc_cat=109&ccb=1-7&_nc_sid=8631f5&_nc_ohc=vN339vIfw7EAX_oeKTs&_nc_ht=scontent.fnic3-1.fna&oh=00_AfDQjRJGRZwinCmKNITXgDHlfEKJaYxJjJPsQtwUEsj6oQ&oe=6440218E", groupName = "PLANOS, IDEAS Y DISEÑOS PARA CONSTRUIR, REMODELAR MI CASA", city = "Rome"),
        Group(imgUrl = "https://scontent.fnic3-1.fna.fbcdn.net/v/t1.6435-9/38190346_2571233806235956_7427730288676962304_n.jpg?_nc_cat=107&ccb=1-7&_nc_sid=8631f5&_nc_ohc=NT9mbVy0C4UAX_LK5t_&_nc_ht=scontent.fnic3-1.fna&oh=00_AfCCZkU_myCvsOBBqhc5kWZoO2J6yWaGZv40Rh3Pq7DcKg&oe=64402F4E", groupName = "Decor Home Ideas", city = "Perm"),
        Group(imgUrl = "https://scontent.fnic3-1.fna.fbcdn.net/v/t1.6435-9/61779031_829566527429679_486994702332067840_n.png?_nc_cat=110&ccb=1-7&_nc_sid=8631f5&_nc_ohc=Tn7rFHwAf80AX8gAlIh&_nc_ht=scontent.fnic3-1.fna&oh=00_AfCdSCiJYFKzkcN-1_M2NPryXUEmwuf6SIv5g7r9F4K8RQ&oe=6440120B", groupName = "Linux Fans Group", city = "New York"),
        Group(imgUrl = "https://scontent.fnic3-1.fna.fbcdn.net/v/t1.6435-9/126394071_2879153442353886_8176145036539570410_n.jpg?_nc_cat=101&ccb=1-7&_nc_sid=8631f5&_nc_ohc=1a4mr4Prx5YAX9hf6yX&_nc_ht=scontent.fnic3-1.fna&oh=00_AfCxIEOsZwER1jDuSCZyH18Xh9n4okq-CJd8gfWrJ60__w&oe=6440259C", groupName = "The Meow Universe", city = "Sidney"),
        Group(imgUrl = "https://scontent.fnic3-1.fna.fbcdn.net/v/t1.6435-9/80882348_445023176165064_2235439299707273216_n.png?_nc_cat=109&ccb=1-7&_nc_sid=8631f5&_nc_ohc=8oPjSIeWacgAX_T4J2c&_nc_ht=scontent.fnic3-1.fna&oh=00_AfCQj8_SX-h-d3cHO-hxAm3h880sYmMaCN1iiUg-sEVu4g&oe=644014B3", groupName = "Nature Heaven Group", city = "Cairo"),
        Group(imgUrl = "https://scontent.fnic3-1.fna.fbcdn.net/v/t1.18169-9/15780700_10209462364410663_3788901751600245700_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=8631f5&_nc_ohc=OOVtp7D0z2AAX9OEKt0&_nc_ht=scontent.fnic3-1.fna&oh=00_AfCAy6RrxVZk9n53taLg86FuXQsTRFMzCKEsxlxMQdCxDQ&oe=644012AD", groupName = "Pokemon GO Bay Area", city = "Beijing"),
        Group(imgUrl = "https://scontent.fnic3-1.fna.fbcdn.net/v/t39.30808-6/317906054_10158839314491816_8286062341564022526_n.jpg?_nc_cat=109&ccb=1-7&_nc_sid=8631f5&_nc_ohc=tUZm3_Do3OEAX9n3rw5&_nc_ht=scontent.fnic3-1.fna&oh=00_AfAGpEsB7vOIMwKTvPl4HAbywsewAGwBaEA-9mK7cEC3mg&oe=641D2196", groupName = "Sacramento Real Estate", city = "Los Angles"),
        Group(imgUrl = "https://scontent.fnic3-1.fna.fbcdn.net/v/t1.6435-9/152247108_3659947190789256_3321976929274404922_n.jpg?_nc_cat=106&ccb=1-7&_nc_sid=8631f5&_nc_ohc=gyKaXFRtAOAAX9I0C1g&_nc_ht=scontent.fnic3-1.fna&oh=00_AfCDOHCeVQY5GuJD40BfojTjSpYQ4eQTTXO-Q3eYMIgS_g&oe=64400FE1", groupName = "TANGO EVENTS & INFO FOR THE SAN FRANCISCO BAY AREA", city = "Saint-Petersburg"),
        Group(imgUrl = "https://scontent.fnic3-1.fna.fbcdn.net/v/t39.30808-6/244338679_10217579143424393_963949541646884384_n.jpg?_nc_cat=1&ccb=1-7&_nc_sid=8631f5&_nc_ohc=aAzVwp9imI4AX-9cPWn&_nc_ht=scontent.fnic3-1.fna&oh=00_AfCGc7S1behVVbTDH-QzFnDqCBRXtU-O64e3vcHBNT9YRw&oe=641CFD94", groupName = "Gardening Ideas & More", city = "Bangkok"),
).apply {
    forEachIndexed { index, group ->
        group.id = "${index + 1}"
    }
}