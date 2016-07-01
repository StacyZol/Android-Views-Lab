package ga.demo.viewslab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button mButtonOne;
    Button mButtonTwo;
    Button mButtonThree;
    Button mButtonFour;
    Button mButtonFive;
    Button mButtonSix;
    Button mButtonSeven;
    Button mButtonEight;
    Button mButtonNine;
    Button mButtonTen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonOne = (Button) findViewById(R.id.button_one_button);
        View.OnClickListener buttonOnClickListener = new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.button_one_button) {
                    Toast.makeText(view.getContext(), "You clicked on the button below views one and two", Toast.LENGTH_SHORT).show();
                }
            }
        };
        mButtonOne.setOnClickListener(buttonOnClickListener);

        mButtonTwo = (Button) findViewById(R.id.button_two_button);
        View.OnClickListener buttonOnClickListenerTwo = new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.button_one_button) {
                    Toast.makeText(view.getContext(), "You clicked on the button below views three and four", Toast.LENGTH_SHORT).show();
                }
            }
        };
        mButtonTwo.setOnClickListener(buttonOnClickListenerTwo);
        mButtonThree = (Button) findViewById(R.id.button_three_button);
        View.OnClickListener buttonOnClickListenerThree = new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.button_three_button) {
                    Toast.makeText(view.getContext(), "You clicked on the button below views five and six", Toast.LENGTH_SHORT).show();
                }
            }
        };
        mButtonThree.setOnClickListener(buttonOnClickListenerThree);

        mButtonFour = (Button) findViewById(R.id.button_four_button);
        View.OnClickListener buttonOnClickListenerFour = new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.button_four_button) {
                    Toast.makeText(view.getContext(), "You clicked on the button below views seven and eight", Toast.LENGTH_SHORT).show();
                }
            }
        };
        mButtonFour.setOnClickListener(buttonOnClickListenerFour);


        mButtonFive = (Button) findViewById(R.id.button_five_button);
        View.OnClickListener buttonOnClickListenerFive = new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.button_five_button) {
                    Toast.makeText(view.getContext(), "You clicked on the button below views nine and ten", Toast.LENGTH_SHORT).show();
                }
            }
        };
        mButtonFive.setOnClickListener(buttonOnClickListenerFive);


        mButtonSix = (Button) findViewById(R.id.button_six_button);
        View.OnClickListener buttonOnClickListenerSix = new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.button_six_button) {
                    Toast.makeText(view.getContext(), "You clicked on the button below views eleven and twelve", Toast.LENGTH_SHORT).show();
                }
            }
        };
        mButtonSix.setOnClickListener(buttonOnClickListenerSix);


        mButtonSeven = (Button) findViewById(R.id.button_seven_button);
        View.OnClickListener buttonOnClickListenerSeven = new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.button_seven_button) {
                    Toast.makeText(view.getContext(), "You clicked on the button below views thirteen and fourteen", Toast.LENGTH_SHORT).show();
                }
            }
        };
        mButtonSeven.setOnClickListener(buttonOnClickListenerSeven);

        mButtonEight = (Button) findViewById(R.id.button_eight_button);
        View.OnClickListener buttonOnClickListenerEight = new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.button_eight_button) {
                    Toast.makeText(view.getContext(), "You clicked on the button below views fifteen and sixteen", Toast.LENGTH_SHORT).show();
                }
            }
        };
        mButtonEight.setOnClickListener(buttonOnClickListenerEight);


        mButtonNine = (Button) findViewById(R.id.button_nine_button);
        View.OnClickListener buttonOnClickListenerNine = new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.button_nine_button) {
                    Toast.makeText(view.getContext(), "You clicked on the button below views seventeen and eighteen", Toast.LENGTH_SHORT).show();
                }
            }
        };
        mButtonNine.setOnClickListener(buttonOnClickListenerNine);

        mButtonTen = (Button) findViewById(R.id.button_ten_button);
        View.OnClickListener buttonOnClickListenerTen = new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.button_ten_button) {
                    Toast.makeText(view.getContext(), "You clicked on the button below views nineteen and twenty", Toast.LENGTH_SHORT).show();
                }
            }
        };
        mButtonTen.setOnClickListener(buttonOnClickListenerTen);

    }
}
