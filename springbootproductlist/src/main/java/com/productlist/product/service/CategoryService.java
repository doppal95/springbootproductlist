package com.productlist.product.service;

import com.productlist.product.dto.CategoryDTO;
import com.productlist.product.entity.Category;
import com.productlist.product.mapper.CategoryMapper;
import com.productlist.product.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoryService {


    private CategoryRepository categoryRepository;

    public CategoryDTO createCategory(CategoryDTO categoryDTO){
        Category category=CategoryMapper.convertToEntity(categoryDTO);
        categoryRepository.save(category);
        return CategoryMapper.convertToDTO(category);
    }

}
