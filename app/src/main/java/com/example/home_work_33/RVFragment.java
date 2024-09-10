package com.example.home_work_33;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.home_work_33.databinding.FragmentRVBinding;

import java.util.ArrayList;


public class RVFragment extends Fragment {
    private FragmentRVBinding binding;
    private ArrayList<Magicians> magicians = new ArrayList<>();


    private MagicianAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentRVBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new MagicianAdapter(magicians);
        binding.rvFirst.setAdapter(adapter);
        loadData();
    }

    private void loadData() {
        magicians.add(new Magicians("Satoru Gojo","Special grade", "https://www.google.com/imgres?q=gojo%20manga&imgurl=https%3A%2F%2Fi.pinimg.com%2F474x%2F57%2Ffe%2F2f%2F57fe2ffabafce9ff382268dd48bbd5d5.jpg&imgrefurl=https%3A%2F%2Fwww.pinterest.com%2Fpin%2Fgojo--579838520800947026%2F&docid=dnLL26hK3a_JTM&tbnid=GnExbircuXu5uM&vet=12ahUKEwi1kIHYn7aIAxUMLBAIHW_VHDkQM3oECFUQAA..i&w=386&h=373&hcb=2&ved=2ahUKEwi1kIHYn7aIAxUMLBAIHW_VHDkQM3oECFUQAA" ));
        magicians.add(new Magicians("Suguru Geto","Special grade","https://www.google.com/imgres?q=geto%20manga&imgurl=https%3A%2F%2Fi.pinimg.com%2F736x%2F82%2F2e%2F1c%2F822e1cae2d10fdda55f8d5f9d69f961a.jpg&imgrefurl=https%3A%2F%2Fwww.pinterest.com%2Fpin%2Fsuguru-geto--403142604161240341%2F&docid=pUnRyuVHGP2IOM&tbnid=Xq9p6ld1KYhIuM&vet=12ahUKEwi3tL_goLaIAxUYU1UIHQNrGCkQM3oECGQQAA..i&w=720&h=900&hcb=2&ved=2ahUKEwi3tL_goLaIAxUYU1UIHQNrGCkQM3oECGQQAA" ));
        magicians.add(new Magicians("Itadori Yuji", "First grade","https://www.google.com/imgres?q=itadori%20manga&imgurl=https%3A%2F%2Fi.pinimg.com%2F564x%2F2d%2F1d%2Fdb%2F2d1ddb5feb9f5d4cd6c5a7c024f324c7.jpg&imgrefurl=https%3A%2F%2Fin.pinterest.com%2Fpin%2F723038915178792555%2F&docid=jcNQ1vug8fPWRM&tbnid=ifGUvdug0lQVuM&vet=12ahUKEwj0hu69obaIAxVtGhAIHcrtEHsQM3oECBYQAA..i&w=487&h=650&hcb=2&ved=2ahUKEwj0hu69obaIAxVtGhAIHcrtEHsQM3oECBYQAA"));
        magicians.add(new Magicians("Maki Zenin", "Fourth grade","https://www.google.com/imgres?q=maki%20zenin%20manga%20icon&imgurl=https%3A%2F%2Fi.pinimg.com%2F474x%2Fc0%2F09%2F9f%2Fc0099f5c6f603e30a17ffb495775fce7.jpg&imgrefurl=https%3A%2F%2Fwww.pinterest.com%2Fpin%2Fmaki-zenin-icon--789326272193005153%2F&docid=_FFNysi1sRzJMM&tbnid=BClZ5C4qonHQlM&vet=12ahUKEwji6O_sobaIAxUDKBAIHRiQNAkQM3oECBwQAA..i&w=336&h=336&hcb=2&ved=2ahUKEwji6O_sobaIAxUDKBAIHRiQNAkQM3oECBwQAA"));
        magicians.add(new Magicians("Toji Fushiguro","Special grade","https://www.google.com/imgres?q=toji%20icon&imgurl=https%3A%2F%2Fi.pinimg.com%2F474x%2F26%2F54%2Fa9%2F2654a90808bdad5cb9b1960d814e06c9.jpg&imgrefurl=https%3A%2F%2Fwww.pinterest.com%2Fpin%2F789326272193719285%2F&docid=pLQJf2pPIqbkIM&tbnid=bA2iMULUSkzHpM&vet=12ahUKEwjn6vCWoraIAxXhDRAIHeRWAF4QM3oECBgQAA..i&w=322&h=324&hcb=2&ved=2ahUKEwjn6vCWoraIAxXhDRAIHeRWAF4QM3oECBgQAA"));
        magicians.add(new Magicians("Megumi Fushiguro","Second grade","https://www.google.com/imgres?q=megumi%20manga%20icon&imgurl=https%3A%2F%2F64.media.tumblr.com%2F50f76e9d7ceb1f084f64f43eddda2e00%2F825529834c893680-8a%2Fs1280x1920%2F5848770ec20a3199a7e05b3d9dbb5313a4c3fc8c.jpg&imgrefurl=https%3A%2F%2Fmangaterial.tumblr.com%2Fpost%2F622657715762774016%2Ffushiguro-megumimanga-icons-pls-like-if-you-save&docid=nYdMGUwHr1QzzM&tbnid=sfHTQwVSWwg96M&vet=12ahUKEwjhmcPooraIAxWwJxAIHUOFJTEQM3oECBYQAA..i&w=1280&h=1280&hcb=2&ved=2ahUKEwjhmcPooraIAxWwJxAIHUOFJTEQM3oECBYQAA"));
    }
}