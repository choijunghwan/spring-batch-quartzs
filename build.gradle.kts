plugins {
	java
	id("org.springframework.boot") version "2.7.13"
	id("io.spring.dependency-management") version "1.0.15.RELEASE"
}

group = "com.study.batch"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_11
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-batch")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-quartz")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.modelmapper:modelmapper:2.1.1")
	runtimeOnly("com.h2database:h2")
	runtimeOnly("mysql:mysql-connector-java:8.0.22")
	compileOnly("org.projectlombok:lombok")
	annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.batch:spring-batch-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
