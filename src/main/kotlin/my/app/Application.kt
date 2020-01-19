package my.app

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("my.app")
                .mainClass(Application.javaClass)
                .start()
    }
}