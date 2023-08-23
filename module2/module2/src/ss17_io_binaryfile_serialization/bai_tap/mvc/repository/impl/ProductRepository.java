package ss17_io_binaryfile_serialization.bai_tap.coppy_file.mvc.repository.impl;


import ss12_java_collection_framework.bai_tap.model.Product;
import ss17_io_binaryfile_serialization.bai_tap.coppy_file.mvc.repository.IProductRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductRepository implements IProductRepository {
    private final ArrayList<Product> list = new ArrayList<>();


    @Override
    public void addProduct(Product product) {
        this.list.add(product);
    }

    @Override
    public void updateProduct(Product product) {
        for (Product pr : list) {
            if(pr.getId()== product.getId());{
                pr.setName(product.getName());
                pr.setPrice(product.getPrice());
                return;
            }
        }
    }

    @Override
    public boolean deleteProduct(Product id) {
        return this.list.remove(id);
    }

    @Override
    public void printProductManage() {
        for (Product pr : list) {
            System.out.println(pr);
        }
    }

    @Override
    public void findProduct(String name) {
        for (Product pr: list) {
            if(pr.getName().indexOf(name)>=0){
                System.out.println(pr);
            }
        }
    }

    @Override
    public void sortByPrice() {
        Collections.sort(this.list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });

    }
}