package ss12_java_collection_framework.bai_tap.mvc.service.impl;

import ss12_java_collection_framework.bai_tap.model.Product;
import ss12_java_collection_framework.bai_tap.mvc.repository.impl.IProductRepository;
import ss12_java_collection_framework.bai_tap.mvc.repository.impl.ProductRepository;
import ss12_java_collection_framework.bai_tap.mvc.service.impl.IProductService;

public class ProductService implements IProductService {
    private final IProductRepository productRepository = new ProductRepository();
        @Override
        public void addProduct(Product product) {
            this.productRepository.addProduct(product);
        }

        @Override
        public void updateProduct(Product product) {
            this.productRepository.updateProduct(product);
        }

        @Override
        public boolean deleteProduct(Product id) {
            return productRepository.deleteProduct(id);
        }

        @Override
        public void printProductManage() {
            this.productRepository.printProductManage();
        }

        @Override
        public void findProduct(String name) {

        }

        @Override
        public void sortByPrice() {

        }
    }
