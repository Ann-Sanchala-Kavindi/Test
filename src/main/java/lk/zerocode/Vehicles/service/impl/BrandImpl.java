package lk.zerocode.Vehicles.service.impl;

import lk.zerocode.Vehicles.controller.request.BrandRequest;
import lk.zerocode.Vehicles.model.Brand;
import lk.zerocode.Vehicles.repository.BrandRepository;
import lk.zerocode.Vehicles.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
@Component
@Primary
public class BrandImpl implements BrandService {

    @Autowired
    private BrandRepository brandRepository;



    @Override
    public void create(BrandRequest brandRequest) {

        System.out.println("Service "+brandRequest.getName());

        Brand brand=new Brand();

        brand.setBrandId(brandRequest.getBrandId());
        brand.setName(brandRequest.getName());

        brandRepository.save(brand);



        //brandRepository.deleteById();

    }


}


