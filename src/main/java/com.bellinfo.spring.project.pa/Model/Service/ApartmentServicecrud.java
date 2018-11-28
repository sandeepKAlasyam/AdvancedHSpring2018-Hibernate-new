package com.bellinfo.spring.project.pa.Model.Service;



import com.bellinfo.spring.project.pa.Model.Model.ApartmentRent;

import java.util.List;

public interface ApartmentServicecrud {

        void addApartmentRent(ApartmentRent apartmentRent);

        void updateApartmentRent(ApartmentRent apartmentRent);

        List<ApartmentRent> getApartmentRents();

        ApartmentRent getApartmentRents(int id);

        void editApartmentRent(int id);

        void  deleteApartmentRent(int id);

}
