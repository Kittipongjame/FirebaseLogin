package android.mild.rpc.firebaselogin;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class MyAlerDialog {
    private AlertDialog.Builder objAlert;
    void NoChooseEveryThing(Context context){
        objAlert = new AlertDialog.Builder(context);
        objAlert.setIcon(R.drawable.x);
        objAlert.setTitle("Plaease Choose Answer ?");
        objAlert.setMessage("Plaease Choose Answer on Radiobutton");
        objAlert.setCancelable(false);
        objAlert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface,int i) {
                dialogInterface.dismiss();

            }
        });
        objAlert.show();
    }
}
