package com.example.javaprojtectest2.week4.day5.fileParser;

public class Address {
    private String fullAddr;
    private String sido;
    private String sigungu;

    public Address(String fullAddr, String sido, String sigungu) {
        this.fullAddr = fullAddr;
        this.sido = sido;
        this.sigungu = sigungu;
    }

    @Override
    public String toString() {
        return "Address{" +
                "fullAddr='" + fullAddr + '\'' +
                ", sido='" + sido + '\'' +
                ", sigungu='" + sigungu + '\'' +
                '}';
    }
}
