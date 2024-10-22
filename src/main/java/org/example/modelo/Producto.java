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
    @ManyToOne // Cambiado a ManyToOne
    @JoinColumn(name = "tipo")
    TipoProducto tipo;



}
