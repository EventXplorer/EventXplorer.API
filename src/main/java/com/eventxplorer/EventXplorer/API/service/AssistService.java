package com.eventxplorer.EventXplorer.API.service;

import com.eventxplorer.EventXplorer.API.model.Assist;
import com.eventxplorer.EventXplorer.API.model.Category;

import java.util.List;

public interface AssistService {
    public abstract Assist createAssist(Assist assist);
    public abstract Assist updateAssist(Assist assist);
    public abstract List<Assist> getAllAssists();
    public abstract Assist getAssistById(String id);

}

