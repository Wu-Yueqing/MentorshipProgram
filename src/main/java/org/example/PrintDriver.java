package org.example;

import com.google.inject.Singleton;

//@Singleton
public class PrintDriver implements PrintService {
    @Override
    public boolean print(String doc) {
        System.out.printf("Printing %s%n", doc);
        return true;
    }
}
