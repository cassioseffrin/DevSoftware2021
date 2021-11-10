


package uncfarmacia.trabalhocassio.group3.farmaciadrawer.ui.employe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import uncfarmacia.trabalhocassio.group3.farmaciadrawer.R;
import uncfarmacia.trabalhocassio.group3.farmaciadrawer.databinding.ActivityMainBinding;
import android.app.ProgressDialog;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;



public class EmployeActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    ArrayList<String> clientsList;
    ArrayAdapter<String> listAdapter;
    Handler mainHandler = new Handler();
    ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employe);

        iniciarListaClientes();
        new  FetchData().start();
    }

    private void iniciarListaClientes() {
        clientsList = new ArrayList<>();
        ListView lv = (ListView) findViewById(R.id.listEmployes);
        listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,clientsList);
        lv.setAdapter(listAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    class FetchData extends Thread{
        String data="";
        @Override
        public void run(){
            mainHandler.post(new Runnable() {
                @Override
                public void run() {
                    progressDialog = new ProgressDialog(EmployeActivity.this);
                    progressDialog.setMessage("Carregando funcionarios...");
                    progressDialog.setCancelable(false);
                    progressDialog.show();
                }
            });
            try {
                URL url =  new URL("http://localhost/api/cliente/listaClientes");
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                String line;

                while ((line=bufferedReader.readLine() )!=null){
                    data = data+line;
                }

                if (!data.isEmpty()){
                    JSONArray clients = new JSONArray(data);
                    clientsList.clear();
                    for (int i =0 ; i< clients.length(); i++){

                        JSONObject nomes = clients.getJSONObject(i);

                        String nome = nomes.getString("nome");
                        clientsList.add (nome);
                    }
                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e){
                e.printStackTrace();
            }


            // fechar o progresso
            mainHandler.post(new Runnable() {
                @Override
                public void run() {
                    if (progressDialog.isShowing()){
                        progressDialog.dismiss();
                    }
                    listAdapter.notifyDataSetChanged();
                }
            });
        }
    }
}