package com.misc.misctest;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class SmsSender {
    public static void main(String[] args) {
        String accountSid = "AC4be9d7225cb89e953cc7ac8f5438e433";
        String authToken = "55854c1f4ee6719684faf99b3c887e81";
        String apiUrl = "https://api.twilio.com/2010-04-01/Accounts/" + accountSid + "/Messages.json";

        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost httpPost = new HttpPost(apiUrl);
        httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded");
        httpPost.setHeader("Authorization", "Basic " + Base64.getEncoder().encodeToString((accountSid + ":" + authToken).getBytes()));

        String from = "+14754656707"; // Twilio phone number
        String to = "+918877993131"; // recipient's phone number
        String message = "Hello, this is a test message sent from Java!";

        try {
            List<NameValuePair> params = new ArrayList<>();
            params.add(new BasicNameValuePair("From", from));
            params.add(new BasicNameValuePair("To", to));
            params.add(new BasicNameValuePair("Body", message));
            httpPost.setEntity(new UrlEncodedFormEntity(params));

            HttpResponse response = httpClient.execute(httpPost);
            if (response.getStatusLine().getStatusCode() == 201) {
                System.out.println("Message sent successfully!");
            } else {
                System.out.println("Failed to send message. Status code: " + response.getStatusLine().getStatusCode());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
