package lk.zerocode.Vehicles.controller;


import lk.zerocode.Vehicles.controller.request.BrandRequest;
import lk.zerocode.Vehicles.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class BrandController {

    @Autowired
    private BrandService brandService;

    @PostMapping(value="/brands")
    public void create(@RequestBody BrandRequest brandRequest){

//        System.out.println("Brand created");
//
//        System.out.println(brandRequest.getBrandId());
//        System.out.println(brandRequest.getName());


        //pass to service
        brandService.create(brandRequest);

    }

    @GetMapping(value="/brands/{brand-id}")
    public void getById(@PathVariable ("brand-id") Long id){

        //System.out.println("Brand Id"+id);

        brandService.findById(id);


    }












}
