package com.practicas.jnb.practicas;


import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.Toast;

import java.util.zip.Inflater;

public class DialogoPassword extends DialogFragment {
    EditText text;

    public DialogoPassword(EditText text) {
        this.text = text;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder =
                new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();

        builder.setTitle(R.string.set_password)
                .setView(text)
                //.setView(inflater.inflate(R.layout.set_password, null))
                .setPositiveButton(R.string.aceptar, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        String pass = text.getText().toString();
                        Log.i("INFORMACION ", pass);
                        Toast toast = Toast.makeText(getContext(), "Password: "+pass, Toast.LENGTH_LONG);
                        toast.show();

                        dialog.cancel();
                    }
                });

        return builder.create();
    }
}
