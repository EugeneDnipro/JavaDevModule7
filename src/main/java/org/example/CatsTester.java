package org.example;

import java.io.IOException;

public class CatsTester {
    public static void main(String[] args) throws IOException, InterruptedException {
//        System.out.println(HttpStatusChecker.getStatusImage(100));
//        HttpStatusImageDownloader.downloadStatusImage(102);
        HttpImageStatusCli.askStatus();
    }
}