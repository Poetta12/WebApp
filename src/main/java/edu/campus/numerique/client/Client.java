package edu.campus.numerique.client;

import java.time.LocalDate;
import java.util.Objects;

public class Client {
    private Long id;
    private String lastName;
    private String firstName;
    private LocalDate birthDate;
    private String driverLicenseNb;

    // Constructeur
    public Client(Long id, String lastName, String firstName, LocalDate birthDate, String driverLicenseNb) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.driverLicenseNb = driverLicenseNb;
    }

    // Getters et setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    //public String getlastName() { return lastName; }
    public void setlastName(String lastName) { this.lastName = lastName; }

    public String getfirstName() { return firstName; }
    public void setfirstName(String firstName) { this.firstName = firstName; }

    public LocalDate getbirthDate() { return birthDate; }
    public void setbirthDate(LocalDate birthDate) { this.birthDate = birthDate; }

    public String getdriverLicenseNb() { return driverLicenseNb; }
    public void setdriverLicenseNb(String driverLicenseNb) { this.driverLicenseNb = driverLicenseNb; }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, firstName, birthDate, driverLicenseNb);
    }
}

