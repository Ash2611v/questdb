package com.example.sender;

import io.questdb.client.Sender;

public class BasicExample {
    public static void main(String[] args) {
        try (Sender sender = Sender.builder().address("localhost:9009").build()) {
            sender.table("products")
                    .symbol("category", "Electronics")
                    .longColumn("id", 101)
                    .stringColumn("name", "Smartphone")
                    .atNow();
            sender.table("products")
                    .symbol("category", "Appliances")
                    .longColumn("id", 102)
                    .stringColumn("name", "Refrigerator")
                    .atNow();
        }
    }
}
