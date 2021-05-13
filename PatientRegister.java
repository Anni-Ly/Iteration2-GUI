package sample;

import java.util.ArrayList;

public class PatientRegister {
    // An arraylist that will hold the registered patients
    public ArrayList<Patient> patients;
    // Constructor - EXPLAIN
    public PatientRegister() {
        this.patients = new ArrayList<Patient>();
    }
    // The method should check if the patient already exists in the patients-list. If not, the patient should be added to the list.
    public void addPatient(Patient patient) throws Exception{
        // fill in code here
        Boolean contains = false;
        for (Patient patient1 : patients) {
            if (patient1.getCpr().equals(patient.getCpr())) {
                contains = true;
            };

        }

        if (! contains) {
            this.patients.add(patient);
        } else {
            throw new Exception("Already in list");
        }
    }
    // The method remove the patientToRemove from the patients list.
    public void removePatient(Patient patient) {
        if (this.patients.contains(patient)) {this.patients.remove(patient);}

    }

    public void printPatients() {
        // Fill in code here
        System.out.println("Number of patients: " + this.patients.size());
        for (Patient p : this.patients) {
            System.out.println("Name:" + p.getFirstName() +" "+ p.getLastName() + " - "+
                    "CoronaData" + p.getCoronaData() + " - " +
                    "CoronaLocation" + p.getCoronaLocation() + " - " +
                    "SensorData" + p.getSenorData() + " - " +
                    "CPR-number: " + p.getCpr() + " - " +
                    "Gender: " + p.getGender() +" - " +
                    "Age: " + p.getAge());

        }
    }

    public String listPatients() {

        String returnString;
        returnString="Number of patients: " + this.patients.size() +"\n\n";
        returnString+="+-------------+--------------------------------+--------+-----+------------------+----------------------------------------+\n";
        returnString+="| CPR-number  | Name                           | Gender | Age | Phone            | Email                                  |\n";
        returnString+="| Corona Data  | Corona Location                 | Sensor Data |                                                          |\n";
        returnString+="+=============+================================+========+=====+==================+========================================+\n";

        for (Patient p : this.patients) {
            String fullName = p.getFirstName()+" "+p.getLastName();

            String newLine = String.format("| %11s | %-30s | %-6s | %3d | %-16s | %-38s |\n",
                    p.getCpr(),fullName,p.getGender(),p.getAge(),p.getPhoneNumber(),p.getEmail(),p.getCoronaData(),p.getCoronaLocation(),p.getSenorData());
            String newLine2 = String.format("| %11s | %-30s | %-30s |\n",
                    p.getCoronaData(),p.getCoronaLocation(),p.getSenorData());
            returnString += newLine;
            returnString += newLine2;
            returnString+="+=============+================================+========+=====+==================+========================================+\n";

        }
        return returnString;
    }

    @Override
    public String toString() {
        return "PatientRegister{" +
                "patients=" + patients +
                '}';
    }
}
