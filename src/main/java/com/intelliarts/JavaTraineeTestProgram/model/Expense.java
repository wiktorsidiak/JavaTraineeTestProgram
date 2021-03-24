package com.intelliarts.JavaTraineeTestProgram.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "expense")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "expense_id")
    private long id;
    @Column(name = "buying_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(name = "amount")
    private float amount;
    @Column(name = "currency")
    private String currency;
    @Column(name = "product")
    private String product;
}
