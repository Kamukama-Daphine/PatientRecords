package www.softcodes.patientrecords.ui.uploads;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import www.softcodes.patientrecords.R;

public class UploadsFragment extends Fragment {

    private UploadsViewModel uploadsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        uploadsViewModel =
                ViewModelProviders.of(this).get(UploadsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_uploads, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        uploadsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}