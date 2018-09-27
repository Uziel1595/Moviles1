package com.example.iowner.eva1_4_eventos;

import android.util.Log;
import android.view.View;

/**
 * Created by iOwner on 03/09/2018.
 */

public class ClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        Log.wtf("Desde clase","Evento click");
    }
}
