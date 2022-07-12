package com.microservices.clientui.web;

import com.microservices.clientui.beans.ProductBean;
import com.microservices.clientui.proxy.MicroserviceProduitsProxy;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("client/")
@CrossOrigin("*")
public class ClientController {
    private final MicroserviceProduitsProxy produitsProxy;

    public ClientController(MicroserviceProduitsProxy produitsProxy){
        this.produitsProxy = produitsProxy;
    }

    @GetMapping ("produits")
    public List<ProductBean> listproduit(){
        List<ProductBean> produits =  produitsProxy.listeDesProduits();

        return produits;
    }
}
