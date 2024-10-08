package com.crudDynamo.CrudDynamo.service;


import com.crudDynamo.CrudDynamo.model.ProductDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> getAllProducts();

    ProductDTO getProductById(String id);

    ProductDTO createNewProduct(ProductDTO dto);

    ProductDTO updateProduct(String id, ProductDTO dto);

    void deleteProduct(String id);


}