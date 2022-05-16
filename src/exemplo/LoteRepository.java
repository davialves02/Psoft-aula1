package exemplo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoteRepository {

    private Map<String, Lote> lotes = new HashMap<>();

    public String addLote(Lote lote) {
        lotes.put(lote.getId(), lote);
        return lote.getId();
    }

    public void editarLote(Lote novoLote) {
        addLote(novoLote);
    }

    public Lote removeLote(String loteId) {
        Lote lote = lotes.get(loteId);
        lotes.remove(loteId);
        return lote;
    }

    public Lote recuperarLote(String loteId) {
        return lotes.get(loteId);
    }

    public List<Lote> getAll(){
        List<Lote> lote1 = new ArrayList<Lote>();

        for (String key: lotes.keySet()){
            Lote e1 = lotes.get(key);
            lote1.add(e1);
        }
        return  lote1;
    }

}