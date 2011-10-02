/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author andrecamppos
 */

@Entity
public class Usuario implements Serializable {
    
    @Id
    private String username;
    private String password;
    @Column(name = "enable", columnDefinition = "BOOLEAN")
    private boolean enable;
    
    @OneToMany
    private List<Autorizacao> autorizacoes;
    @OneToOne
    private Cliente cliente;
    
    public Usuario() {}

    public Usuario(String username, String password, boolean enable, List<Autorizacao> autorizacoes) {
        this.username = username;
        this.password = password;
        this.enable = enable;
        this.autorizacoes = autorizacoes;
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
     * @return the enable
     */
    public boolean isEnable() {
        return enable;
    }

    /**
     * @param enable the enable to set
     */
    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the autorizacoes
     */
    public List<Autorizacao> getAutorizacoes() {
        return autorizacoes;
    }

    /**
     * @param autorizacoes the autorizacoes to set
     */
    public void setAutorizacoes(List<Autorizacao> autorizacoes) {
        this.autorizacoes = autorizacoes;
    }
    
}
