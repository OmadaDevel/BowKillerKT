import com.lambda.client.plugin.api.Plugin

internal object BowKillerPlugin : Plugin() {
    override fun onLoad() {
        modules.add(BowKiller)
    }
}