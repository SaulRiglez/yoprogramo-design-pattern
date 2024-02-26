package creational.builder

class MailBuilder {
    private var to: List<String> = listOf()
    private var cc: List<String> = listOf()
    private var title: String = ""
    private var message: String = ""
    private var important: Boolean = false

    class Mail internal constructor(
        val to: List<String>,
        val cc: List<String>?,
        val title: String?,
        val message: String?,
        val important: Boolean
    )

    fun build(): Mail {
        if (to.isEmpty()) {
            throw RuntimeException("To property is empty")
        }
        return Mail(to, cc, title, message, important)
    }

    fun message(message: String): MailBuilder {
        this.message = message
        return this
    }

    fun to(to: List<String>): MailBuilder {
        this.cc = to
        return this
    }

    fun cc(cc: List<String>): MailBuilder {
        this.cc = cc
        return this
    }

    fun title(title: String): MailBuilder {
        this.title = title
        return this
    }

    fun important(important: Boolean): MailBuilder {
        this.important = important
        return this
    }
}