package uncfarmacia.trabalhocassio.group3.farmaciadrawer.ui.customer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;
import org.json.JSONObject;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;


import uncfarmacia.trabalhocassio.group3.farmaciadrawer.R;

public class FormActivity extends AppCompatActivity {
    EditText nome, cpf, rg, endereco, telefone;
    Button cancelar, salvar;
    AwesomeValidation validation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        Intent intent = getIntent();
        if (intent != null) {
            nome = findViewById(R.id.editTextTextPersonName);
            cpf = findViewById(R.id.editTextTextPersonCPF);
            rg = findViewById(R.id.editTextTextPersonRG);
            endereco = findViewById(R.id.editTextTextPersonEndereco);
            telefone = findViewById(R.id.editTextPhone2);
            String customer = intent.getStringExtra("customer");
            nome.setText(customer);
        } else {
            Toast.makeText(getApplicationContext(), "novo", Toast.LENGTH_SHORT).show();
        }

        validation = new AwesomeValidation(ValidationStyle.BASIC);
        validation.addValidation(this, R.id.editTextTextPersonName, RegexTemplate.NOT_EMPTY, R.string.invalid_name);
        //https://regexr.com/3dkvr
        validation.addValidation(this, R.id.editTextPhone2, "^1\\d\\d(\\d\\d)?$|^0800 ?\\d{3} ?\\d{4}$|^(\\(0?([1-9a-zA-Z][0-9a-zA-Z])?[1-9]\\d\\) ?|0?([1-9a-zA-Z][0-9a-zA-Z])?[1-9]\\d[ .-]?)?(9|9[ .-])?[2-9]\\d{3}[ .-]?\\d{4}$", R.string.invalid_fone);
        salvar = findViewById(R.id.savePerson);
        cancelar = findViewById(R.id.buttonCancel);

        cancelar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                }

        );


        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validation.validate()) {
                    JSONObject jsonCustomer = new JSONObject();
                    try {
                        jsonCustomer.put("nome", R.id.editTextTextPersonName);
                        jsonCustomer.put("cpf", R.id.editTextTextPersonCPF);
                        jsonCustomer.put("rg", R.id.editTextTextPersonRG);
                        jsonCustomer.put("endereco", R.id.editTextTextPersonEndereco);
                        jsonCustomer.put("telefone", R.id.editTextPhone2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    this.post(jsonCustomer);
                    Toast.makeText(getApplicationContext(), "Ok, cliente salvo!", Toast.LENGTH_LONG).show();
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Verifique os dados!", Toast.LENGTH_LONG).show();
                }
            }

            private String post(JSONObject jsonCustomer) {
                StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
                StrictMode.setThreadPolicy(policy);
                try {
                    URL url = new URL("http://localhost/api/cliente/salvar");
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestProperty("Accept", "application/json");
                    connection.setRequestProperty("Content-type", "application/json");
                    connection.setRequestMethod("POST");
                    connection.setDoInput(true);
                    OutputStream outputStream = connection.getOutputStream();
                    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                    writer.write(jsonCustomer.toString());
                    writer.flush();
                    writer.close();
                    outputStream.close();
                    connection.connect();
                    InputStream stream = connection.getInputStream();
                    return "Ok";
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }
        });
    }
}