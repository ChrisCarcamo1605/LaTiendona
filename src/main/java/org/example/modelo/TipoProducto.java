package org.example.modelo;

import lombok.*;

import jakarta.persistence.*;

@Entity
@Table(name = "TipoProductos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Embeddable
public class TipoProducto{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String nombre;



}
