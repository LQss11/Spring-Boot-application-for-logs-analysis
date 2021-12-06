package com.pfa.elklogsswaggerrestfulapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfa.elklogsswaggerrestfulapi.model.Patient;
import com.pfa.elklogsswaggerrestfulapi.service.PatientService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/Rest/Api")
@Api(value="Patient Methods" , tags="Patient-Methods")//value and description
public class PatientController {
    
    
    @Autowired
    private PatientService patientService;
    
    /*-------------------------------------------Get ALL------------------------------------------------------*/
    
    @ApiOperation("Select all patients")
     @ApiResponses(value= {
                            @ApiResponse(code=200 , message="Everything's OK :D"),
                            @ApiResponse(code=401 , message="Authentication is required to complete the request."),
                            @ApiResponse(code=403 , message="Forbidden mean the server is not acknowledging any remote request."),
                            @ApiResponse(code=404 , message="Not found, but may available in future.")
                        })
    
    /*<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>*/
    
    @GetMapping("/DATGetPatient")
    public List<Patient> GetAllPatients()
    {
        return patientService.GetAllPatients() ;
    }
    
    /*-------------------------------------------Get ONE------------------------------------------------------*/
    
    @ApiOperation("Select an existing patient")
    @ApiResponses(value= {
                            @ApiResponse(code=200 , message="Everything's OK :D"),
                            @ApiResponse(code=401 , message="Authentication is required to complete the request."),
                            @ApiResponse(code=403 , message="Forbidden mean the server is not acknowledging any remote request."),
                            @ApiResponse(code=404 , message="Not found, but may available in future.")
                        })
    
    /*<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>*/
    
    @GetMapping("/DATGetPatient/{id}")
    public Optional<Patient> getPatient(@PathVariable Long id)
    {
     return patientService.getPatient(id);
    }
    
    /*-------------------------------------------POST ONE------------------------------------------------------*/
    
    @ApiOperation("Add a new patient")
    @ApiResponses(value= {
                            @ApiResponse(code=200 , message="Everything's OK :D"),
                            @ApiResponse(code=401 , message="Authentication is required to complete the request."),
                            @ApiResponse(code=403 , message="Forbidden mean the server is not acknowledging any remote request."),
                            @ApiResponse(code=404 , message="Not found, but may available in future."),
                            @ApiResponse(code=201 , message="The query has been completed, and a new resource is created because of the request.")
                        })
    
    /*<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>*/
    
    @PostMapping("/DATPostPatient")
    public void addPatient(@RequestBody List<Patient> patient)
    {
        patientService.addPatient(patient);
    }
    
    /*-------------------------------------------PUT ONE------------------------------------------------------*/
    
    @ApiOperation("Add or update an existing patient")
    @ApiResponses(value= {
                            @ApiResponse(code=200 , message="Everything's OK :D"),
                            @ApiResponse(code=401 , message="Authentication is required to complete the request."),
                            @ApiResponse(code=403 , message="Forbidden mean the server is not acknowledging any remote request."),
                            @ApiResponse(code=404 , message="Not found, but may available in future."),
                            @ApiResponse(code=201 , message="The query has been completed, and a new resource is created because of the request.")
                        })
    
    /*<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>*/
    
    @PutMapping("/DATPutPatient/{id}")
    public void updatePatient( @RequestBody List<Patient> patient, @PathVariable Long id)
    {
        patientService.updatePatient(id , patient);
    }
    
    /*-------------------------------------------DELETE ONE------------------------------------------------------*/
    
    @ApiOperation("Delete a specefic patient")
    @ApiResponses(value= {
                            @ApiResponse(code=200 , message="Everything's OK :D"),
                            @ApiResponse(code=401 , message="Authentication is required to complete the request."),
                            @ApiResponse(code=403 , message="Forbidden mean the server is not acknowledging any remote request."),
                            @ApiResponse(code=204 , message="There is no content")
                        })
    
    /*<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>*/
    
    @DeleteMapping("/DATDeletePatient/{id}")
    public void deletePatient(@PathVariable Long id)
    {
         patientService.deletePatient(id);
    }
  /*-----------------------------------------------------------------------------------------------------------*/  
}
