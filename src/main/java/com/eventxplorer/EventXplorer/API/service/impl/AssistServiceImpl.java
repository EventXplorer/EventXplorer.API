package com.eventxplorer.EventXplorer.API.service.impl;

import com.eventxplorer.EventXplorer.API.model.Assist;
import com.eventxplorer.EventXplorer.API.repository.AssistRepository;
import com.eventxplorer.EventXplorer.API.service.AssistService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class AssistServiceImpl implements AssistService {
    @Autowired
    private AssistRepository assistRepository;

    @Override
    public Assist createAssist(Assist assist) {
        return assistRepository.save(assist);
    }
    @Override
    public Assist updateAssist(Assist assist) {
        return assistRepository.save(assist);
    }
    @Override
    public Assist getAssistById(String id) {
        return assistRepository.findById(id).get();
    }
    @Override
    public List<Assist> getAllAssists() {
        return (List<Assist>) assistRepository.findAll();
    }



}
