package org.example;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(PrintService.class).to(PrintDriver.class).in(Scopes.SINGLETON);
    }
}
