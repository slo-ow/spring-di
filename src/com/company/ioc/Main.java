package com.company.ioc;
/*
* Reference : https://tecoble.techcourse.co.kr/post/2021-04-27-dependency-injection/
* IoC (Inversion of Control) 란?
* 제어의 역전이라고 불린다.
* 의존관계의 제어를 개발자가 직접해 주는것이 아니라, 스프링 프레임워크의 IoC 컨테이너가 제어권을 갖는것.
* IoC 컨테이너의 역할은 : 객체생성과관리,의존성관리를 대신해 주기 때문에 개발자는 로직에 집중할 수 있는 장점이 있다.
*
* 의존관계 주입 DI (Dependency Injection)
* Dependency (의존관계) 란? : A가 B를 의존한다 -> 의존대상 B가 변하면, 그것이 A에 영향을 미친다.
* */
public class Main {
    public static void main(String[] args) {
        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

//        Encoder encoder = new Encoder(new Base64Encoder()); // 의존대상 B-1
        Encoder encoder = new Encoder(new UrlEncoder()); // 의존대상 B-2
        String result = encoder.encode(url);
        System.out.println(result);
    }
}
