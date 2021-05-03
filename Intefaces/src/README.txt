[인터페이스]

인터페이스(interfaces)

1. 객체의 사용방법을 정의한 타입
2. 객체의 교환성을 높여 주기위한 역활 (다형성 구현)
3. 객체와 객체 사이의 통신하는 점점 역활
4. 함수의 명세(시그니처)만 정의

(관련용어)
1. IDL (Interactive Data Language)
2. API
3. Static Library 
4. Dynamic Link Library (DLL)
5. Shared Library (SO)
6. Java RMI(Remote Method Invocation)


(자바)
interfaces 인터페이스명{
     타입 상수명 = 값;
     
     타입 메소드(매개변수, ...);
     
     default 
}