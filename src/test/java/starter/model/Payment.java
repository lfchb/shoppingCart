package starter.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Payment {
    private static PersonalDetail personalDetail =  new PersonalDetail();

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
