package ss12_java_collection_framework.bai_tap.controller;

import ss12_java_collection_framework.bai_tap.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductManage {
    private ArrayList<Product> list;

    public ProductManage(){
        this.list = new ArrayList<Product>();
    }
    public ProductManage (ArrayList<Product> list){
        this.list = list;
    }
    public void addProduct(Product product){
        this.list.add(product);
    }
    public void updateProduct(Product product){
        for (Product pr : list) {
            if(pr.getId()== product.getId());{
                pr.setName(product.getName());
                pr.setPrice(product.getPrice());
                return;
            }
        }
    }
    public void printProductManage() {
        for (Product pr : list) {
            System.out.println(pr);
        }
    }
    public boolean deleteProduct(Product id){
        return this.list.remove(id);
    }

    public void findProduct(String name){
        for (Product pr: list) {
            if(pr.getName().indexOf(name)>=0){
                System.out.println(pr);
            }
        }
    }
    public void sortByPrice(){
        Collections.sort(this.list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });

    }
}
