package eu.kanade.tachiyomi.data.database.models

class EpisodeImpl : Episode {

    override var id: Long? = null

    override var manga_id: Long? = null

    override lateinit var url: String

    override lateinit var name: String

    override var scanlator: String? = null

    override var read: Boolean = false

    override var bookmark: Boolean = false

    override var last_page_read: Int = 0

    override var date_fetch: Long = 0

    override var date_upload: Long = 0

    override var episode_number: Float = 0f

    override var source_order: Int = 0

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || javaClass != other.javaClass) return false

        val episode = other as Episode
        if (url != episode.url) return false
        return id == episode.id
    }

    override fun hashCode(): Int {
        return url.hashCode() + id.hashCode()
    }
}
