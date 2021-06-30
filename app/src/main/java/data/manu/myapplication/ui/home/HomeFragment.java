package data.manu.myapplication.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import data.manu.myapplication.R;

public class HomeFragment extends Fragment {
    Intent intent;
Button button;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final Button button =root.findViewById(R.id.button);
        final Button button1 =root.findViewById(R.id.button1);
        final Button button2 =root.findViewById(R.id.button2);
        final Button button3 =root.findViewById(R.id.button3);
        final Button button4 =root.findViewById(R.id.button4);
        final Button button5 =root.findViewById(R.id.button5);
        final Button button6 =root.findViewById(R.id.button6);
        final Button button7 =root.findViewById(R.id.button7);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), pdfrender.class));
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), pdfrender1.class));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), pdfrender2.class));
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), pdfrender3.class));
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), pdfrender4.class));
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), pdfrender5.class));
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), pdfrender6.class));
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), pdfrender7.class));
            }
        });

        return root;
    }

}