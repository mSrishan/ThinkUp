package com.msrishan.thinkup.programserviceapi.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document (value = "program")
public class Program {
    @Id
    private String id;
    private String name;
    private BigDecimal price;
    private Date startDate;
    private List<Subject> subjects;


}
