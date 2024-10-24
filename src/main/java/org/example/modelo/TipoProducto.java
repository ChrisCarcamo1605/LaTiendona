package org.example.modelo;

import lombok.*;

import jakarta.persistence.*;

@Entity
@Table(name = "TipoProductos")
@Getter
@Setter
@AllArgsConstructor

@EqualsAndHashCode(of = "id")
@Embeddable
public class TipoProducto{

    public TipoProducto(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    public TipoProducto(String nombre){
        this.nombre = nombre;
    }

    private String nombre;



}
