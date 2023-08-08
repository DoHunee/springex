package com.multicampus.springex.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Qualifier("oracle")
public class SampleDAOO_Oracle_Impl implements SampleDAO{
}
