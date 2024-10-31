package org.example.modelo;

import lombok.*;

import jakarta.persistence.*;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "TipoProducto")
public class TipoProducto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "tipo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Producto> productos;

    public TipoProducto(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre; // Representación del objeto
    }
}
