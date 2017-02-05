# Scala/Akka Workshop

## Job Queue Exercise
 
Let's build a [job queue](https://en.wikipedia.org/wiki/Job_queue)! 
 
In our case we're going to have `JobExecutor` actor that accepts incoming job requests and executes them using pool of `JobWorker` actors. If one of the `JobWorker` actors fails `JobExecutor` should restart failed job.

A job itself can be anything (read or write a file, calculate something, etc.), but I suggest to download a file from specified URL and save it to local disk with provided path. Ideally we should introduce a small percent of failures, so we can see restarts as well.

A few important things: 

- All Akka dependencies are already included in build.sbt
- You can run the application with `sbt run`
- Use case classes to represent jobs
- If you add `ActorLogging` trait to your actor you'll be able to print logging messages with `log.info(...)`, `log.error(...)`, etc.  
