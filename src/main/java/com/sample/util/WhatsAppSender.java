package com.sample.util;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WhatsAppSender {

    public void sendWhatsAppReport(String report) throws IOException {


        Properties prop=new Properties();
        FileInputStream fileInputStream=new FileInputStream("./src/main/resources/credential.properties");
        prop.load(fileInputStream);

        final String ACCOUNT_SID = prop.getProperty("ACCOUNT_SID");
        final String AUTH_TOKEN = prop.getProperty("AUTH_TOKEN");

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber("whatsapp:+14754656707"),
                        new com.twilio.type.PhoneNumber("whatsapp:+918877993131"),
                        ""+report+"")
                .create();

        System.out.println(message.getSid());
    }
}
