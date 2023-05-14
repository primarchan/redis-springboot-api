# Redis, Kafka 를 활용한 대용량 데이터 처리 프로젝트

## Redis 활용 서비스 개발
- Tech Stack
  - Java 17
  - Maven
  - Spring Boot
- 가격비교 API Redis Library 종류와 선택 및 적용
  - Lettuce vs Jedis
    - [기본적 비교내용 링크](https://redis.com/blog/jedis-vs-lettuce-an-exploration)
    - Jedis : 개발 복잡도가 낮다.
    - Lettuce : 다양한 옵션이 존재 (Advanced), Scaling 에 좋음, Non-Blocking Reactive Application 유리
    - 현재 프로젝트에서는 어떤 Library 를 사용해도 관계없으나, Lettuce 적용
