/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UsuarioDao;
import dao.UsuarioDaoImp;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import model.Usuario;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

/**
 *
 * @author andrecamppos
 */

@ManagedBean
@SessionScoped
public class UsuarioController implements Serializable {
    
    private Usuario usuario;
 
    public UsuarioController() {
        usuario = new Usuario();
        SecurityContext context = SecurityContextHolder.getContext();
        if (context instanceof SecurityContext){
            Authentication authentication = context.getAuthentication();
            if (authentication instanceof Authentication){
                usuario.setUsername(((User)authentication.getPrincipal()).getUsername());
            }
        }
    }
    
    public void adicionarUsuario(ActionEvent actionEvent) {
        UsuarioDao dao = new UsuarioDaoImp();
        dao.save(usuario);
    }
    
    public void prepararAdicionarUsuario(ActionEvent actionEvent) {
        usuario = new Usuario();
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
        
}
