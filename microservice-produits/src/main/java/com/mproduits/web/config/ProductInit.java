package com.mproduits.web.config;

import com.mproduits.dao.ProductDao;
import com.mproduits.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;



public class ProductInit implements CommandLineRunner {
    @Autowired
    private ProductDao productDao;
    @Override
    public void run(String... args) throws Exception {

            productDao.save(new Product(0, "Bougie fonctionnant au feu",  "bougie qui fonctionne comme une ampoule mais sans électricité ! ",  " https://github.com/OpenClassrooms-Student-Center/4668216-Optimisez-votre-architecture-Microservices/blob/master/images/Bougie.PNG?raw=true ", 22.0));

    }
}
