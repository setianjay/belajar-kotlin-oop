package TypeAlias.Class

data class Application(val appName: String) {
    override fun toString(): String {
        return "The application name is ${this.appName}"
    }
}