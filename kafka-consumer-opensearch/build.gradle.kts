plugins {
    id("java")
}

group = "milton.vindas"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/org.apache.kafka/kafka-clients
    implementation("org.apache.kafka:kafka-clients:4.0.0")

    // https://mvnrepository.com/artifact/org.slf4j/slf4j-api
    implementation("org.slf4j:slf4j-api:2.0.17")

    // https://mvnrepository.com/artifact/org.slf4j/slf4j-simple
    implementation("org.slf4j:slf4j-simple:2.0.17")

    // https://mvnrepository.com/artifact/org.opensearch.client/opensearch-rest-high-level-client
    implementation("org.opensearch.client:opensearch-rest-high-level-client:2.19.1")

    // https://mvnrepository.com/artifact/com.google.code.gson/gson
    implementation("com.google.code.gson:gson:2.12.1")

}
tasks.test {
    useJUnitPlatform()
}