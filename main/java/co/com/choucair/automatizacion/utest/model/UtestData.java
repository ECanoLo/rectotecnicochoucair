package co.com.choucair.automatizacion.utest.model;


import org.nibor.autolink.internal.EmailScanner;

public class UtestData {
    private String usser_email;

    public String getusser_email() {
        return usser_email;
    }

    public void setusser_email(String usser_email) {
        this.usser_email = usser_email;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public String getStrCourse() {
        return strCourse;
    }

    public void setStrCourse(String strCourse) {
        this.strCourse = strCourse;
    }

    private String password;
    private String strCourse;
}
