/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.refactoring_guru.prototype.caching.cache;

import com.mycompany.refactoring_guru.prototype.example.shapes.Circle;
import com.mycompany.refactoring_guru.prototype.example.shapes.Rectangle;
import com.mycompany.refactoring_guru.prototype.example.shapes.Shape;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author FATEC ZONA LESTE
 */

// Crianção de uma classe publica com um Mapeamento do objeto Shape, Um construtor dando os valores dos objetos Shape, Circle e Rectangle e logo após inputando esses valores no cache
public class BundledShapeCache {
    private Map<String, Shape> cache = new HashMap<>();

    public BundledShapeCache() {
        Circle circle = new Circle();
        circle.x = 5;
        circle.y = 7;
        circle.radius = 45;
        circle.color = "Green";

        Rectangle rectangle = new Rectangle();
        rectangle.x = 6;
        rectangle.y = 9;
        rectangle.width = 8;
        rectangle.height = 10;
        rectangle.color = "Blue";

        cache.put("Big green circle", circle);
        cache.put("Medium blue rectangle", rectangle);
    }

    public Shape put(String key, Shape shape) {
        cache.put(key, shape);
        return shape;
    }

    public Shape get(String key) {
        return cache.get(key).clone();
    }
}