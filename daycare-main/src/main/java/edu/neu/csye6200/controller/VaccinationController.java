/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.controller;

import edu.neu.csye6200.model.Immunization;
import edu.neu.csye6200.service.VaccinationService;
import edu.neu.csye6200.util.TestDataUtilities;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class VaccinationController {
    @Autowired
    VaccinationService vaccinationService;

    public void addTestData(){
        vaccinationService.saveVaccinations(new TestDataUtilities().populateVaccineData("C:\\Users\\Jayanth\\Documents\\NetBeansProjects\\daycare-main\\src\\main\\resources\\vaccines.csv"));
    }

    public void displayAllVaccines(){
        vaccinationService.getAllVaccinations().forEach(System.out::println);
    }

    public List<Immunization> getAllVaccines(){
        return vaccinationService.getAllVaccinations();
    }
    public void removeVaccineById(Integer id){
        vaccinationService.deleteVaccinationsById(id);
    }
    public Optional<Immunization> getVaccinesById(Integer id){
        return vaccinationService.getVaccinationById(id);
    }

    public void addVaccine(String csv){
        vaccinationService.saveVaccination(csv);
    }
}
