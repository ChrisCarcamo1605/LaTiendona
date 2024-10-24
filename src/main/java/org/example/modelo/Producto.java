package org.example.modelo;


import lombok.*;

import jakarta.persistence.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

@Table(name = "Productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nombre;
    String descripcion;
    double precio;
    @ManyToOne
    @JoinColumn(name = "tipo")

    TipoProducto tipo;


    public Producto(String nombre, String descripcion, double precio, TipoProducto tipo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tipo = tipo;

    }



}
