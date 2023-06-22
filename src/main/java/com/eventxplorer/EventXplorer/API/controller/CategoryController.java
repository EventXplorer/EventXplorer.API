package com.eventxplorer.EventXplorer.API.controller;

import com.eventxplorer.EventXplorer.API.model.Category;
import com.eventxplorer.EventXplorer.API.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "https://eventxplorer-firebase-au-647bc.web.app")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    //EndPoint:http://localhost:8080/category
    //Method: GET
    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public ResponseEntity<Object> getAllCategories() {
        return new ResponseEntity<>(categoryService.getAllCategories(), HttpStatus.OK);
    }
    //EndPoint:http://localhost:8080/category
    //Method: POST
    @PostMapping("/category")
    public ResponseEntity<Object> createCategory(@RequestBody Category category) {
        categoryService.createCategory(category);
        return new ResponseEntity<>("Category is created successfully with name = " + category, HttpStatus.CREATED);
    }
    //EndPoint:http://localhost:8080/category/{id}
    //Method: GET
    @RequestMapping(value = "/category/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getCategoryById(@PathVariable("id") String id) {
        boolean  isExist = categoryService.isCategoryExist(id);
        if (!isExist){
            return new ResponseEntity<>("Category is not exist with id = " + id, HttpStatus.NOT_FOUND);
        }else{
            Category category = categoryService.getCategoryById(id);
            return new ResponseEntity<>(category, HttpStatus.OK);
        }
    }


}
