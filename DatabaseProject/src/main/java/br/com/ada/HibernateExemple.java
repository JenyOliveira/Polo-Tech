package br.com.ada;

import java.lang.module.Configuration;

public class HibernateExemple {
    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
    }
}
