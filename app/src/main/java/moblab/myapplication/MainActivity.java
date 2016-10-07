package moblab.myapplication;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    public String IP="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    public void config (View view){
        EditText campoTexto = (EditText) findViewById(R.id.internetprotocol);
        IP = campoTexto.getText().toString();


    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Toast.makeText(this, "Configurações Aberta", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, ConfigActivity.class));
                break;
            case R.id.credits:
                Toast.makeText(this, "Créditos aberto", Toast.LENGTH_SHORT).show();
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Desenvolvedores: Charles Tim Batista Garrocho / José Eduardo de Souza / Jessé Pires Barbato Rocha").setTitle("Créditos");
                AlertDialog dialog = builder.create();
                dialog.show();
                break;
            default:
                break;
        }

        return true;
    }


}





