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

import com.pfa.elklogsswaggerrestfulapi.model.Docteur;
import com.pfa.elklogsswaggerrestfulapi.service.DocteurService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/Rest/Api")
@Api(value="Docteur Methods" , tags="Docteur-Methods")//value and description
public class DocteurController {
    
    // Creating a logger object for this class and use it to generate logs
    private static final Logger logger = LoggerFactory.getLogger(DocteurService.class);    
    
    @Autowired
    private DocteurService docteurService;
    
    /*-------------------------------------------Get ALL------------------------------------------------------*/
    
    @ApiOperation("Select all docteurs")
     @ApiResponses(value= {
                            @ApiResponse(code=200 , message="Everything's OK :D"),
                            @ApiResponse(code=401 , message="Authentication is required to complete the request."),
                            @ApiResponse(code=403 , message="Forbidden mean the server is not acknowledging any remote request."),
                            @ApiResponse(code=404 , message="Not found, but may available in future.")
                        })
    
    /*<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>*/
    
    @GetMapping("/DATGetDocteur")
    public List<Docteur> GetAllDocteurs()
    {
        logger.info("Getting all Doctors.");

        return docteurService.GetAllDocteurs() ;
    }
    
    /*-------------------------------------------Get ONE------------------------------------------------------*/
    
    @ApiOperation("Select an existing docteur")
    @ApiResponses(value= {
                            @ApiResponse(code=200 , message="Everything's OK :D"),
                            @ApiResponse(code=401 , message="Authentication is required to complete the request."),
                            @ApiResponse(code=403 , message="Forbidden mean the server is not acknowledging any remote request."),
                            @ApiResponse(code=404 , message="Not found, but may available in future.")
                        })
    
    /*<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>*/
    
    @GetMapping("/DATGetDocteur/{id}")
    public Optional<Docteur> getDocteur(@PathVariable Long id)
    {
        logger.info("Getting one doctor.");

     return docteurService.getDocteur(id);
    }
    
    /*-------------------------------------------POST ONE------------------------------------------------------*/
    
    @ApiOperation("Add a new docteur")
    @ApiResponses(value= {
                            @ApiResponse(code=200 , message="Everything's OK :D"),
                            @ApiResponse(code=401 , message="Authentication is required to complete the request."),
                            @ApiResponse(code=403 , message="Forbidden mean the server is not acknowledging any remote request."),
                            @ApiResponse(code=404 , message="Not found, but may available in future."),
                            @ApiResponse(code=201 , message="The query has been completed, and a new resource is created because of the request.")
                        })
    
    /*<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>*/
    
    @PostMapping("/DATPostDocteur")
    public void addDocteur(@RequestBody List<Docteur> docteur)
    {
        logger.info("Adding doctor.");

        docteurService.addDocteur(docteur);
    }
    
    /*-------------------------------------------PUT ONE------------------------------------------------------*/
    
    @ApiOperation("Add or update an existing docteur")
    @ApiResponses(value= {
                            @ApiResponse(code=200 , message="Everything's OK :D"),
                            @ApiResponse(code=401 , message="Authentication is required to complete the request."),
                            @ApiResponse(code=403 , message="Forbidden mean the server is not acknowledging any remote request."),
                            @ApiResponse(code=404 , message="Not found, but may available in future."),
                            @ApiResponse(code=201 , message="The query has been completed, and a new resource is created because of the request.")
                        })
    
    /*<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>*/
    
    @PutMapping("/DATPutDocteur/{id}")
    public void updateDocteur( @RequestBody List<Docteur> docteur, @PathVariable Long id)
    {
        logger.info("Updating doctor.");

        docteurService.updateDocteur(id , docteur);
    }
    
    /*-------------------------------------------DELETE ONE------------------------------------------------------*/
    
    @ApiOperation("Delete a specefic docteur")
    @ApiResponses(value= {
                            @ApiResponse(code=200 , message="Everything's OK :D"),
                            @ApiResponse(code=401 , message="Authentication is required to complete the request."),
                            @ApiResponse(code=403 , message="Forbidden mean the server is not acknowledging any remote request."),
                            @ApiResponse(code=204 , message="There is no content")
                        })
    
    /*<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>*/
    
    @DeleteMapping("/DATDeleteDocteur/{id}")
    public void deleteDocteur(@PathVariable Long id)
    {
        logger.info("Deleting doctor.");

         docteurService.deleteDocteur(id);
    }
  /*-----------------------------------------------------------------------------------------------------------*/
}
