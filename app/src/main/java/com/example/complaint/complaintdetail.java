package com.example.complaint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class complaintdetail extends AppCompatActivity {
    EditText name,mobile,hostel,room,complaintdetail,date;
    Button submit;
    DatabaseReference StudentComplaint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaintdetail);
        name = findViewById(R.id.personname);
        mobile = findViewById(R.id.mobilenumber);
        hostel = findViewById(R.id.hostel);
        room = findViewById(R.id.room);
        complaintdetail = findViewById(R.id.complaintdetail);
        date = findViewById(R.id.complaintDate);

        StudentComplaint = FirebaseDatabase.getInstance().getReference().child("Complaints");

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertComplaintData();
            }
        });
    }
    private void insertComplaintData(){
        String Studentname = name.getText().toString();
        String MobileNumber = mobile.getText().toString();
        String HostelName = hostel.getText().toString();
        String RoomNo =  room.getText().toString();
        String Complaintdetail = complaintdetail.getText().toString();
        String Date = date.getText().toString();
        Complaint studentComplaint = new Complaint(Studentname,MobileNumber,HostelName,RoomNo,Complaintdetail,Date);

        StudentComplaint.push().setValue(studentComplaint);
        Toast.makeText(complaintdetail.this,"Complaint Submitted",Toast.LENGTH_SHORT).show();
    }
}