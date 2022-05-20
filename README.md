## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```

### 기능 요구사항
```
사용자 입력 처리부 : UserInputController(class)
    - 좌표 입력 : coordinateUserInput(method)
    - X, Y좌표 모두 최대 24까지만 입력 (입력검증) => 에러문구 출력 : validMaxPosition(method)
    - 검증 실패 시 다시 입력받도록!
    
정규표현식을 이용한 좌표값 추출 : RegexParser(interface), PositionCollector(class), SeparatorCollector(class)
    - 좌표 정보는 괄호"(", ")"로 둘러쌓여 있으며 쉼표(,)로 x값과 y값을 구분 : PositionCollector에게 위임
    - 좌표값과 좌표값 사이는 '-' 문자로 구분 : SeparatorCollector에게 위임
    
결과 출력부 - CoordinateResult(class)
    - 좌표계산기를 표출해야한다. : coordinatePrint(method)
        - 사용자가 입력한 정상적인 좌표값을 특수문자로 표시한다.
    - 직선인 경우는 두 점 사이 거리를 계산해서 출력. : coordinateResultPrint(method)
```


### 추가 학습 포인트
1. 정규표현식 공부하기
2. 