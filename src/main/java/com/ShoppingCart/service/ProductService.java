package com.ShoppingCart.service;

import com.ShoppingCart.payload.request.ProductRequest;
import com.ShoppingCart.payload.response.ProductResponse;

public interface ProductService {

    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);

    public void deleteProductById(long productId);
}
