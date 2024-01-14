package org.example;

import javax.inject.Inject;

public class PrinterJob {
    @Inject
    private PrintService printService;

//    @Inject
//    public void setPrintService(PrintService printService) {
//        this.printService = printService;
//    }

    public boolean print(String doc) {
        return printService.print(doc);
    }
}
