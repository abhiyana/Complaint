package com.example.complaint;

public class Complaint {

    String name, mobiel, hostel, room, complaint, date;

    public Complaint(String name, String mobiel, String hostel, String room, String complaint, String date) {
        this.name = name;
        this.mobiel = mobiel;
        this.hostel = hostel;
        this.room = room;
        this.complaint = complaint;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getMobiel() {
        return mobiel;
    }

    public String getHostel() {
        return hostel;
    }

    public String getRoom() {
        return room;
    }

    public String getComplaint() {
        return complaint;
    }

    public String getDate() {
        return date;
    }
}
