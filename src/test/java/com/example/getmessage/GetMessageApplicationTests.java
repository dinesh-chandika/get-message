package com.example.getmessage;

import com.example.getmessage.controller.MessageController;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GetMessageApplicationTests {

    @Test
    void contextLoads() {
        MessageController messageController = new MessageController();

        Document html = Jsoup.parse(messageController.getMessage());

        Assertions.assertEquals("Hello World!",html.body().getElementById("message").text());

    }

}
