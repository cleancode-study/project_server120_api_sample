### application.yml 파일 읽기
- 추가
annotationProcessor "org.springframework.boot:spring-boot-configuration-processor"
- config 파일 생성
@ConfigurationProperties(prefix="env")

#### swagger example
http://localhost:8080/swagger-ui/index.html
http://localhost:8080/api/v1/get-api/hello