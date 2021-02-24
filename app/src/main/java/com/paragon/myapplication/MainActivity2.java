package com.paragon.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    TextView CountryName;
    Button previousbtn;
    Spinner CountrySpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        previousbtn = findViewById(R.id.previousbtnId);
        previousbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Going to Next activity", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity2.this, "It's Second Activity", Toast.LENGTH_SHORT).show();
            }
        });

        CountrySpinner = findViewById(R.id.CountrySpinnerID);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_single_choice, getCountry());

        CountrySpinner.setAdapter(arrayAdapter);

        CountrySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CountryName = findViewById(R.id.CountryNameResult);

                String result = parent.getSelectedItem().toString();
                CountryName = findViewById(R.id.CountryNameResult);
                CountryName.setText("Country is: " + result);
                CountryName.setVisibility(View.VISIBLE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

    public ArrayList<String> getCountry() {
        ArrayList<String> getCountries = new ArrayList<>();
        getCountries.add("Afghanistan");
        getCountries.add("Åland Islands");
        getCountries.add("Albania");
        getCountries.add("Algeria");
        getCountries.add("American Samoa");
        getCountries.add("Andorra");
        getCountries.add("Angola");
        getCountries.add("Anguilla");
        getCountries.add("Antarctica");
        getCountries.add("Antigua and Barbuda");
        getCountries.add("Argentina");
        getCountries.add("Armenia");
        getCountries.add("Aruba");
        getCountries.add("Australia");
        getCountries.add("Austria");
        getCountries.add("Azerbaijan");
        getCountries.add("Bahrain");
        getCountries.add("Bahamas");
        getCountries.add("Bangladesh");
        getCountries.add("Barbados");
        getCountries.add("Belarus");
        getCountries.add("Belgium");
        getCountries.add("Belize");
        getCountries.add("Benin");
        getCountries.add("Bermuda");
        getCountries.add("Bhutan");
        getCountries.add("Bolivia, Plurinational State of");
        getCountries.add("Bonaire, Sint Eustatius and Saba");
        getCountries.add("Bosnia and Herzegovina");
        getCountries.add("Botswana");
        getCountries.add("Bouvet Island");
        getCountries.add("Brazil");
        getCountries.add("British Indian Ocean Territory");
        getCountries.add("Brunei Darussalam");
        getCountries.add("Bulgaria");
        getCountries.add("Burkina Faso");
        getCountries.add("Burundi");
        getCountries.add("Cambodia");
        getCountries.add("Cameroon");
        getCountries.add("Canada");
        getCountries.add("Cape Verde");
        getCountries.add("Cayman Islands");
        getCountries.add("Central African Republic");
        getCountries.add("Chad");
        getCountries.add("Chile");
        getCountries.add("China");
        getCountries.add("Christmas Island");
        getCountries.add("Cocos (Keeling) Islands");
        getCountries.add("Colombia");
        getCountries.add("Comoros");
        getCountries.add("Congo");
        getCountries.add("Congo, the Democratic Republic of the");
        getCountries.add("Cook Islands");
        getCountries.add("Costa Rica");
        getCountries.add("Côte d'Ivoire");
        getCountries.add("Croatia");
        getCountries.add("Cuba");
        getCountries.add("Curaçao");
        getCountries.add("Cyprus");
        getCountries.add("Czech Republic");
        getCountries.add("Denmark");
        getCountries.add("Djibouti");
        getCountries.add("Dominica");
        getCountries.add("Dominican Republic");
        getCountries.add("Ecuador");
        getCountries.add("Egypt");
        getCountries.add("El Salvador");
        getCountries.add("Equatorial Guinea");
        getCountries.add("Eritrea");
        getCountries.add("Estonia");
        getCountries.add("Ethiopia");
        getCountries.add("Falkland Islands (Malvinas)");
        getCountries.add("Faroe Islands");
        getCountries.add("Fiji");
        getCountries.add("Finland");
        getCountries.add("France");
        getCountries.add("French Guiana");
        getCountries.add("French Polynesia");
        getCountries.add("French Southern Territories");
        getCountries.add("Gabon");
        getCountries.add("Gambia");
        getCountries.add("Georgia");
        getCountries.add("Germany");
        getCountries.add("Ghana");
        getCountries.add("Gibraltar");
        getCountries.add("Greece");
        getCountries.add("Greenland");
        getCountries.add("Grenada");
        getCountries.add("Guadeloupe");
        getCountries.add("Guam");
        getCountries.add("Guatemala");
        getCountries.add("Guernsey");
        getCountries.add("Guinea");
        getCountries.add("Guinea-Bissau");
        getCountries.add("Guyana");
        getCountries.add("Haiti");
        getCountries.add("Heard Island and McDonald Islands");
        getCountries.add("Holy See (Vatican City State)");
        getCountries.add("Honduras");
        getCountries.add("Hong Kong");
        getCountries.add("Hungary");
        getCountries.add("Iceland");
        getCountries.add("India");
        getCountries.add("Indonesia");
        getCountries.add("Iran, Islamic Republic of");
        getCountries.add("Iraq");
        getCountries.add("Ireland");
        getCountries.add("Isle of Man");
        getCountries.add("Israel");
        getCountries.add("Italy");
        getCountries.add("Jamaica");
        getCountries.add("Japan");
        getCountries.add("Jersey");
        getCountries.add("Jordan");
        getCountries.add("Kazakhstan");
        getCountries.add("Kenya");
        getCountries.add("Kiribati");
        getCountries.add("Korea, Democratic People's Republic of");
        getCountries.add("Korea, Republic of");
        getCountries.add("Kuwait");
        getCountries.add("Kyrgyzstan");
        getCountries.add("Lao People's Democratic Republic");
        getCountries.add("Latvia");
        getCountries.add("Lebanon");
        getCountries.add("Lesotho");
        getCountries.add("Liberia");
        getCountries.add("Libya");
        getCountries.add("Liechtenstein");
        getCountries.add("Lithuania");
        getCountries.add("Luxembourg");
        getCountries.add("Macao");
        getCountries.add("Macedonia, the Former Yugoslav Republic of");
        getCountries.add("Madagascar");
        getCountries.add("Malawi");
        getCountries.add("Malaysia");
        getCountries.add("Maldives");
        getCountries.add("Mali");
        getCountries.add("Malta");
        getCountries.add("Marshall Islands");
        getCountries.add("Martinique");
        getCountries.add("Mauritania");
        getCountries.add("Mauritius");
        getCountries.add("Mayotte");
        getCountries.add("Mexico");
        getCountries.add("Micronesia, Federated States of");
        getCountries.add("Moldova, Republic of");
        getCountries.add("Monaco");
        getCountries.add("Mongolia");
        getCountries.add("Montenegro");
        getCountries.add("Montserrat");
        getCountries.add("Morocco");
        getCountries.add("Mozambique");
        getCountries.add("Myanmar");
        getCountries.add("Namibia");
        getCountries.add("Nauru");
        getCountries.add("Nepal");
        getCountries.add("Netherlands");
        getCountries.add("New Caledonia");
        getCountries.add("New Zealand");
        getCountries.add("Nicaragua");
        getCountries.add("Niger");
        getCountries.add("Nigeria");
        getCountries.add("Niue");
        getCountries.add("Norfolk Island");
        getCountries.add("Northern Mariana Islands");
        getCountries.add("Norway");
        getCountries.add("Oman");
        getCountries.add("Pakistan");
        getCountries.add("Palau");
        getCountries.add("Palestine, State of");
        getCountries.add("Panama");
        getCountries.add("Papua New Guinea");
        getCountries.add("Paraguay");
        getCountries.add("Peru");
        getCountries.add("Philippines");
        getCountries.add("Pitcairn");
        getCountries.add("Poland");
        getCountries.add("Portugal");
        getCountries.add("Puerto Rico");
        getCountries.add("Qatar");
        getCountries.add("Réunion");
        getCountries.add("Romania");
        getCountries.add("Russian Federation");
        getCountries.add("Rwanda");
        getCountries.add("Saint Barthélemy");
        getCountries.add("Saint Helena, Ascension and Tristan da Cunha");
        getCountries.add("Saint Kitts and Nevis");
        getCountries.add("Saint Lucia");
        getCountries.add("Saint Martin (French part)");
        getCountries.add("Saint Pierre and Miquelon");
        getCountries.add("Saint Vincent and the Grenadines");
        getCountries.add("Samoa");
        getCountries.add("San Marino");
        getCountries.add("Sao Tome and Principe");
        getCountries.add("Saudi Arabia");
        getCountries.add("Senegal");
        getCountries.add("Serbia");
        getCountries.add("Seychelles");
        getCountries.add("Sierra Leone");
        getCountries.add("Singapore");
        getCountries.add("Sint Maarten (Dutch part)");
        getCountries.add("Slovakia");
        getCountries.add("Slovenia");
        getCountries.add("Solomon Islands");
        getCountries.add("Somalia");
        getCountries.add("South Africa");
        getCountries.add("South Georgia and the South Sandwich Islands");
        getCountries.add("South Sudan");
        getCountries.add("Spain");
        getCountries.add("Sri Lanka");
        getCountries.add("Sudan");
        getCountries.add("Suriname");
        getCountries.add("Svalbard and Jan Mayen");
        getCountries.add("Swaziland");
        getCountries.add("Sweden");
        getCountries.add("Switzerland");
        getCountries.add("Syrian Arab Republic");
        getCountries.add("Taiwan, Province of China");
        getCountries.add("Tajikistan");
        getCountries.add("Tanzania, United Republic of");
        getCountries.add("Thailand");
        getCountries.add("Timor-Leste");
        getCountries.add("Togo");
        getCountries.add("Tokelau");
        getCountries.add("Tonga");
        getCountries.add("Trinidad and Tobago");
        getCountries.add("Tunisia");
        getCountries.add("Turkey");
        getCountries.add("Turkmenistan");
        getCountries.add("Turks and Caicos Islands");
        getCountries.add("Tuvalu");
        getCountries.add("Uganda");
        getCountries.add("Ukraine");
        getCountries.add("United Arab Emirates");
        getCountries.add("United Kingdom");
        getCountries.add("United States");
        getCountries.add("United States Minor Outlying Islands");
        getCountries.add("Uruguay");
        getCountries.add("Uzbekistan");
        getCountries.add("Vanuatu");
        getCountries.add("Venezuela, Bolivarian Republic of");
        getCountries.add("Viet Nam");
        getCountries.add("Virgin Islands, British");
        getCountries.add("Virgin Islands, U.S.");
        getCountries.add("Wallis and Futuna");
        getCountries.add("Western Sahara");
        getCountries.add("Yemen");
        getCountries.add("Zambia");
        getCountries.add("Zimbabwe");
        getCountries.add("Others");


        return getCountries;

    }
}