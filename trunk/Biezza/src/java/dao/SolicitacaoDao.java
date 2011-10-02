/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Solicitacao;

/**
 *
 * @author andrecamppos
 */
public interface SolicitacaoDao {
    
    public void save(Solicitacao solicitacao);
    public Solicitacao getSolicitacao(Integer nuSolicitacao);
    public List<Solicitacao> solicitacaoList();
    public void remove(Solicitacao solicitacao);
    public void update(Solicitacao bansolicitacaod);
    
}
