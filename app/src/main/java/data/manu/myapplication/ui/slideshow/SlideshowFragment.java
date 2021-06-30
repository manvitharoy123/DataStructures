package data.manu.myapplication.ui.slideshow;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import data.manu.myapplication.R;

public class SlideshowFragment extends Fragment {
    Button button;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        View fragment1View=inflater.inflate(R.layout.fragment_slideshow,container,false);
        button = (Button) fragment1View.findViewById(R.id.buttonSend);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), email.class));
            }
        });
        fragment1View.findViewById(R.id.Search).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1_np0XmcT6zL2ezbZYRVheSpAN5cGqqR5/view?usp=sharing"));
                startActivity(intent);
            }
        });
        fragment1View.findViewById(R.id.pdf).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://gumroad.com/l/vDgfS"));
                startActivity(intent);
            }
        });
        return fragment1View;
    }


}