package com.javalibraryapi.JavaLibraryApi.Application.Services;

import com.javalibraryapi.JavaLibraryApi.Application.Services.Interfaces.ICategoryService;
import com.javalibraryapi.JavaLibraryApi.Domain.Models.Category;
import com.javalibraryapi.JavaLibraryApi.Infrastructure.Repositories.Interfaces.ICategoryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@Service
public class CategoryService implements ICategoryService {
//    @Autowired
    private final ICategoryRepository _categoryRepository;

    public CategoryService(ICategoryRepository categoryRepository) {
        _categoryRepository = categoryRepository;
    }

//    @Async
//    public CompletableFuture<Category> saveCategory(Category category) {
    public Category saveCategory(Category category) {
//    return CompletableFuture.completedFuture(_categoryRepository.save(category));
    return _categoryRepository.save(category);
    }

//    @Async
//    public CompletableFuture<List<Category>> getAllCategoriesAsync() {
        public List<Category> getAllCategoriesAsync() {
         List<Category> categories = _categoryRepository.findAll();

//        return CompletableFuture.completedFuture(categories);
        return categories;
    }

    @Async
    public CompletableFuture<Optional<Category>> getCategoryByIdAsync(Long id) {
        Optional<Category> category = _categoryRepository.findById(id);
        return CompletableFuture.completedFuture(category);
    }

    public Optional<Category> deleteCategory(Long id) {
        Optional<Category> categoryInDb = _categoryRepository.findById(id);

        _categoryRepository.deleteById(id);
        return categoryInDb;
    }
}