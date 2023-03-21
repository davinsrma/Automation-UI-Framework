package com.sample.banner;

import java.io.*;

public class Banner {

    public void bannerReader() throws IOException {
        File file = new File("./src/main/java/com/sample/Banner/Banner");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine())!=null){
            System.out.println(line);

        }
    }
}
