package com.mycompany.myapp.my_module.application;

import com.mycompany.myapp.my_module.domain.MyModuleFactory;
import org.springframework.stereotype.Service;
import tech.jhipster.lite.module.domain.JHipsterModule;
import tech.jhipster.lite.module.domain.properties.JHipsterModuleProperties;

@Service
public class MyModuleApplicationService {

  private final MyModuleFactory factory;

  public MyModuleApplicationService() {
    factory = new MyModuleFactory();
  }

  public JHipsterModule buildModule(JHipsterModuleProperties properties) {
    return factory.buildModule(properties);
  }
}
