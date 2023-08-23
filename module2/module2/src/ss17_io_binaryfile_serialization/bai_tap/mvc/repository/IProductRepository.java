package ss17_io_binaryfile_serialization.bai_tap.coppy_file.mvc.repository;

import ss12_java_collection_framework.bai_tap.model.Product;

public interface IProductRepository {
    void addProduct(Product product);
    void updateProduct(Product product);
    boolean deleteProduct(Product id);
    void printProductManage();
    void findProduct(String name);

    void sortByPrice();
}
