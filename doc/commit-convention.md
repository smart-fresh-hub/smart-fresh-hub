# fresh-hub 의 커밋 메시지 가이드 

## 기본 형식 
<타입>: <제목>

<본문>

## 커밋 타입 가이드 
| 타입 | 설명 |
| --- | --- |
| **feat** | 새로운 기능 추가 |
| **fix** | 버그 수정 |
| **docs** | 문서 수정 (README, Wiki 등) |
| **style** | 코드 스타일 변경 (포매팅, 세미콜론 등, 기능 변경 없음) |
| **refactor** | 코드 리팩토링 (기능 변화 없이 구조 개선) |
| **perf** | 성능 개선 |
| **test** | 테스트 코드 추가 또는 수정 |
| **chore** | 빌드 설정, 패키지 업데이트, 기타 변경사항 |

### 예시 
```text
feat: 재고 테이블에 유통기한 필드 추가

- 재고 테이블(inventory)에 expiration_date 추가
- 입출고 시 유통기한 검증 로직 반영
```