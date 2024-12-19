package soraia.samara.duda.victor.domes.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import soraia.samara.duda.victor.domes.R;
import soraia.samara.duda.victor.domes.model.Avaliacao;

import androidx.annotation.NonNull;

import daniel.guilherme.isabelly.maria.solidarize.R;
import daniel.guilherme.isabelly.maria.solidarize.fragments.EventsFragment;
import soraia.samara.duda.victor.domes.activities.AvaliacoesActivity;

public class AvaliacoesAdapter extends RecyclerView.Adapter<AvaliacoesAdapter.EventViewHolder> {

    private List<Avaliacao> avaliacoes;
    private AvaliacoesActivity avaliacoesActivity;

    public AvaliacoesAdapter(List<Avaliacao> avaliacoes, AvaliacoesActivity avaliacoesActivity) {
        this.avaliacoes = avaliacoes;
        this.avaliacoesActivity = avaliacoesActivity;
    }

    public static class EventViewHolder extends RecyclerView.ViewHolder {
        public EventViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.avaliacao_item, parent, false);
        return new EventViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder holder, int position) {
        Avaliacao avaliacao = avaliacoes.get(position);

        TextView tvname = holder.itemView.findViewById(R.id.tvNome);
        tvname.setText(avaliacao.getNome());

        TextView tvAvaliacao = holder.itemView.findViewById(R.id.tvAvaliacao);
        tvAvaliacao.setText(avaliacao.getComentario());

        RatingBar ratingBar = holder.itemView.findViewById(R.id.ratingBar);
        ratingBar.setRating(avaliacao.getRating());
    }

    @Override
    public int getItemCount() {
        return avaliacoes.size();
    }
}

