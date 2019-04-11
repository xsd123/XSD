package com.example.xsdPro.service.impl;

import com.example.xsdPro.dao.ModuleMapper;
import com.example.xsdPro.model.Module;
import com.example.xsdPro.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModuleServiceImpl implements ModuleService {
    @Autowired
    private ModuleMapper moduleMapper;

    @Override
    public Module findAllByModuleId(int moduleId) {
        return moduleMapper.findAllByModuleId(moduleId);
    }
}
