/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.refactoring_guru.prototype.example.shapes;

/**
 *
 * @author FATEC ZONA LESTE
 */
package refactoring_guru.prototype.example.shapes;

import java.util.Objects;

//Criação de uma classe publica com exteção da classe Shape com atributos Width e Height
//Criação de uma classe publica abstrata com valores x y e color
public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape() {
    }
//recebe o objeto shape como como parametro, copia os valores x y e color do atributo target(Se ele não for nulo) para novo objeto Shape
    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }
// 
    public abstract Shape clone();

    
    //Serve para comparar que os se os dois objetos Shape são iguais 
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape)) return false;
        Shape shape2 = (Shape) object2;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }
}