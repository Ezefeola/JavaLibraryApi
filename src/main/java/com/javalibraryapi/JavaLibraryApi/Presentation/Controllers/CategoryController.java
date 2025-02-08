package com.javalibraryapi.JavaLibraryApi.Presentation.Controllers;

import com.javalibraryapi.JavaLibraryApi.Application.Services.Interfaces.ICategoryService;
import com.javalibraryapi.JavaLibraryApi.Domain.Models.Category;
import com.javalibraryapi.JavaLibraryApi.Shared.DTOs.Category.CategoryPostRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/api/")
public class CategoryController {

    @Autowired
    private ICategoryService _categoryService;

    @PostMapping("post/category")
    public ResponseEntity<Category> createCategory(@RequestBody CategoryPostRequestDto categoryPostRequestDto) throws ExecutionException, InterruptedException {
//        CompletableFuture<Category> savedCategory = _categoryService.saveCategory(category);
        Category categoryToSave = new Category();

        categoryToSave.setName(categoryPostRequestDto.name);

        Category savedCategory = _categoryService.saveCategory(categoryToSave);
//        return ResponseEntity.status(201).body(savedCategory.get());
        return ResponseEntity.status(201).body(savedCategory);
    }

    @GetMapping("get/categories")
//    public ResponseEntity<CompletableFuture<List<Category>>> getAllCategories() {
    public ResponseEntity<List<Category>> getAllCategories() {
//        CompletableFuture<List<Category>> categories = _categoryService.getAllCategoriesAsync();
        List<Category> categories = _categoryService.getAllCategoriesAsync();
        return ResponseEntity.ok(categories);
    }

    @DeleteMapping()
    public ResponseEntity<Optional<Category>> deleteCategoryById(@RequestBody Long id) {
        return ResponseEntity.ok(_categoryService.deleteCategory(id));
    }
}
