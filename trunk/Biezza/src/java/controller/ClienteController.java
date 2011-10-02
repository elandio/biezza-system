/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UsuarioDao;
import dao.UsuarioDaoImp;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import model.Cliente;
import model.Usuario;

/**
 *
 * @author andrecamppos
 */

@ManagedBean
@SessionScoped
public class ClienteController {
    
    private Cliente cliente;
    private Usuario usuario;
    
    public void adicionarCliente(ActionEvent actionEvent) {
        ClienteDao dao = new ClienteDaoImp();
        dao.save(cliente);
        UsuarioDao usuarioDao = new UsuarioDaoImp();
        usuario.setEnable(true);
        usuarioDao.save(usuario);
    }
    
    public String prepararAdicionarCliente() {
        cliente = new Cliente();
        usuario = new Usuario();
        return "cadastroUsuario";
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
