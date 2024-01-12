package com.mycompany.myapp.my_module.infrastructure.primary;

import static com.mycompany.myapp.slug.domain.MyAppModuleSlug.*;

import com.mycompany.myapp.my_module.application.MyModuleApplicationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.jhipster.lite.module.domain.resource.JHipsterModulePropertiesDefinition;
import tech.jhipster.lite.module.domain.resource.JHipsterModuleResource;

@Configuration
class MyModuleModuleConfiguration {

  @Bean
  JHipsterModuleResource myModule(MyModuleApplicationService myModules) {
    return JHipsterModuleResource
      .builder()
      .slug(MY_MODULE)
      .propertiesDefinition(JHipsterModulePropertiesDefinition.builder().addBasePackage().build())
      .apiDoc("Group", "This is my module")
      .standalone()
      .tags("server")
      .factory(myModules::buildModule);
  }
}

