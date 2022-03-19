package ma.cigma.dao;

import java.util.List;

import ma.cigma.models.Facture;

public interface IFactureDao {
    boolean save(Facture c) ;
    Facture update(Facture c);
    boolean deleteById(long idFacture);
    Facture findById(long idFacture);
    List<Facture> findAll();
}
