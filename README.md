# micronaut-graalvm
Hello World to compare start-up time between Spring and Micronaut on GraalVM

### Docker

```sh
$ docker build -t micronaut-graalvm .
```

### Results
### start-up time

| Spring Boot App on JVM | Micronaut on Graalvm |
| ------ | ------ |
| 6404 ms | 129 ms |

### docker image size

| Spring Boot App on JVM | Micronaut on Graalvm |
| ------ | ------ |
| 121 MB | 72.5 MB |
