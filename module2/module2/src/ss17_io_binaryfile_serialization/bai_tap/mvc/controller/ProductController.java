package ss17_io_binaryfile_serialization.bai_tap.coppy_file.mvc.controller;
import ss12_java_collection_framework.bai_tap.model.Product;
import ss17_io_binaryfile_serialization.bai_tap.coppy_file.mvc.service.IProductService;

public class ProductController {
    private final IProductService productService = new IProductService() {
        @Override
        public void addProduct(Product product) {
            productService.addProduct(product);
        }

        @Override
        public void updateProduct(Product product) {
            productService.updateProduct(product);
        }

        @Override
        public boolean deleteProduct(Product id) {
            return productService.deleteProduct(id);
        }

        @Override
        public void printProductManage() {
            productService.printProductManage();
        }

        @Override
        public void findProduct(String name) {
            productService.findProduct(name);
        }

        @Override
        public void sortByPrice() {
            productService.sortByPrice();
        }
    };
}


