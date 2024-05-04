/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.refactoring_guru.prototype.example.shapes;

//Criação de uma classe publica com extenção da classe Shape com atributo Radius
public class Circle extends Shape {
    public int radius;

    public Circle() {
    }
// serve pra chamar o construtor target da classe shape copiando agora o valor de radius do objeto para o novo objeto Circle
    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

        //Serve para comparar que os se os dois objetos Circle são iguais 
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle) || !super.equals(object2)) return false;
        Circle shape2 = (Circle) object2;
        return shape2.radius == radius;
    }
}