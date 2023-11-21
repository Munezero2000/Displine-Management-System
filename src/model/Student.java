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
public class Student {
    private String studentId;
    private String studentNames;
    private Integer studentClass;
    private  String guardianNames;
    private String guardinaNumber;
    private String guardianEmail;
    private Integer Marks;
    private Integer status;

    public Student() {
    }

    public Student(String studentId, String studentNames, int studentClass, String guardianNames, String guardinaNumber, String guardianEmail, int Marks, int status) {
        this.studentId = studentId;
        this.studentNames = studentNames;
        this.studentClass = studentClass;
        this.guardianNames = guardianNames;
        this.guardinaNumber = guardinaNumber;
        this.guardianEmail = guardianEmail;
        this.Marks = Marks;
        this.status = status;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentNames() {
        return studentNames;
    }

    public void setStudentNames(String studentNames) {
        this.studentNames = studentNames;
    }

    public int getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(int studentClass) {
        this.studentClass = studentClass;
    }

    public String getGuardianNames() {
        return guardianNames;
    }

    public void setGuardianNames(String guardianNames) {
        this.guardianNames = guardianNames;
    }

    public String getGuardinaNumber() {
        return guardinaNumber;
    }

    public void setGuardinaNumber(String guardinaNumber) {
        this.guardinaNumber = guardinaNumber;
    }

    public String getGuardianEmail() {
        return guardianEmail;
    }

    public void setGuardianEmail(String guardianEmail) {
        this.guardianEmail = guardianEmail;
    }

    public Integer getMarks() {
        return Marks;
    }

    public void setMarks(int Marks) {
        this.Marks = Marks;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
    
}
