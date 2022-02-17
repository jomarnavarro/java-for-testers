package com.serenitydojo;

import org.junit.Test;

public class HelloWorldWriterTest {

    @Test
    public void shouldWriteHelloWorldToTheConsole() {
        HelloWorldWriter helloWorldWriter = new HelloWorldWriter();
        helloWorldWriter.writeHelloWorld();
    }
}
