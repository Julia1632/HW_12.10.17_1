package com.example.user.test_backend_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.User.myapplication.backend.UserEndpoint;

public class UserActivity extends AppCompatActivity {

    private TextView mIdTextView;
    private EditText mInputIdEditText;

    private TextView mNameTextView;
    private EditText mInputNameEditText;

    private TextView mSurnameTextView;
    private EditText mInputSurnameEditText;

    private TextView mEmailTextView;
    private EditText mInputEmailEditText;

    private View mPushButton;
    private View mPullButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }

    @Override
    protected void onStart(){super.onStart();}
    private void initView() {
        mIdTextView=(TextView)findViewById(R.id.textViewId);
        mInputIdEditText=(EditText)findViewById(R.id.editTextId);

        mNameTextView=(TextView)findViewById(R.id.textViewName);
        mInputNameEditText=(EditText)findViewById(R.id.editTextName);

        mSurnameTextView=(TextView)findViewById(R.id.textViewSurname);
        mInputSurnameEditText=(EditText)findViewById(R.id.editTextSurname);

        mEmailTextView=(TextView)findViewById(R.id.textViewEmail);
        mInputEmailEditText=(EditText)findViewById(R.id.editTextEmail);

        mPushButton= findViewById(R.id.buttonPush);
        mPushButton=findViewById(R.id.buttonPush);

        mPullButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new UserListLoader().execute(UserActivity.this);
            }
        });

        mPushButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UserEndpoint userEndpoint=new UserEndpoint();
                String mId=mInputIdEditText.getText().toString();
                String mName=mInputNameEditText.getText().toString();
                String mSurname=mInputSurnameEditText.getText().toString();
                String mEmail=mInputEmailEditText.getText().toString();
                userEndpoint.insert(mId,mName,mSurname,mEmail);
            }
        });

    }
}

