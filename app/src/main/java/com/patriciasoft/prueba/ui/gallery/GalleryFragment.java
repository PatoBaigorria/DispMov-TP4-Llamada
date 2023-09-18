package com.patriciasoft.prueba.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.patriciasoft.prueba.R;
import com.patriciasoft.prueba.databinding.FragmentGalleryBinding;


    public class GalleryFragment extends Fragment {

        private FragmentGalleryBinding binding;


        public View onCreateView(@NonNull LayoutInflater inflater,
                                 ViewGroup container, Bundle savedInstanceState) {
            binding = FragmentGalleryBinding.inflate(inflater, container, false);
            View root = binding.getRoot();

            //Subir foto sin ViewModel
            binding.miFoto.setImageResource(R.drawable.yo);

            return root;
        }

        @Override
        public void onDestroyView() {
            super.onDestroyView();
            binding = null;
        }
    }