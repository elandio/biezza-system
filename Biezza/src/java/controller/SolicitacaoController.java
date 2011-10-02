/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.SolicitacaoDao;
import dao.SolicitacaoDaoImp;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import model.Solicitacao;

/**
 *
 * @author andrecamppos
 */

@ManagedBean
@SessionScoped
public class SolicitacaoController implements Serializable{
    
    private Solicitacao solicitacao;
    private DataModel solicitacaoList;
    
    public DataModel getListarSolicitacoes() {
        List<Solicitacao> list = new SolicitacaoDaoImp().solicitacaoList();
        solicitacaoList = new ListDataModel(list);
        return solicitacaoList;
    }
    
    public void prepararAdicionarSolicitacao(ActionEvent actionEvent) {
        solicitacao = new Solicitacao();
    }
    
    public void prepararAlterarSolicitacao(ActionEvent actionEvent) {
        solicitacao = (Solicitacao)(solicitacaoList.getRowData());
    }
    
    public String excluirSolicitacao() {
        Solicitacao solicitacaotemp = (Solicitacao)(solicitacaoList.getRowData());
        SolicitacaoDao dao = new SolicitacaoDaoImp();
        dao.remove(solicitacaotemp);
        return "index";
    }
    
    public void adicionarSolicitacao(ActionEvent actionEvent) {
        SolicitacaoDao dao = new SolicitacaoDaoImp();
        dao.save(solicitacao);
    }
    
    public void alterarSolicitacao(ActionEvent actionEvent) {
        SolicitacaoDao dao = new SolicitacaoDaoImp();
        dao.update(solicitacao);
    }

    /**
     * @return the solicitacao
     */
    public Solicitacao getSolicitacao() {
        return solicitacao;
    }

    /**
     * @param solicitacao the solicitacao to set
     */
    public void setSolicitacao(Solicitacao solicitacao) {
        this.solicitacao = solicitacao;
    }
        
}
