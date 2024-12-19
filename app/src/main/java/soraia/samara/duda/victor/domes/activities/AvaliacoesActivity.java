package soraia.samara.duda.victor.domes.activities;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import soraia.samara.duda.victor.domes.R;
import soraia.samara.duda.victor.domes.adapter.AvaliacoesAdapter;
import soraia.samara.duda.victor.domes.model.AvaliacoesActivityViewModel;

public class AvaliacoesActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_avaliacoes);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        AvaliacoesActivityViewModel mViewModel = new ViewModelProvider(AvaliacoesActivity.this).get(AvaliacoesActivityViewModel.class);

        AvaliacoesAdapter avaliacoesAdapter = new AvaliacoesAdapter(mViewModel.getAvaliacoes(), AvaliacoesActivity.this);

        RecyclerView rvAvaliacoes = findViewById(R.id.rvAvaliacoes);
        rvAvaliacoes.setAdapter(avaliacoesAdapter);

        rvAvaliacoes.setLayoutManager(new LinearLayoutManager(AvaliacoesActivity.this));
    }
}
