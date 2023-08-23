package ss17_io_binaryfile_serialization.bai_tap.coppy_file.mvc.service.impl;

import ss12_java_collection_framework.bai_tap.model.Product;
import ss17_io_binaryfile_serialization.bai_tap.coppy_file.mvc.repository.IProductRepository;
import ss17_io_binaryfile_serialization.bai_tap.coppy_file.mvc.repository.impl.ProductRepository;
import ss17_io_binaryfile_serialization.bai_tap.coppy_file.mvc.service.IProductService;

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
