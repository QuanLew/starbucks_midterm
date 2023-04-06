
package com.example.springgumball;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;


/*

	https://docs.spring.io/spring-data/data-commons/docs/current/reference/html/#mapping.fundamentals
	https://www.baeldung.com/jpa-indexes

 */

@Entity 
@Table(indexes=@Index(name = "altIndex", columnList = "serialNumber", unique = true))
@Data
@RequiredArgsConstructor
class GumballModel {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    
    private String modelNumber ;
    @Column(nullable=false)
    private String serialNumber ;
    private Integer countGumballs ;
    
}

