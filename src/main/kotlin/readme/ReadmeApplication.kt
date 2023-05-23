package readme

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReadmeApplication

fun main(args: Array<String>) {
    runApplication<ReadmeApplication>(*args)
}
