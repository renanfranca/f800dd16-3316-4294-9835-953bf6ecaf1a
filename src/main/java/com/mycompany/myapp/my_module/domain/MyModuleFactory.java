package com.mycompany.myapp.my_module.domain;

import tech.jhipster.lite.module.domain.JHipsterModule;
import tech.jhipster.lite.module.domain.file.JHipsterSource;
import tech.jhipster.lite.module.domain.properties.JHipsterModuleProperties;

import static tech.jhipster.lite.module.domain.JHipsterModule.*;

public class MyModuleFactory {

  private static final JHipsterSource SOURCE = from("my-module");

  public JHipsterModule buildModule(JHipsterModuleProperties properties) {
    //@formatter:off
    return moduleBuilder(properties)
      .files()
        .add(SOURCE.template("Dummy.java"), toSrcMainJava().append(properties.packagePath()).append("my_package").append("Dummy.java"))
        .and()
      .build();
    //@formatter:on
  }
}
