package com.example.accessingdatamysql.dtos;

import com.example.accessingdatamysql.subject.Subject;

public class MapperImplementation implements SimpleMapper{
    @Override
    public Subject SubjectToDTO(SubjectDTO subjectDTO) {
        if(subjectDTO == null){
        return null;

        }
        Subject subjectEntity = new Subject();
        subjectEntity.setName( subjectDTO.getName() );
        return subjectEntity;
    }
}
