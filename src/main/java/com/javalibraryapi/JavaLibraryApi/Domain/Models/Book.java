package com.javalibraryapi.JavaLibraryApi.Domain.Models;

import jakarta.persistence.*;

@Entity
@Table(name="Books")
public class Book extends BaseModel {
    private String Name;
    private Double price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category Category;
}
