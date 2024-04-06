package api.qa.techtorialwork.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @JsonIgnoreProperties(ignoreUnknown = true)
public class PJ_CompanyInformation {

    private String message;
    private PJ_CompanyData data;
}
