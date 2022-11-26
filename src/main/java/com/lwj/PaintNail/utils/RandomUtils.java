package com.lwj.PaintNail.utils;

import java.util.UUID;

public class RandomUtils {
    public RandomUtils() {
    }

    public static String generateTicket() {
        String ticket = UUID.randomUUID().toString();
        return ticket.replaceAll("-", "");
    }

    public static void main(String[] args) {
        System.out.println(generateTicket());
    }
}