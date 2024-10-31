/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.infra.email;

import java.security.SecureRandom;
import javax.swing.JOptionPane;
import org.example.dao.UsuarioDAO;
import org.example.modelo.Usuario;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Christian
 */
public class UserService {

    private final UsuarioDAO usuarioDAO;
    private final EmailService emailService;

    public UserService(UsuarioDAO usuarioDAO, EmailService emailService) {
        this.usuarioDAO = usuarioDAO;
        this.emailService = emailService;
    }

    public boolean recoverPassword(String email) {
        Usuario usuario = usuarioDAO.findByEmail(email);
        if (usuario != null) {
            String recoveryCode = generateRecoveryCode();
            usuario.setRecoveryCode(recoveryCode);
            usuarioDAO.update(usuario);
            emailService.createEmail(usuario.getEmail(), "Cambio de Contraseña", "Codigo de verificación: " + recoveryCode);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "El correo no está registrado.");
            return false;
        }
    }

    public boolean recoverPassword(String email, String subject) {
        Usuario usuario = usuarioDAO.findByEmail(email);
        if (usuario != null) {
            String recoveryCode = generateRecoveryCode();
            usuario.setRecoveryCode(recoveryCode);
            usuarioDAO.update(usuario);
            emailService.createEmail(usuario.getEmail(), subject, "Codigo de verificación: " + recoveryCode);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "El correo no está registrado.");
            return false;
        }
    }

    public boolean verifyRecoveryCode(String email, String codigo) {
        Usuario usuario = usuarioDAO.findByEmail(email);

        System.out.println(codigo);
        if (usuario != null && usuario.getRecoveryCode().equals(codigo)) {
            JOptionPane.showMessageDialog(null, "Verificacion completada");
            return true;
        } else {

            JOptionPane.showMessageDialog(null, "Código inválido.");
            return false;
        }

    }

    public void resetPassword(String email, String newPassword) {
        Usuario usuario = usuarioDAO.findByEmail(email);
        if (usuario != null) {
            String hashedPassword = BCrypt.hashpw(newPassword, BCrypt.gensalt());
            usuario.setPassword(hashedPassword);
            usuario.setRecoveryCode(null);
            usuarioDAO.update(usuario);
            JOptionPane.showMessageDialog(null, "Contraseña Cambiada");

        } else {
            throw new RuntimeException("Usuario no encontrado.");
        }
    }

    public String generateRecoveryCode() {
        SecureRandom random = new SecureRandom();
        int code = random.nextInt(999999);
        return String.format("%06d", code);
    }

}
