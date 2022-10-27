package com.company.ioc;

import java.util.Base64;

public class Encoder {

    private IEncoder iEncoder; // 의존대상 A

    // DI를 주입받음
    public Encoder(IEncoder iEncoder) {
        this.iEncoder = iEncoder; // 의존대상 A
    }

    public String encode(String message)
    {
        return iEncoder.encode(message);
    }
}
