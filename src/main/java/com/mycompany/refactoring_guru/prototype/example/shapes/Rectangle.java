/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.refactoring_guru.prototype.example.shapes;


//Criação de uma classe publica com extenção da classe Shape com atributos Width e Height
public class Rectangle extends Shape {
    public int width;
    public int height;

    public Rectangle() {
    }
// serve pra chamar o construtor target da classe shape copiando agora os valores de Width e height para o novo objeto retangulo
    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
//Serve para comparar que os se os dois objetos Rectangle são iguais 
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Rectangle) || !super.equals(object2)) return false;
        Rectangle shape2 = (Rectangle) object2;
        return shape2.width == width && shape2.height == height;
    }
}