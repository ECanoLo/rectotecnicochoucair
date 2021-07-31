package co.com.choucair.automatizacion.utest.model;


import org.nibor.autolink.internal.EmailScanner;

public class UtestData {
    private String emailUser;

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }

    public String getStrCourse() {
        return strCourse;
    }

    public void setStrCourse(String strCourse) {
        this.strCourse = strCourse;
    }

    private String strPassword;
    private String strCourse;
}
