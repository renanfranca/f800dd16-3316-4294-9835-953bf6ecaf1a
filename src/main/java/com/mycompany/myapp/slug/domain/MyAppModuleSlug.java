package com.mycompany.myapp.slug.domain;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import tech.jhipster.lite.module.domain.resource.JHipsterModuleSlugFactory;

public enum MyAppModuleSlug implements JHipsterModuleSlugFactory {
  MY_MODULE("my-module");

  private static final Map<String, MyAppModuleSlug> moduleSlugMap = Stream
    .of(values())
    .collect(Collectors.toMap(MyAppModuleSlug::get, Function.identity()));
  private final String slug;

  MyAppModuleSlug(String slug) {
    this.slug = slug;
  }

  @Override
  public String get() {
    return slug;
  }

  public static Optional<MyAppModuleSlug> fromString(String slug) {
    return Optional.ofNullable(moduleSlugMap.get(slug));
  }
}
