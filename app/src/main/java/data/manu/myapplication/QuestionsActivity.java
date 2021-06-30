package data.manu.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import data.manu.myapplication.R;

public class QuestionsActivity extends AppCompatActivity {

    TextView tv;
    Button submitbutton, quitbutton;
    RadioGroup radio_g;
    RadioButton rb1,rb2,rb3,rb4;

    String questions[] = {
            "Which one of the below is divide and conquer approach?",
            "push() and pop() functions are found in",
            "A linked-list is a dynamic structure",
            "Maximum degree of any vertex in a simple graph of vertices n is",
            "Time complexity of Depth First Traversal of is",
            "In binary heap, whenever the root is removed then the rightmost element of last level is replaced by the root. Why?",
            "In C programming, when we remove an item from bottom of the stack, then −",
            "An empty list is the one which has no",
            "Which of the following ways is a pre-order traversal?",
            "On which principle does queue work?"
    };
    String answers[] = {"Merge Sort","stacks","true","n-1","Θ(|V|+|E|)","To make sure that it is still complete binary tree.","Stack will rearranged items","both","Root->left sub tree-> right sub tree","FIFO"};
    String opt[] = {
            "Insertion Sort","Merge Sort","Shell Sort","Heap Sort",
            "queues","stacks","trees","graphs",
            "true","false","both","none",
            "2n+2","n+2","n-2","n-1",
            "Θ(|V|+|E|)","Θ(|V|)","Θ(|E|)","Θ(|V|*|E|)",
            "It is the easiest possible way.","To make sure that it is still complete binary tree.*","Because left and right subtree might be missing.","none of these",
            "The stack will fall down","This operation is not allowed","Stack will rearranged items","It will convert to LIFO",
            "nodes","data","both","none",
            "Root->left sub tree-> right sub tree","Root->right sub tree-> left sub tree","right sub tree-> left sub tree->Root","none of these",
            "FILO","FIFO","LILO","none of these"
    };
    int flag=0;
    public static int marks=0,correct=0,wrong=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        final TextView score = (TextView)findViewById(R.id.textView4);
        TextView textView=(TextView)findViewById(R.id.DispName);
        Intent intent = getIntent();
        String name= intent.getStringExtra("myname");

        if (name.trim().equals(""))
            textView.setText("Hello User");
        else
            textView.setText("Hello " + name);

        submitbutton=(Button)findViewById(R.id.button3);
        quitbutton=(Button)findViewById(R.id.buttonquit);
        tv=(TextView) findViewById(R.id.tvque);

        radio_g=(RadioGroup)findViewById(R.id.answersgrp);
        rb1=(RadioButton)findViewById(R.id.radioButton);
        rb2=(RadioButton)findViewById(R.id.radioButton2);
        rb3=(RadioButton)findViewById(R.id.radioButton3);
        rb4=(RadioButton)findViewById(R.id.radioButton4);
        tv.setText(questions[flag]);
        rb1.setText(opt[0]);
        rb2.setText(opt[1]);
        rb3.setText(opt[2]);
        rb4.setText(opt[3]);
        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //int color = mBackgroundColor.getColor();
                //mLayout.setBackgroundColor(color);

                if(radio_g.getCheckedRadioButtonId()==-1)
                {
                    Toast.makeText(getApplicationContext(), "Please select one choice", Toast.LENGTH_SHORT).show();
                    return;
                }
                RadioButton uans = (RadioButton) findViewById(radio_g.getCheckedRadioButtonId());
                String ansText = uans.getText().toString();
//                Toast.makeText(getApplicationContext(), ansText, Toast.LENGTH_SHORT).show();
                if(ansText.equals(answers[flag])) {
                    correct++;
                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                }
                else {
                    wrong++;
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                }

                flag++;

                if (score != null)
                    score.setText(""+correct);

                if(flag<questions.length)
                {
                    tv.setText(questions[flag]);
                    rb1.setText(opt[flag*4]);
                    rb2.setText(opt[flag*4 +1]);
                    rb3.setText(opt[flag*4 +2]);
                    rb4.setText(opt[flag*4 +3]);
                }
                else
                {
                    marks=correct;
                    Intent in = new Intent(getApplicationContext(),ResultActivity.class);
                    startActivity(in);
                }
                radio_g.clearCheck();
            }
        });

        quitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ResultActivity.class);
                startActivity(intent);
            }
        });
    }

}