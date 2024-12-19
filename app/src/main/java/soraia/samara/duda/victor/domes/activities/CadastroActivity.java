package soraia.samara.duda.victor.domes.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
                if(nome.isEmpty()) {
                    Toast.makeText(CadastroActivity.this, "Campo nome vazio", Toast.LENGTH_LONG).show();
                    return;
                }

                EditText etEmail = (EditText)findViewById(R.id.etEmail);
                String email = etEmail.getText().toString();
                if(email.isEmpty()) {
                    Toast.makeText(CadastroActivity.this, "Campo email vazio", Toast.LENGTH_LONG).show();
                    return;
                }

                EditText etTelefone = (EditText)findViewById(R.id.etTelefone);
                String telefone = etTelefone.getText().toString();
                if(telefone.isEmpty()) {
                    Toast.makeText(CadastroActivity.this, "Campo telefone vazio", Toast.LENGTH_LONG).show();
                    return;
                }

                EditText etCpf = (EditText)findViewById(R.id.etCpf);
                String cpf = etCpf.getText().toString();
                if(cpf.isEmpty()) {
                    Toast.makeText(CadastroActivity.this, "Campo cpf vazio", Toast.LENGTH_LONG).show();
                    return;
                }

                EditText etCep = (EditText)findViewById(R.id.etCep);
                String cep = etCep.getText().toString();
                if(cep.isEmpty()) {
                    Toast.makeText(CadastroActivity.this, "Campo cep vazio", Toast.LENGTH_LONG).show();
                    return;
                }

                EditText etRua = (EditText)findViewById(R.id.etRua);
                String rua = etRua.getText().toString();
                if(rua.isEmpty()) {
                    Toast.makeText(CadastroActivity.this, "Campo rua vazio", Toast.LENGTH_LONG).show();
                    return;
                }

                EditText etBairro = (EditText)findViewById(R.id.etBairro);
                String bairro = etBairro.getText().toString();
                if(bairro.isEmpty()) {
                    Toast.makeText(CadastroActivity.this, "Campo bairro vazio", Toast.LENGTH_LONG).show();
                    return;
                }

                EditText etNumero = (EditText)findViewById(R.id.etNumero);
                String numero = etNumero.getText().toString();
                if(numero.isEmpty()) {
                    Toast.makeText(CadastroActivity.this, "Campo numero vazio", Toast.LENGTH_LONG).show();
                    return;
                }

                EditText etComplemento = (EditText)findViewById(R.id.etComplemento);
                String complemento = etComplemento.getText().toString();
                if(complemento.isEmpty()) {
                    Toast.makeText(CadastroActivity.this, "Campo complemento vazio", Toast.LENGTH_LONG).show();
                    return;
                }

                EditText etPassword = (EditText)findViewById(R.id.etPassword);
                String password = etPassword.getText().toString();
                if(password.isEmpty()) {
                    Toast.makeText(CadastroActivity.this, "Campo password vazio", Toast.LENGTH_LONG).show();
                    return;
                }



                Intent intent = new Intent(CadastroActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}