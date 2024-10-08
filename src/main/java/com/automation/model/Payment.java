package com.automation.model;

public class Payment {
    private static PersonalDetail personalDetail =  new PersonalDetail();

    public Payment() {
    }

    public static void setPersonalDetail(PersonalDetail personalDetail) {
        Payment.personalDetail = personalDetail;
    }

    public static PersonalDetail getPersonalDetail() {
        return personalDetail;
    }

    public static PersonalDetail dataPersonalDetail(){
        personalDetail.setFirstName("Liliana");
        personalDetail.setLastName("Chacha");
        personalDetail.setEmail("lfcb@hotmail.es");
        personalDetail.setTelephone("0993556202");
        personalDetail.setCompany("Mi compania");
        personalDetail.setAddress1("El Inca");
        personalDetail.setAddress2("");
        personalDetail.setCity("Quito");
        personalDetail.setPostCode("205025");
        personalDetail.setCountry("Ecuador");
        personalDetail.setState("Pichincha");

        return personalDetail;
    }
}
