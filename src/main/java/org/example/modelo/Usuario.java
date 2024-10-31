/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.modelo;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "usuarios")
public class Usuario {
    
    
    public Usuario(String usuario,String correo, String password){
    this.usuario=usuario;
    this.email=correo;
    this.password=password;
        
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(unique = true, nullable = false)
    String usuario;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password; 

    @Column(nullable = true)
    private String recoveryCode;

    public Usuario(String email, String password) {
        this.email = email;
        this.password = password;     }
}

