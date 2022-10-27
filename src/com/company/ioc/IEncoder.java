package com.company.ioc;

public interface IEncoder {
    // 공통(반복)작업을 하는 메서드를 추상 메서드로 선언함으로서 중복을 제거한다.
    String encode(String message);
}
