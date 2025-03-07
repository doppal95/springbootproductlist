package com.productlist.product.mapper;

import com.productlist.product.dto.CategoryDTO;
import com.productlist.product.entity.Category;

public class CategoryMapper {

    public static Category convertToEntity(CategoryDTO categoryDTO){
    Category category=new Category();
    category.setName(categoryDTO.getName());
    return category;
    }

    public static CategoryDTO convertToDTO(Category category){
        if(category ==null){
            return null;
        }
        CategoryDTO categoryDTO=new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setName(category.getName());
        categoryDTO.setProducts(category.getProducts().stream().map(ProductMapper::convertTODTO).toList());
        return categoryDTO;
    }
}
