package com.microservices.clientui.web;

import com.microservices.clientui.beans.ProductBean;
import com.microservices.clientui.proxy.MicroserviceProduitsProxy;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping ("produits/{id}")
    public ProductBean produitId(@PathVariable int id){
        ProductBean productBean =  produitsProxy.recupererUnProduit(id);

        return productBean;
    }
    @GetMapping ("/produits-p-{p}")
    public List<ProductBean> listproduitParPage(@PathVariable int p){


        return produitsProxy.recupererListProduitsParPage(p);
    }
}
