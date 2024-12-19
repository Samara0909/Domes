package soraia.samara.duda.victor.domes.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import soraia.samara.duda.victor.domes.R;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cadastro);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnCadastrar2 = (Button) findViewById(R.id.btnCadastrar2);

        btnCadastrar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etNome = (EditText)findViewById(R.id.etNome);
                String nome = etNome.getText().toString();

                EditText etEmail = (EditText)findViewById(R.id.etEmail);
                String email = etEmail.getText().toString();

                EditText etTelefone = (EditText)findViewById(R.id.etTelefone);
                String telefone = etTelefone.getText().toString();

                EditText etCpf = (EditText)findViewById(R.id.etCpf);
                String cpf = etCpf.getText().toString();

                EditText etCep = (EditText)findViewById(R.id.etCep);
                String cep = etCep.getText().toString();

                EditText etRua = (EditText)findViewById(R.id.etRua);
                String rua = etRua.getText().toString();

                EditText etBairro = (EditText)findViewById(R.id.etBairro);
                String bairro = etBairro.getText().toString();

                EditText etNumero = (EditText)findViewById(R.id.etNumero);
                String numero = etNumero.getText().toString();

                EditText etComplemento = (EditText)findViewById(R.id.etComplemento);
                String complemento = etComplemento.getText().toString();

                EditText etPassword = (EditText)findViewById(R.id.etConfirmPassword);
                String password = etPassword.getText().toString();

                Intent intent = new Intent(CadastroActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}