package my.app

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Pattern

@Controller("/hello")
class HelloController {
//    @Get(
//            produces = [MediaType.TEXT_PLAIN],
//            uri = "/{name}"
//    )
//    fun index(@Pattern(regexp = "^t.*") @NotBlank name: String): String {
//        return "Hello $name"
//    }

    @Get(produces = [MediaType.TEXT_PLAIN])
    fun index(): String {
        return "Hello World"
    }

}
