package my.app.graphql

import graphql.schema.DataFetcher
import graphql.schema.DataFetchingEnvironment
import javax.inject.Singleton


/**
 * @author Marcel Overdijk
 */
@Singleton
class HelloDataFetcher : DataFetcher<String> {
    override fun get(env: DataFetchingEnvironment): String {
        var name = env.getArgument<String>("name")
        if (name == null || name.trim { it <= ' ' }.length == 0) {
            name = "World"
        }
        return String.format("Hello %s!", name)
    }
}
