package ss12_java_collection_framework.bai_tap.model;

import java.util.ArrayList;

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
}
