
import model.Autorizacao;
import model.Cliente;
import model.Empresa;
import model.FormaPagto;
import model.LocalTrabalho;
import model.Pedido;
import model.Solicitacao;
import model.Usuario;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andrecamppos
 */
public class Criarbanco {
    
    private static SessionFactory sessionFactory;
    
    public static void main(String[] args) {
        try {
            AnnotationConfiguration ac = new AnnotationConfiguration();
            ac.addAnnotatedClass(Cliente.class);
            ac.addAnnotatedClass(LocalTrabalho.class);
            ac.addAnnotatedClass(Empresa.class);
            ac.addAnnotatedClass(Solicitacao.class);
            ac.addAnnotatedClass(Pedido.class);
            ac.addAnnotatedClass(FormaPagto.class);
            ac.addAnnotatedClass(Autorizacao.class);
            ac.addAnnotatedClass(Usuario.class);
            sessionFactory = ac.configure().buildSessionFactory();
            SchemaExport se = new SchemaExport(ac);
            se.create(true, true);
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
}
