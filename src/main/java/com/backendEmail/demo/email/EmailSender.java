package com.backendEmail.demo.email;

public interface EmailSender {
    void send(String to, String email);
}