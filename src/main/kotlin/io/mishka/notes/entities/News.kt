package io.mishka.notes.entities

import io.mishka.notes.entities.images.newsImages

data class News(
        val title: String,
        val description: String,
        val date: String,
        var id: String = "",
        var imgUrl: String = "",
)


val newsList = mutableListOf(
        News(
                title = "Xi and Putin meet in Moscow as Russia's war in Ukraine continues",
                description = "US Secretary of State Antony Blinken said that Chinese President Xi Jinping’s visit with Russian President Vladimir Putin in Moscow shows China’s intent to provide “diplomatic cover” for Russia's \"atrocities committed in Ukraine\" instead of condemning them.",
                date = "March 20"
        ),
        News(
                title = "Why a Trump indictment would have huge political and national implications",
                description = "Trump’s prediction on Saturday that he could be arrested this week – and his attempt to ignite a preemptive backlash – made what had been the theoretical prospect of an ex-president and 2024 candidate being criminally charged appear much more real. And it signaled America is headed for an even more politically divisive ordeal that will test his influence over the GOP.",
                date = "March 20"
        ),
        News(
                title = "The world’s happiest countries for 2023",
                description = "For one, benevolence is about 25% higher than it was pre-pandemic. Benevolence to others, especially the helping of strangers, which went up dramatically in 2021, stayed high in 2022,” John Helliwell, one of the authors of the World Happiness Report, said in an interview with CNN. And global happiness has not taken a hit in the three years of the Covid-19 pandemic. Life evaluations from 2020 to 2022 have been “remarkably resilient,” the report says, with global averages basically in line with the three years preceding the pandemic.",
                date = "March 19"
        ),
        News(
                title = "Not just casinos: Macao reimagines tourism post-pandemic",
                description = "Like many of his peers, Dan McAulay was furloughed from his job as a pilot during the pandemic. Being based in Macao, a city that had one of the world’s strictest approaches to the coronavirus pandemic, he found himself with a lot of time on his hands. McAulay and his wife, Rebeca Fellini, started learning how to distill alcohol as a lockdown hobby. And by the end of the nearly three years that Macao was a relative fortress, they had grown their pastime into a bona fide business – a gin brand called Owl Man, a play on the Chinese pronunciation of the city’s name “Ah Mahn.”",
                date = "March 17"
        ),
        News(
                title = "Archeologists discover 'oldest pearling town' in the Persian Gulf",
                description = "The researchers' findings reveal the town to be one of the \"largest surviving urbanized settlements ever found\" in what is today the UAE, and it is believed to have housed thousands of residents, many of whom relied on the pearling industry. The community's houses were built from local beach rocks and materials from the surrounding environment, and their roofs were made of palm trunks.",
                date = "March 20"
        ),
        News(
                title = "This country wanted a 69-hour workweek. Millennials and Generation Z had other ideas",
                description = "Workers in the east Asian powerhouse economy already face some of the longest hours in the world – ranking fourth behind only Mexico, Costa Rica and Chile in 2021, according to the OECD – and death by overwork (“gwarosa”) is thought to kill scores of people every year. Yet the government had backed the plan to increase the cap following pressure from business groups seeking a boost in productivity – until, that is, it ran into vociferous opposition from the younger generation and labor unions.",
                date = "March 19"
        ),
        News(
                title = "Spring equinox 2023: Ancient traditions of renewal echo into the modern world",
                description = "Sweet spring indeed – a time to observe the growing light, listen to the birds, smell the flowers and feel the growing warmth from the sun. They’re all signs that spring equinox 2023 is arriving. This official first day of spring in the Northern Hemisphere is a sign of rebirth, a time of tradition and a harmonious balance between day and night. ",
                date = "March 20"
        ),
        News(
                title = "Silicon Valley Bank left a void that won’t easily be filled",
                description = "While SVB was largely known as a regional bank to those outside of the tight-knit venture capital sphere, within certain circles it had become an integral part of the community – a bank that managed the idiosyncrasies of the tech world and helped pave the way for the Silicon Valley-based boom that has consumed much of the economy over the past three decades. SVB’s collapse was the largest bank failure since the 2008 financial crisis: It was the 16th largest bank in the country, holding about \$342 billion in client funds and \$74 billion in loans. At the time of its collapse, about half of all US venture-backed technology and life science firms were banking with SVB. In total, it was the bank for about 2,500 venture firms including Andreessen Horowitz, Sequoia Capital, Bain Capital and Insight Partners.",
                date = "March 12"
        ),
        News(
                title = "Meta rolls out paid verification option for Facebook and Instagram users in US",
                description = "Meta on Friday began testing a paid verification option for US users of the two social networks, CEO Mark Zuckerberg announced on Instagram. The company plans to gradually roll out the paid option to more US users over the next few weeks. First tested in February in Australia and New Zealand, Meta Verified starts at \$11.99 a month on the web or \$14.99 a month on mobile. In addition to verification, the option offers perks such as extra protection from impersonation accounts and direct access to customer support. To avoid fake accounts, customers who want to get the blue badge would need to provide a government ID which matches their profile name and picture. Users must also be above 18 to be eligible for the new service.",
                date = "March 17"
        ),
        News(
                title = "Turkey was devastated by an earthquake. Here’s what that means for tourism",
                description = "It was shaping up to be a golden year for tourism in Turkey. With favorable exchange rates sweetening the deal for visitors, the country’s beautiful beaches, historic cities and geological wonders were poised for a post-pandemic tourism revival. Then disaster struck. On February 6, a massive earthquake close to Turkey’s border with Syria caused major loss of life and leveled entire neighborhoods. The seismic shock and the emotional convulsions that followed were both felt across the country. Even as they were processing the catastrophe and doing their best to support their compatriots caught up in it, many working in Turkey’s tourism industry realized they had a potential problem on their own hands: Would the disaster scare away visitors?",
                date = "March 18"
        ),
).apply {
    forEachIndexed { index, news ->
        news.imgUrl = newsImages[index]
        news.id = "${index + 1}"
    }
}