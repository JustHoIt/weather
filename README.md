# 날씨 일기

날씨 데이터를 활용하여 일기를 작성할 수 있습니다.


기술스택
------
JAVA 8, SpringBoot, JPA, MySQL, Spring Scheduler, Logback, Swagger


구현기능
-----
1. OpenWeatherMap API를  스케줄러활용하여 1시간마다 날씨의 데이터를 가져옵니다.
2. 가져온 날씨와 함께 일기를 작성하여 데이터베이스에 저장합니다.
3. 작성된 일기를 삭제 또는 수정할 수 있습니다.
4. 과거에 작성했던 일기를 일자를 파라미터로 보내 조회할 수 있습니다.
5. 서비스 동작 상태 파악 및 장애 파악을 위해 Logback을 사용하여  log를 남깁니다.
