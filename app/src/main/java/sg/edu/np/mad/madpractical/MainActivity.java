package sg.edu.np.mad.madpractical;

import static android.view.View.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button flbutton = findViewById(R.id.fllwbutton);
        User u = initUser();
        setText(u,flbutton);
        flbutton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(u.followed == true){
                    u.followed = false;
                }
                else{
                    u.followed = true;
                }
                setText(u,flbutton);
            }
        });
    }

    //initialize user
    public User initUser(){
        User u = new User("username","desc",1,true);
        return u;
    }

    // setting the text based on the condition
    public void setText(User u,Button flbutton){
        TextView txt = flbutton;
        if(u.followed == true){
            txt.setText("Follow");
        }
        else{
            txt.setText("Unfollow");
        }
    }
}