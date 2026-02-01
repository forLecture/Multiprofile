# Spring Multiprofile Demo

Spring Boot에서 Profile을 활용한 환경별 설정 관리 예제 프로젝트

## 주요 기능

- 환경별 Profile 설정 (local, dev, prod)
- `@ConfigurationProperties`를 활용한 설정 바인딩
- Profile별 설정 파일 분리

## 기술 스택

- Java 17
- Spring Boot 3.x
- Gradle

## 실행 방법

```bash
# 기본 (local)
./gradlew bootRun

# 특정 프로필 지정
./gradlew bootRun --args='--spring.profiles.active=dev'
./gradlew bootRun --args='--spring.profiles.active=prod'
```

## 프로젝트 구조

```
src/main/
├── java/dev/be/profile/
│   ├── ProfileApplication.java
│   ├── config/
│   │   ├── AppProperties.java
│   │   └── AppProperties2.java
│   └── controller/
│       └── ProfileController.java
└── resources/
    ├── application.yml
    ├── application-local.yml
    ├── application-dev.yml
    └── application-prod.yml
```
