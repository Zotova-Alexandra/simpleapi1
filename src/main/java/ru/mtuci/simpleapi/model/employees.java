package ru.mtuci.simpleapi.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.SafeHtml;


import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class employees extends AbstractBaseEntity{
    @NotBlank
    @SafeHtml
    private String name;
    @NotBlank
    @SafeHtml
    private String last_name;
    @NotBlank
    @SafeHtml
    private String position;
    @NotNull
    private Integer department;
}
