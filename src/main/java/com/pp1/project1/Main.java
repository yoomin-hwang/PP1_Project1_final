package com.pp1.project1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            new WordManager().start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}