package com.example.thakursaurabh.jun28;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SQLdb sqldb;
    ArrayList<String> notes;
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sqldb = SQLdb.getInstance(getApplicationContext());

        FloatingActionButton addButton = findViewById(R.id.addnote);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogBox();
            }
        });

        if(sqldb.checkTable("noteslist")==false)
            sqldb.createTable();
        displayNotes();
    }

    private void openDialogBox() {

        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.dialog_box, null);
        dialogBuilder.setView(dialogView);

        final EditText newNote = (EditText) dialogView.findViewById(R.id.newnote);

        dialogBuilder.setTitle("Add new note");
        dialogBuilder.setPositiveButton("Add", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                sqldb.insert(newNote.getText().toString());
                displayNotes();
            }
        });
        dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                //pass
            }
        });
        AlertDialog b = dialogBuilder.create();
        b.show();
    }


    private void displayNotes(){
        notes = sqldb.getNotes();
        ListView notesList = findViewById(R.id.noteslist);
        if(!notes.isEmpty()) {
            arrayAdapter = new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,notes);
            notesList.setAdapter(arrayAdapter);
        } else {
            Toast.makeText(getApplicationContext(),"Notes list is empty",Toast.LENGTH_SHORT).show();
        }
    }

}
