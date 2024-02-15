//package org.example;
//
//public class AlreadyExistsException extends RuntimeException {
//
//    public AlreadyExistsException(Product id) {
//        super("Product with id " + id + " already exists");
//    }
//}
//    public void add(Product product) {
//
//        for (Product id : products) {
//            if (product.getId() != product.id) {
//                return;
//            } else {
//                throw new AlreadyExistsException(id);
//            }
//        }
//
//        products = addToArray(products, product);
//    }
