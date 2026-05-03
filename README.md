# StagePick

공연 MD 사전 주문 및 QR 기반 현장 수령 커머스 서비스입니다.

## V1 Goal

팬이 공연 MD를 조회하고, 픽업 슬롯을 선택해 결제한 뒤, QR 티켓으로 현장에서 수령 완료까지 처리하는 예약형 현장수령 커머스 MVP입니다.

## Main Features

- 이벤트/회차 조회
- 상품/SKU 조회
- 픽업 슬롯 선택
- 재고/슬롯 Hold
- 주문 생성
- 카카오페이 결제
- QR 티켓 발급
- 현장 QR 스캔 및 수령 완료 처리
- 운영자 주문/결제/수령 조회

## Tech Stack

### Backend

- Kotlin
- Spring Boot
- PostgreSQL
- Redis
- Spring Data JPA
- Flyway

### Frontend

- Next.js
- React
- TypeScript
- Tailwind CSS

### Infra

- Docker Compose
- PostgreSQL
- Redis

## Local Infra Start

```bash
docker compose -f infra/local/docker-compose.yml up -d
```

## Local Infra Stop

```bash
docker compose -f infra/local/docker-compose.yml down
```