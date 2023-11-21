package model;

/**
 *
 * @author Munezero
 */

public class Permission {
    private int permissionId;
    private String student;
    private String reason;
    private int Status;

    public Permission() {
    }
    
    public Permission(int permissionId, String student, String reason, int Status) {
        this.permissionId = permissionId;
        this.student = student;
        this.reason = reason;
        this.Status = Status;
    }

    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }
  }
