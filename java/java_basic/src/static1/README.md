# Java 메모리 구조와 static 

## 자바 메모리 구조 

1. **`메소드 영역`** 
   - 프로그램을 실행하는 '공통' 데이터 관리
   - 프로그램의 모든 영역이 공유하는 영역
   - 구성
     - `클래스(class)정보` : 클래스 코드, 필드(변수), 메서드, 생성자 보관
     - `static 영역` : static 변수를 보관
     - `런타임 상수 풀` : 프로그램 실행을 위한 공통 리터럴 상수 관리
2. **`스택 영역`**
   - java 실행 시, 실행 스택이 생성
   - 즉, 현재 실행 중인 java 파일에 대한 정보가 스택영역에 스택프레임 형태로 보관
   - 지역변수(매개변수), 중간 연산 결과, 메서드 호출 정보등 보관
   - 메서드가 종료되면 해당 스택 프레임이 삭제
   - 스레드마다 하나의 스택이 생성 
  
3. **`힙 영역`**
   - 객체(인스턴스)가 생성되면 힙영역에 보관
   - GC(가비지 컬렉션)이 이루어지는 영역
   - 참조X인 객체는 GC에 의해 제거됨 

## Static 변수 

1. Static 변수란?
   * java의 클래스 수준의 변수 
   * 클래스의 인스턴스와 상관없이 클래스 자체에 속한 변수로 모든 인스턴스가 공유하는 값을 가질 수 있음
   * 클래스가 메모리에 로드(메소드 영역)될 때 한 번만 메소드 영역의 static 영역에 할당됨
   * 접근 방법
     * `인스턴스명`.(dot)static변수 (인스턴스를 통한 접근)
     * `클래스명`.static변수 (클래스를 통한 접근)
    ```java
    class Example {
        private static int count = 0; // static 변수
    
        Example() { // 생성자 
            count++; // 객체가 생성될 때마다 count 증가
        }
    
        public void showCount() {
            System.out.println("Count: " + count);
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            Example obj1 = new Example();
            Example obj2 = new Example();
            obj1.showCount(); // 출력: Count: 1
            obj2.showCount(); // 출력: Count: 2
            Example.showCount(); // 출력 : Count: 3
        }
    }
    ```
 2. Instance 변수 vs Static 변수

   | Instance variable            | Static variable                                  | 
   |------------------------------|--------------------------------------------------|
   | static이 붙지 않은 멤버 변수          | 정적변수, 클래스변수, static 변수                           | 
   | 인스턴스를 생성해야 사용 가능             | 인스턴스와 무관하게 클래스에 직접 접근해서 사용 가능                    | 
   | 인스턴스를 생성할 때마다 새로 생성됨 (동적 생성) | java 프로그램이 시작될 때 1개만 생성됨 (정적 생성)                 |
   | 힙영역에 보관, 인스턴스 참조x시 GC에의해 제거됨 | 메소드 영역의 static영역에 보관, 프로그램 시작때 만들어지고, 종료 시점에 제거됨 |

## Static 메서드
1. **멤버 메서드 종류**
    * `인스턴스 메서드`(Instance Method)
      * static이 붙지 않은 멤버 메서드
      * 인스턴스를 생성하고 생성된 인스턴스를 통해 접근 가능 
      * 인스턴스에 소속되어 있기에 힙영역에 생성 
    * `클래스 메서드`(Class Method)
      * 정적 메서드, Static 메서드
      * 클래스에 소속되어 인스턴스 생성없이 클래스명을 통해 바로 접근 가능 

2. **정적 메서드 사용법**
   1. static 메서드 내부에서는 static만 사용 가능 
      * static 메서드 내부에서는 static 변수, static 메서드만 사용 가능 
      * static 메서드 내부에서 인스턴스 변수 또는 메소드를 사용할 수 없는 이유
        * 인스턴스 변수와 인스턴스 메서드는 인스턴스를 생성하면서 발생한 참조값을 참조하여 접근
        * 즉, 인스턴스 생성 없이는 접근 자체가 불가능하기 때문 
        * static 메서드 내부에서 인스턴스 메서드 또는 변수에 접근하려면 파라미터로 인스턴스를 받아야 한다
        ```java
        public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
        }
        ```
   2. 반대로 static은 클래스에 속해 있기에 모든 곳에서 static을 호출 가능
      * 접근 제어자만 허락한다면 클래스를 통해 모든 곳에서 static 호출 가능 
   3. 정적 변수와 동일하게 인스턴스를 통해서 또는 클래스명을 통해서 접근 가능 

3. `static import` 
   * 정적 메서드를 사용할 때 해당 메서드를 자주 사용하는 경우 static import 사용 가능 
   ```java
   staticData.methodCall(); // 클래스명을 통해 접근 하는 경우
   staticData.methodCall();
   staticData.methodCall();
   ```
   ```java
   import static static2.staticData.*;
   
   // 클래스 명 생략 가능 
   methodCall();
   methodCall();
   methodCall();
   ```

4. `main()` 메서드는 정적 메서드
