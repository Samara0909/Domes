package soraia.samara.duda.victor.domes.model;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class AvaliacoesActivityViewModel extends ViewModel {

    public List<Avaliacao> getAvaliacoes() {
        List<Avaliacao> avaliacoes = new ArrayList<>();

        Avaliacao a1 = new Avaliacao("Daniel Trindade", 4, "Muito bom");
        avaliacoes.add(a1);

        return avaliacoes;

    }
}
