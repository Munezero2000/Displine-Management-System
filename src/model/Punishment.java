/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Munezero
 */
public class Punishment {
    private int recid;
    private String student;
    private String Reason;
    private int daysofPunishment = 0;
    private int marksDeducted;
    private  String dateDone;
    private int inCharge;
    private int Status;

    public Punishment() {
    }

    public Punishment(String student, String Reason, int daysofPunishment, int marksDeducted, int inCharge, int Status) {
        this.student = student;
        this.Reason = Reason;
        this.daysofPunishment = daysofPunishment;
        this.marksDeducted = marksDeducted;
        this.dateDone = dateDone;
        this.inCharge = inCharge;
        this.Status = Status;
    }

    public int getRecid() {
        return recid;
    }

    public void setRecid(int recid) {
        this.recid = recid;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public int getDaysofPunishment() {
        return daysofPunishment;
    }

    public void setDaysofPunishment(int daysofPunishment) {
        this.daysofPunishment = daysofPunishment;
    }

    public int getMarksDeducted() {
        return marksDeducted;
    }

    public void setMarksDeducted(int marksDeducted) {
        this.marksDeducted = marksDeducted;
    }

    public String getDateDone() {
        return dateDone;
    }

    public void setDateDone(String dateDone) {
        this.dateDone = dateDone;
    }

    public int getInCharge() {
        return inCharge;
    }

    public void setInCharge(int inCharge) {
        this.inCharge = inCharge;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }
    
    
    
}
