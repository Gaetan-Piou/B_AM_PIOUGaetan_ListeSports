package com.example.b_am_piougaetan_listesports;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import org.w3c.dom.Text;

import java.util.Objects;

public class SecondFragment extends Fragment {

    private TextView txt_Title = null;
    private TextView txt_Desc = null;
    private ImageView img_Mage = null;


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        txt_Title = view.findViewById(R.id.textview_title);
        txt_Desc = view.findViewById(R.id.textview_description);
        img_Mage = view.findViewById(R.id.img_Mage);

        /*assert getArguments() != null;
        Toast.makeText(getContext(), ""+getArguments().getInt("Position"), Toast.LENGTH_SHORT).show();*/
        adaptContent(view, getArguments().getInt("Position"));

        view.findViewById(R.id.button_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });
    }

    @SuppressLint("SetTextI18n")
    protected void adaptContent(View view, int i) {
        switch (i) {
            case 0:
                txt_Title.setText(getResources().getString(R.string.nomSport1));
                txt_Desc.setText(getResources().getString(R.string.descSport1));
                img_Mage.setImageResource(R.drawable.sport1);
                break;

            case 1:
                txt_Title.setText(getResources().getString(R.string.nomSport2));
                txt_Desc.setText(getResources().getString(R.string.descSport2));
                img_Mage.setImageResource(R.drawable.sport2);
                break;

            case 2:
                txt_Title.setText(getResources().getString(R.string.nomSport3));
                txt_Desc.setText(getResources().getString(R.string.descSport3));
                img_Mage.setImageResource(R.drawable.sport3);
                break;

            case 3:
                txt_Title.setText(getResources().getString(R.string.nomSport4));
                txt_Desc.setText(getResources().getString(R.string.descSport4));
                img_Mage.setImageResource(R.drawable.sport4);
                break;

            case 4:
                txt_Title.setText(getResources().getString(R.string.nomSport5));
                txt_Desc.setText(getResources().getString(R.string.descSport5));
                img_Mage.setImageResource(R.drawable.sport5);
                break;

            case 5:
                txt_Title.setText(getResources().getString(R.string.nomSport6));
                txt_Desc.setText(getResources().getString(R.string.descSport6));
                img_Mage.setImageResource(R.drawable.sport6);
                break;

            case 6:
                txt_Title.setText(getResources().getString(R.string.nomSport7));
                txt_Desc.setText(getResources().getString(R.string.descSport7));
                img_Mage.setImageResource(R.drawable.sport7);
                break;

            case 7:
                txt_Title.setText(getResources().getString(R.string.nomSport8));
                txt_Desc.setText(getResources().getString(R.string.descSport8));
                img_Mage.setImageResource(R.drawable.sport8);
                break;

            case 8:
                txt_Title.setText(getResources().getString(R.string.nomSport9));
                txt_Desc.setText(getResources().getString(R.string.descSport9));
                img_Mage.setImageResource(R.drawable.sport9);
                break;

        }
    }
}