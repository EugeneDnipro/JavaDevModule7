package org.example;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HttpImageStatusCli {
    static void askStatus() throws IOException, InterruptedException {
        int code = -1;
        System.out.println("Enter HTTP status code");
        while (code == -1) {
            Scanner scanner = new Scanner(System.in);
            try {
                code = scanner.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Please enter valid number");
            }
        }
        try {
            HttpStatusImageDownloader.downloadStatusImage(code);
        } catch (IllegalArgumentException ex) {
            System.out.println("There is not image for HTTP status " + code);
        }
    }
}
