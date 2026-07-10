/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import clases.Usuario;

/**
 *
 * @author Avril
 */
public class GestionUsuario {
    private Usuario[] usuarios;

    public GestionUsuario() {
        usuarios = new Usuario[4];
        
        usuarios[0]= new Usuario("A0200582", "123456", "Administrador");
        usuarios[1]= new Usuario("AV201519", "111888", "Asesor de Ventas");
        usuarios[2]= new Usuario("GE202378", "222222", "Gerente");
    }
    
    public Usuario validarLogin (String usuario,String clave) {
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios [i].getUsuario().equals(usuario)&& usuarios [i].getClave().equals(clave)) {
                return usuarios [i];
            }
        }
        return null;
    }
    
    
}
