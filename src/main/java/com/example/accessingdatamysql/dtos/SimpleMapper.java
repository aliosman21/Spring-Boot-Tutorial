package com.example.accessingdatamysql.dtos;

import com.example.accessingdatamysql.subject.Subject;
import org.mapstruct.Mapper;


@Mapper
public interface SimpleMapper {
    Subject SubjectToDTO(SubjectDTO subjectDTO);
}
