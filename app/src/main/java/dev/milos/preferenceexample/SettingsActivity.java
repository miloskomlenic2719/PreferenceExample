package dev.milos.preferenceexample;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {

    public static final String KEY_PREF_EXAMPLE_SWITCH = "example_switch";
    public static final String KEY_PREF_EXAMPLE_EDIT = "example_edit";
    public static final String KEY_PREF_EXAMPLE_CHECKBOX = "example_checkbox";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportFragmentManager().beginTransaction().replace(android.R.id.content, new SettingsFragment()).commit();

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        Boolean switchPref = sharedPreferences.getBoolean(SettingsActivity.KEY_PREF_EXAMPLE_SWITCH, false);
        String textPref = sharedPreferences.getString(SettingsActivity.KEY_PREF_EXAMPLE_EDIT, "None");
        Boolean checkBoxPref = sharedPreferences.getBoolean(SettingsActivity.KEY_PREF_EXAMPLE_CHECKBOX, false);

        Toast.makeText(this, switchPref.toString() + " " + textPref.toString() + " " + checkBoxPref.toString(), Toast.LENGTH_LONG).show();
    }




}
