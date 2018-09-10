package design;

public abstract class AbstractEmployee implements Employee{
    public final String founderName = "Matiur Rahman(Mafi)";
    static String address = "31-10, 37th Ave, LIC, NY";

    public void describeCompany() {
        System.out.println("About Three years ago from today " + founderName + " founded the company located at " + address + ".");
    }
    public abstract void describeCompany(String Mission);
}
