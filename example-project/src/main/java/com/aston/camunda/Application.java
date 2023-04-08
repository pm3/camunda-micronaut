package com.aston.camunda;

import io.micronaut.runtime.Micronaut;

import java.io.File;

public class Application {

    public static void main(String[] args) {
        props();
        Micronaut.build(args).mainClass(Application.class).eagerInitSingletons(true).start();
    }

    private static void props() {
        StringBuilder sb = new StringBuilder();
        String base = System.getProperty("micronaut.config.files");
        if (base != null)
            sb.append(base);
        File confDir = new File("/app/config");
        if (confDir.exists() && confDir.isDirectory()) {
            for (File f : confDir.listFiles()) {
                String fname = f.getName();
                if (f.isFile()
                        && (fname.endsWith(".yml") || fname.endsWith(".yaml") || fname.endsWith(".properties"))) {
                    sb.append(f.getAbsolutePath()).append(",");
                    System.out.println("add config " + f.getAbsolutePath());
                }
            }
        }
        if (sb.length() > 0)
            System.setProperty("micronaut.config.files", sb.toString());
    }

}