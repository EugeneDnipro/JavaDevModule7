package org.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class HttpStatusImageDownloader {
    static void downloadStatusImage(int code) throws IOException, InterruptedException {
        String filePath = HttpStatusChecker.getStatusImage(code);
        String pictureName = filePath.replace("https://http.cat/", "");
        URL url = new URL(filePath);
        try (InputStream inputStream = url.openStream();
             OutputStream outputStream = new FileOutputStream(pictureName)) {
            byte[] buffer = new byte[2048];
            int length;
            while ((length = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, length);
            }
        }
    }
}
