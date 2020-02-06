package me.mehadih.databindinginandroid;

import android.content.Context;
import android.widget.Toast;

/**
 * Created By - Mehadi
 * Created On - 2/6/2020 : 10:18 PM
 * Email - hi@mehadih.me
 * Website - www.mehadih.me
 */
public class ClickHandler {
    Context mContext;

    public ClickHandler(Context mContext) {
        this.mContext = mContext;
    }

    public void onViewButtonClick(String name) {
        Toast.makeText(mContext, "You just clicked: " + name, Toast.LENGTH_SHORT).show();
    }
}
