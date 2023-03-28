package org.example;

import java.io.IOException;

public class HttpStatusImageDownloader {
    void downloadStatusImage(int code) throws IOException, InterruptedException {
        HttpStatusChecker.getStatusImage(code);
    }
}
