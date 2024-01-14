package org.example;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AppModule());
        PrinterJob printerJob = injector.getInstance(PrinterJob.class);
        printerJob.print("print.txt");
    }
}
