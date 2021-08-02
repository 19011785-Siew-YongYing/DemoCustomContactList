package sg.edu.rp.c346.id19011785.democustomcontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.CustomDescription;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    ArrayList<Contact> alContactL;
    CustomAdapter caContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.listViewContact);
        alContactL = new ArrayList<>();
        Contact c1 = new Contact("Mary", 65, 12345678, 'F');
        Contact c2 = new Contact("Ken", 65, 87654321, 'M');
        alContactL.add(c1);
        alContactL.add(c2);

        caContact = new CustomAdapter(this, R.layout.row, alContactL);
        lvContact.setAdapter(caContact);
    }
}