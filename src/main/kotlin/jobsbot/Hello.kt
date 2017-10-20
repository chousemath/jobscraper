package jobsbot

import spark.Spark.*
import com.fasterxml.jackson.databind.ObjectMapper



class Job constructor(val title: String, val description: String)

fun main(args: Array<String>) {
    get("/") { req, res ->
        val exampleJob = Job("Fullstack Engineer", "Develop everything from front to back.")
        val objectMapper = ObjectMapper()
        objectMapper.writeValueAsString(exampleJob)
    }
}

