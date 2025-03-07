package com.productlist.product.mapper;

import com.productlist.product.dto.ProductDTO;
import com.productlist.product.entity.Category;
import com.productlist.product.entity.Product;

public class ProductMapper {

    public static Product convertToEntity(ProductDTO productDTO, Category category){
        Product product=new Product();
        product.setName(productDTO.getName());
        product.setDescription(productDTO.getDescription());
        product.setPrice(productDTO.getPrice());
        product.setCategory(category);
        return product;
    }

    public static ProductDTO convertTODTO(Product product){
        ProductDTO productDTO=new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setName(product.getName());
        productDTO.setDescription(product.getDescription());
        productDTO.setPrice(product.getPrice());
        productDTO.setCategoryId(product.getCategory().getId());
        return productDTO;

    }
}
